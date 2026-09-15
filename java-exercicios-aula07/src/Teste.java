public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livro1 = new Livro();
		
		System.out.println("Preço antes do desconto: " + livro1.preco);
		
		livro1.descontoPercentual(10);
		
		System.out.println("Preço depois do desconto: " + livro1.preco);
		
		Livro livro2 = new Livro();
		System.out.println("Preço antes do desconto: " + livro2.preco);
		
		livro2.descontoFixo(10);

		System.out.println("Preço depois do desconto: " + livro2.preco);

	}
}
