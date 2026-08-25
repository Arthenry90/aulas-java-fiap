import java.util.Scanner;

public class TesteEntradaSaida {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu nome:");
		String nome = entrada.nextLine();
		
		System.out.println("Digite sua idade:");
		int idade = entrada.nextInt();
		
		System.out.println("O nome digitado é: " + nome + " a idade é " + idade);
		
		
	}

}
