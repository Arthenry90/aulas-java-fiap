import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// 1 - Implemente um programa que solicite ao usuário nome, idade e altura, e exiba essas
		// informações formatadas no console, usando a classe Scanner para capturar as entradas.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite sua idade: ");
		short idade = scanner.nextShort();
		
		System.out.println("Digite sua altura: ");
		float salario = scanner.nextFloat();
		
		
		System.out.printf("Nome: %s %nIdade: %d %nSalario: R$%.2f", nome, idade, salario);
	}

}
