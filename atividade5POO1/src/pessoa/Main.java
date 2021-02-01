package pessoa;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("1 - Pessoa\n");
		
		Pessoa pessoa = new Pessoa("Luciano", "Blumenau");
		System.out.println(pessoa);
		
		System.out.println();
		
		PessoaFisica pessoaFisica = new PessoaFisica("Ronaldo", "Ibirama", "111.222.333-00", "Casado");
		System.out.println(pessoaFisica);
		
		System.out.println();
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Marcos Reparos", "Mafra", "11.222.333/4444-00", "MEI");
		System.out.println(pessoaJuridica);
		
	}

}
