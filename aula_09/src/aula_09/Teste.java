package aula_09;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno("Davi Brito", 20, "123456", "10");
		aluno1.comer();
		aluno1.estudar();
		
		
		Professor professor1 = new Professor("Professor", 10, "123456", "DDD");
		professor1.comer();
		professor1.ensinar();
		professor1.receber();
		
		
	}

}
