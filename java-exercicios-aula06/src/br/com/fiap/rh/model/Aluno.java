package br.com.fiap.rh.model;

public class Aluno {
	private String nome;
	private int idade;
	private String sala;
	
	public Aluno(String nome, int idade, String sala) {
		this.nome = nome;
		this.idade = idade;
		this.sala = sala;
		
	}
	public void estudar() {
		System.out.println("O aluno " + this.nome + " está estudando na sala: " + this.sala);
	}
}
