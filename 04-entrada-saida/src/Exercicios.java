import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		// 1 - Implemente um programa que solicite ao usuário nome, idade e altura, e exiba essas
		// informações formatadas no console, usando a classe Scanner para capturar as entradas.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite sua idade: ");
		short idade = scanner.nextShort();
		
		System.out.println("Digite sua altura: ");
		float altura = scanner.nextFloat();
		
		String mensagemFormatada = String.format("Nome: %s %nIdade: %d %nAltura: %.2f metros", nome, idade, altura);
		
		System.out.println(mensagemFormatada);
	}

}
