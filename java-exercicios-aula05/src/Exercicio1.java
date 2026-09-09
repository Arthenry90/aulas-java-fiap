import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero1 = scanner.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		int numero2 = scanner.nextInt();
		
		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int multiplicacao = numero1 * numero2;
		int divisão = numero1 / numero2;
		int módulo = numero1 % numero2;
		
		System.out.printf("A soma: %d%nA subtração: %d%nA multiplicação: %d%nA divisão: %d%nO módulo: %d%n", 
                soma, subtracao, multiplicacao, divisão, módulo);

	}
}
