/**
 * Classe que representa um produto.
 */
public class Produto {
	String nome;
	double preco;
	
	/**
	 * Retorna o nome
	 * 
	 * @return Retorna o nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Altera o nome
	 * 
	 * @param nome o nome do produto
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Retorna o preço do produto
	 * 
	 * @return preço 
	 */
	public double getPreco() {
		return preco;
	}
	
    /**
     * Altera o preço do produto.
     *
     * @param preco
     */
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	/**
	 * Metodo para teste
	 * 
	 * @param teste
	 * @return retorna o número 0
	 */
	public int metodoTeste(int teste) {
		return 0;
	}
	
}
