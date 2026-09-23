package aula_09;

public class Professor {
	
	private String nome;
	
	private int idade;
	
	private String documento;
	
	private String materia;

	public Professor(String nome, int idade, String documento, String materia) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.documento = documento;
		this.materia = materia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public void comer() {
		System.out.println("Professor comendo");
	}
	
	public void ensinar() {
		System.out.println("Professor ensinando!");
	}
	
	public void receber() {
		System.out.println("Professor recebendo");
	}

}
