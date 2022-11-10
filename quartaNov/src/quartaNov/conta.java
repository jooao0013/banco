package quartaNov;

public class conta {

	int numeros;
	private double saldos;
	private static int valorAleatorio =1;
	
	void setSaque(double valor) {
		
		if(valor <= this.saldos) {
			this.saldos -= valor;
		}
	}

	double getSaldo() {
		return this.saldos;
	}
	public void setNumeroAleatorio() {
		this.numeros = valorAleatorio;
		valorAleatorio++;
	}
}


