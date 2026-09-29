import java.util.List;
import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Forma> formas = new ArrayList<>();
		formas.add(new Retangulo(5.0, 10.0));
		formas.add(new Circulo(10.0));
		formas.add(new Circulo(123.0));

		
		
		for (Forma forma : formas) {
			System.out.println(forma.calcularArea());
		}
	}

}
