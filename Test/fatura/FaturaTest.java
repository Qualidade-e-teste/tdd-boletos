package fatura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FaturaTest {

	static Fatura fatura;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		fatura = new Fatura("27/06/2021", 1500.00, "Cliente");
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
	void testStatus() {
		fatura.setStatus("PAGA");
		Assertions.assertEquals("PAGA", fatura.getStatus());
	}

}
