package quartaNov;

public class conta {

	int numeros;
	private double saldos;
	
	void setSaque(double valor) {
		
		if(valor <= this.saldos) {
			this.saldos -= valor;
		}
	}

	double getSaldo() {
		return this.saldos;
	}
}


