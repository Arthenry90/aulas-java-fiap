package fundamentals;

public class Aluno {
	
	String nome;
	short idade;
	float altura;
	float peso;
	String sexo;
	
	void estudar() {
		System.out.println(nome + " estudando!");
	}
	
	void chorar() {
		System.out.println(nome + " chorando!");
	}
	
	void reclamar() {
		System.out.println(nome + " reclamando!");
	}
	
	void imprimir() {
		System.out.println("O aluno do nome " + nome + " da idade " + idade + " do sexo " + sexo + " tem a altura " + altura + " e peso " + peso);
	}

}
