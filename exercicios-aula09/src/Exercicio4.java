import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número, 0 encerra");
		int numeroInput = scanner.nextInt();
		
		while(numeroInput != 0) {
			System.out.println("Digite um número, 0 encerra");
			numeroInput = scanner.nextInt();
		}
		System.out.println("Encerrando...");
	}

}
