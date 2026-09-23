package aula_09;

public class Aluno {
	
	public Aluno(String nome, int idadade, String documents, String sala) {
		super();
		this.nome = nome;
		this.idadade = idadade;
		this.documents = documents;
		this.sala = sala;
	}

	private String nome;
	private int idadade;
	private String documents;
	private String sala;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdadade() {
		return idadade;
	}

	public void setIdadade(int idadade) {
		this.idadade = idadade;
	}

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}
	
	public void estudar() {
		System.out.println("Aluno estudando");
	}
	
	public void comer() {
		System.out.println("Aluno comendo");
	}
	
	
}
