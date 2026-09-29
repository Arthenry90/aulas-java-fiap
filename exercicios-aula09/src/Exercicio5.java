import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String senhaInput = "0";
		String senha = "12345";
		
		do {
		System.out.println("Digite uma senha (String)");
		senhaInput = scanner.nextLine();
		}while(!senhaInput.equals(senha));
	
		
	}

}
