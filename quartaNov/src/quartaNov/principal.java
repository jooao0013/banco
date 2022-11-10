package quartaNov;

public class principal {

	public static void main(String[] args) {

		clientes cliente1 = new clientes();
		cliente1.Contas = new conta();
		cliente1.nome = "João";
		cliente1.numeroCPF = 1234;
		cliente1.Contas.numeros = 9999;
		cliente1.Contas.saldos =1299.00;
		
		conta conta1 = new conta();
		conta1.numeros = 888;
		conta1.saldos = 999.00;
		
		clientes cliente2 = new clientes();
		cliente2.Contas = conta1;
		cliente2.nome = "Purge";
		cliente2.numeroCPF = 6655;
		
		clientes cliente3 = new clientes();
		
				
	}

}
