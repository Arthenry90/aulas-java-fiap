public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livro1 = new Livro();
		
		System.out.println("Preço antes do desconto: R$" + livro1.getPreco() + " do livro " + livro1.getTitulo());
		livro1.desconto(10.20);
		System.out.println("Preço depois do desconto: R$" + livro1.getPreco());
		
		Livro livro2 = new Livro();
		
		livro2.setTitulo("Harry potter 2");
		System.out.println("Preço antes do desconto: R$" + livro2.getPreco() + " do livro " + livro2.getTitulo());
		livro2.desconto(10);
		System.out.println("Preço depois do desconto: R$" + livro2.getPreco());
		
		Livro livro3 = new Livro("Mitologia nordica", "Neil gaiman", 20);
		
		System.out.println("Preço antes do desconto: R$" + livro3.getPreco() + " do livro " + livro3.getTitulo());
		livro3.desconto(20.0);
		System.out.println("Preço depois do desconto: R$" + livro3.getPreco());

	}
}
