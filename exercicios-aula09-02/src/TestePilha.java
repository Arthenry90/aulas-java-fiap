
public class TestePilha {

	public static void main(String[] args) {
		
		Pilha pilha1 = new Pilha();
		
		pilha1.empilhar(10);
		pilha1.empilhar(2);
		pilha1.empilhar("Teste");
		pilha1.empilhar(20.3);
		pilha1.empilhar(null);
		pilha1.empilhar("Teste");
		
		pilha1.desempilhar();
		pilha1.exibirPilha();
		
		
		

}

}
