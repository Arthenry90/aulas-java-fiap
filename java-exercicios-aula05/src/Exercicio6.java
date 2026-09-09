import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero1 = scanner.nextInt();
		
		String valor = (numero1 % 2 == 0) ? "par" : "impar";
		System.out.println("O número é: " + valor);
		
	}

}
