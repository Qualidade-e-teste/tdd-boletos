package boleto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoletoTest {
	
	static Boleto boleto;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		boleto = new Boleto(2021210601, "21/06/2021", 500.00);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testValor() {
		boleto.setValor(450.00);
		Assertions.assertEquals(450.00, boleto.getValor());
	}

}
