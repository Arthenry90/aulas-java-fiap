import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String fraseInput = scanner.nextLine();
		
		String fraseMinuscula = fraseInput.toLowerCase();
		String fraseMaiscula = fraseInput.toUpperCase();
		
		int comprimento = fraseInput.length();
		
		System.out.println("Frase maiscula: " + fraseMaiscula + " Frase Minuscula: " + fraseMinuscula + " Comprimento: " + comprimento);
		
		if(fraseInput.contains("Java")) {
			System.out.println("Nova frase: " + fraseInput.replace("Java", "Python"));
		}else {
			System.out.println("A frase não contem a palavra Java");
		}
		
		

		
	}

}
