package item;

public class Livro extends Item {

	private String autor;
	
	public Livro() {
		super();
	}

	public Livro(int codigo, String descricao) {
		super(codigo, descricao);
	}

	public Livro(int codigo, String descricao, String autor) {
		super(codigo, descricao);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [autor=");
		builder.append(autor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
