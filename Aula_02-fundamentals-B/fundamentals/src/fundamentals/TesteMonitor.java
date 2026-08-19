package fundamentals;

public class TesteMonitor {

	public static void main(String[] args) {
		
		Monitor monitor = new Monitor();
		monitor.cor = "Preto";
		monitor.entrada = "HDMI";
		monitor.frequencia = 60;
		monitor.marca = "LG";
		monitor.tela = 17;
		monitor.exibir();
		monitor.ligar();
		

	}

}
