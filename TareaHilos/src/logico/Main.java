package logico;

public class Main {

	public static void main(String[] args) {
		Termometro term = new Termometro(20);
		Selector select = new Selector(25);
		Climatizador clim = new Climatizador(select, term);
		clim.start();

	}

}
