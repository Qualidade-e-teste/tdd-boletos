package processador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import boleto.Boleto;
import fatura.Fatura;

public class Processador {

	ArrayList<Pagamento> pagamentos;

	public Processador() {
		pagamentos = new ArrayList<Pagamento>();
	}

	public void processaPagamentos(ArrayList<Boleto> boletos, Fatura fatura) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
		LocalDate localDate = LocalDate.now();
		String today = dtf.format(localDate);
		double valor_total = 0;
		
		for (Boleto boleto : boletos) {
			Pagamento pag = new Pagamento(boleto.getValor(), today, "BOLETO");
			valor_total += boleto.getValor();
			pagamentos.add(pag);
		}
		
		if(valor_total >= fatura.getValor()) {
			fatura.setStatus("PAGA");
		}
	}
	
	public int getQtdePagamentos() {
		return pagamentos.size();
	}
}
