package processador;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProcessadorTest {

	static Fatura fatura1;
	static Fatura fatura2;
	static Fatura fatura3;
	static Boleto boleto1;
	static Boleto boleto2;
	static Boleto boleto3;
	static Processador processador;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		fatura1 = new Fatura("27/06/2021", 1500.00, "Cliente1");
		fatura2 = new Fatura("27/06/2021", 1500.00, "Cliente2");
		fatura3 = new Fatura("27/06/2021", 2000.00, "Cliente3");
		processador = new Processador();
	}

	@DisplayName("Soma dos boletos igual ao valor da fatura")
	@Test
	void testProcessamento1() {
		boleto1 = new Boleto(2021210601, "21/06/2021", 500.00);
		boleto2 = new Boleto(2021220602, "22/06/2021", 400.00);
		boleto3 = new Boleto(2021230603, "23/06/2021", 600.00);
		ArrayList boletos = new ArrayList();
		boletos.add(boleto1);
		boletos.add(boleto2);
		boletos.add(boleto3);
		processador.processaPagamentos(boletos);
		Assertions.assertAll(()-> assertEquals("PAGA", fatura1.getStatus()), () -> assertEquals(3, processador.getQtdePagamentos()));
	}

	@DisplayName("Soma dos boletos superior ao valor da fatura")
	@Test
	void testProcessamento2() {
		boleto1 = new Boleto(2021210601, "21/06/2021", 1000.00);
		boleto2 = new Boleto(2021220602, "22/06/2021", 500.00);
		boleto3 = new Boleto(2021230603, "23/06/2021", 250.00);
	}

	@DisplayName("Soma dos boletos inferior ao valor da fatura")
	@Test
	void testProcessamento3() {
		boleto1 = new Boleto(2021210601, "21/06/2021", 500.00);
		boleto2 = new Boleto(2021220602, "22/06/2021", 400.00);
	}

}