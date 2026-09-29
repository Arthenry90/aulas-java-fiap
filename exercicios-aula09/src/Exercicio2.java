import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 7: ");
		int numeroInput = scanner.nextInt();
		
		switch(numeroInput) {
		case (1): {
			System.out.println("Domingo");
		}
		case (2): {
			System.out.println("Segunda");
		}
		case (3): {
			System.out.println("Terca");
		}
		case (4): {
			System.out.println("Quarta");
		}
		case (5): {
			System.out.println("Quinta");
		}
		case (6): {
			System.out.println("Sexta");
		}
		case (7): {
			System.out.println("Sabado");
		}
		default:{
			System.out.println("Digitou outro número sem ser 1 a 7");
		}
		}
		

	}

}
