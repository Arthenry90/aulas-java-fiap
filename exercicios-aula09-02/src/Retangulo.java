
public class Retangulo extends Forma {
	double base;
	double altura;
	
	Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea() {

		return this.base * this.altura;
	}
}
