import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número decimal");
		float numeroInput = scanner.nextFloat();
		int numeroConvertido = (int) numeroInput;
		
		System.out.println("O número original: " + numeroInput + " Número convertido: " + numeroConvertido);
		
	}

}
