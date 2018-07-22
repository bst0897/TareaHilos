package logico;

public class Climatizador extends Thread{
	private boolean aireFrio;
	private boolean aireCaliente;
	
	
	public Climatizador(boolean aireFrio, boolean aireCaliente) {
		super();
		this.aireFrio = aireFrio;
		this.aireCaliente = aireCaliente;
	}
	
	public boolean isAireFrio() {
		return aireFrio;
	}
	public void setAireFrio(boolean aireFrio) {
		this.aireFrio = aireFrio;
	}
	public boolean isAireCaliente() {
		return aireCaliente;
	}
	public void setAireCaliente(boolean aireCaliente) {
		this.aireCaliente = aireCaliente;
	}
	public void activarFrio() {
		
	}
	public void pararFrio() {
		
	}
	public void activarCalor() {
		
	}
	
	public void pararCalor() {
		
	}
	private void retardo(int ret) {
		
		try {
			Thread.sleep(ret*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
	retardo(1);
	}
	
	
}


