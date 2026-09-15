
public class Livro {
	String titulo;
	String autor;
	double preco;
	private double desconto;
	
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public Livro(String titulo, String autor, double preco, double desconto) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
		this.desconto = desconto;
	}

	public Livro() {
		this.titulo = "Livro";
		this.autor = "JK";
		this.preco = 20;
		this.desconto = 2;
		
	}
	
	public void descontoPercentual(double percentual) {
		
		this.preco -= this.preco * (percentual / 100);
		this.desconto = this.preco * (percentual / 100);

	}
	
	public void descontoFixo(double fixo) {
		
		this.preco -= (fixo);
		this.desconto = (fixo);

	}
}
