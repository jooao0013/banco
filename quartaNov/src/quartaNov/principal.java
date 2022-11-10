package quartaNov;

public class principal {

	public static void main(String[] args) {

		clientes cliente1 = new clientes("João", 1234);
		cliente1.Contas = new conta();
		cliente1.nome = "João";
		cliente1.numeroCPF = 1234;
		cliente1.Contas.numeros = 9999;
		
		conta conta1 = new conta();
		conta1.numeros = 888;

		clientes cliente2 = new clientes("Purge", 6655);
		cliente2.Contas = conta1;
		
		clientes cliente3 = new clientes("John", 2563);
		cliente3.Contas = conta1;
		
		cliente1.Contas.setSaque(100);
		
	}

}
