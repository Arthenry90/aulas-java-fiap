import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idadeInput = scanner.nextInt();
		
		if (idadeInput >= 18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
		
		
	}

}
