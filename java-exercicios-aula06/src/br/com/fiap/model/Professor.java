package br.com.fiap.model;

public class Professor {
	public String nome;
	public String materia;
	public int idade;
	
	public void ensinar() {
		System.out.println("Ensinando aos alunos a matéria: " + this.materia);
	}
}
