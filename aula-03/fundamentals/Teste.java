package fundamentals;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.nome = "Arthur";
		aluno.idade = 22;
		aluno.altura = 1.70f;
		aluno.peso = 70;
		aluno.sexo = "M";
		aluno.chorar();
		aluno.estudar();
		aluno.reclamar();
		aluno.imprimir();
		
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Caua";
		aluno1.idade = 20;
		aluno1.altura = 1.82f;
		aluno1.peso = 78;
		aluno1.sexo = "M";
		aluno1.chorar();
		aluno1.estudar();
		aluno1.reclamar();
		aluno1.imprimir();
		
		
	}

}
