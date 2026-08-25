
public class TesteManipulacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensagem = "Exemplo de manipulacao de string em java";
		int comprimento = mensagem.length();
		String minusculas = mensagem.toLowerCase();
		String maiusculas = mensagem.toUpperCase();
		String substring = mensagem.substring(8,9);
		boolean contem = mensagem.contains("Exemplo");
		String substituida = mensagem.replace("java", "javascript");
		
		String printDeTudo = String.format("Mensagem original: %s %nComprimento: %s %n", mensagem, comprimento);
		
		System.out.println(printDeTudo);
		}

}
