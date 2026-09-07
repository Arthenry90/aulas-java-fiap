import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("Digite um Booleano: ");
		boolean valorA = scanner.nextBoolean();
		
		System.out.println("Digite outro Booleano: ");
		boolean valorB = scanner.nextBoolean();
		
		System.out.println("A && B é:" + (valorA && valorB));
		System.out.println("!A é :" + (!valorA));
		System.out.println("!B é :" + (!valorB));
		System.out.println("A || B, é :" + (valorA || valorB));

	}
	
}
