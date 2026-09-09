package br.com.fiap.rh.test;

import br.com.fiap.rh.model.Aluno;
import br.com.fiap.rh.model.Professor;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno("Oswaldo", 15, "3B");
		aluno1.estudar();
		
		Professor professor1 = new Professor();
		professor1.nome = "Raimundo";
		professor1.idade = 55;
		professor1.materia = "Geografia";
		
		professor1.ensinar();
	}

}
