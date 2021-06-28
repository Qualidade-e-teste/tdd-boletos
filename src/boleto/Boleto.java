package boleto;

public class Boleto {

	String data;
	double valor;
	long codigo;
	String status;

	public Boleto(long codigo, String data, double valor) {
		this.data = data;
		this.valor = valor;
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
