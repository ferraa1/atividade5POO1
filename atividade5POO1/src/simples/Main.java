package simples;

public class Main {

	public static void main(String[] args) {

		System.out.println("3 - Simples\n");
		
		Conta conta = new Conta("Bradesco", 13, 001, 0);
		conta.deposito(100);
		conta.saque(50);
		System.out.println(conta);
		
		System.out.println();
		
		ContaSimples contaSimples = new ContaSimples("Bradesco", 27, 002, 0, 0);
		contaSimples.deposito(200);
		contaSimples.depositoPoupanca(200);
		contaSimples.saque(100);
		contaSimples.saquePoupanca(100);
		System.out.println(contaSimples);
		
		System.out.println();
		
		ContaEspecial contaEspecial = new ContaEspecial("Bradesco", 28, 007, 0, 10, 1000);
		contaEspecial.deposito(100);
		contaEspecial.saque(50);
		System.out.println(contaEspecial);
		
	}

}
