package logico;

public class Selector extends Thread {
	private int tempElegida;

	public int getTempElegida() {
		return tempElegida;
	}

	public void setTempElegida(int tempElegida) {
		this.tempElegida = tempElegida;
	}

	public Selector(int tempElegida) {
		super();
		this.tempElegida = tempElegida;
	}
		
}
