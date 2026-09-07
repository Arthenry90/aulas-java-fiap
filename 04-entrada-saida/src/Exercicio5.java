import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a 1 string");
		String stringInput1 = scanner.nextLine();
		
		System.out.println("Digite a 2 string");
		String stringInput2 = scanner.nextLine();

		
		if(stringInput1.equals(stringInput2) || stringInput1.equalsIgnoreCase(stringInput2)) {
			System.out.println("As duas strings são iguais!");
		}
		else {
				System.out.println("As duas são diferentes!");
		}

	}

}
