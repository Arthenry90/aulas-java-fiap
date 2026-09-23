package exercicio_aula08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aprovados = 0;
		int reprovados = 0;
		int emRec = 0;
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite sua nota: ");
			int notaAluno = scanner.nextInt();
			if(notaAluno >= 7) {
				aprovados +=1;
				System.out.println("Aprovado!");
			}else if(notaAluno >= 5) {
				System.out.println("Em recupeção!");
				emRec +=1;
			}else {
				System.out.println("Reprovado!");
				reprovados +=1;
			}
			}
		System.out.println("Aprovados = " + aprovados + " Reprovados= " + reprovados + " Em recuperação: " + emRec);
	}

}
