package logico;

public class Termometro {
	
	private int tempActual;
	
	
	public Termometro(int tempActual) {
		super();
		
		this.tempActual = 20;
	}
	
	public int getTempActual() {
		return tempActual;
	}
	public void setTempActual(int tempActual) {
		this.tempActual = tempActual;
	}
	
	public int medirTemp() {
		return this.tempActual;
	}
}
