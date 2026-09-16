package br.com.fiap.testes;

public class TesteIf {

	public static void main(String[] args) {
		if(true) {
			System.out.println("Executa a ação");
		}
		int idade = 18;
		
		if(idade >= 65) {
			System.out.println("Aposentado!");
		}else if(idade >= 18){
			System.out.println("Idade maior de 18!");
		}else {
			System.out.println("Menor de idade!");
		}
	}

}
