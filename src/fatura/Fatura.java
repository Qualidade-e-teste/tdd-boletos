package fatura;

public class Fatura {
	
	String data;
	double valor;
	String cliente;
	String status;

	public Fatura(String data, double valor, String cliente) {
		this.data = data;
		this.valor = valor;
		this.cliente = cliente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
