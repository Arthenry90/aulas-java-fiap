package br.com.fiap.testes;

public class TesteSwitchCase {

	public static void main(String[] args) {

		char opcao = '';
		switch (opcao) {
		case 'A': {
			System.out.println("A opção escolhida é A");
			break;
		}
		case 'B': {
			System.out.println("A opção escolhida é B");
			break;
		}
		case 'C': {
			System.out.println("A opção escolhida é C");
			break;
		}
		default:
			System.out.println("Opção default");
			break;
		}
	}

}
