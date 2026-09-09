import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero1 = scanner.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		int numero2 = scanner.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		int numero3 = scanner.nextInt();
		
		if (numero1 >= numero2 && numero1 >= numero3) {
		    System.out.println("O número: " + numero1 + " é maior");
		} else if (numero2 >= numero1 && numero2 >= numero3) {
		    System.out.println("O número: " + numero2 + " é maior");
		} else {
		    System.out.println("O número: " + numero3 + " é maior");
		}
		
		if (numero1 <= numero2 && numero1 <= numero3) {
		    System.out.println("O número: " + numero1 + " é o menor");
		} else if (numero2 <= numero1 && numero2 <= numero3) {
		    System.out.println("O número: " + numero2 + " é o menor");
		} else {
		    System.out.println("O número: " + numero3 + " é o menor");
		}
		
	}

}
