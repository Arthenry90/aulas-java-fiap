import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {
	private List<T> elementos = new ArrayList<>();
	
	public void empilhar(T item) {
		elementos.add(item);
	}
	public void desempilhar() {
		elementos.remove(elementos.size() - 1);
	}
	
	public void exibirPilha() {
		for (T item : elementos) {
			System.out.println(item);
		}
	}
}
