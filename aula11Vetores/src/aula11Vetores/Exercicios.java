package aula11Vetores;

public class Exercicios {

	public static void main(String[] args) {

		double[] notas = new double[5];
		
		notas[0] = 10;
		notas[1] = 7.3;
		notas[2] = 8;
		notas[3] = 3;
		notas[4] = 2;
		

		
		System.out.println(calcularMedia(notas));
		
	}

	public static double calcularMedia(double[] notas) {
		double somaTotal = 0;
		for(double nota : notas) {
			somaTotal += nota;
		}
		return somaTotal / notas.length;
	}
}
