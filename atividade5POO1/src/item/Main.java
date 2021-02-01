package item;

public class Main {

	public static void main(String[] args) {

		System.out.println("2 - Item\n");
		
		Item item = new Item(001, "Item 1");
		System.out.println(item);
		
		System.out.println();
		
		Livro livro = new Livro(002, "Item 2 - Livro", "Amanda");
		System.out.println(livro);
		
		System.out.println();
		
		Midia midia = new Midia(003, "Item 3 - Midia", "GravadoraMax", 60);
		System.out.println(midia);
		
		System.out.println();
		
		CD cd = new CD(004, "Item 4 - CD", "GravadoraMax", 5, 2, "Roberto", "Flores Brancas");
		System.out.println(cd);
		
		System.out.println();
		
		VHS vhs = new VHS(005, "Item 5 - VHS", "GravadoraMax", 30, "Filme Divertido");
		System.out.println(vhs);
		
	}

}
