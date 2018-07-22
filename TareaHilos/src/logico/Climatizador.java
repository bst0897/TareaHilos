package logico;

public class Climatizador extends Thread{
	private boolean aireFrio;
	private boolean aireCaliente;
	private Selector select;
	private Termometro term;
	
	public Climatizador(Selector select, Termometro term) {
		super();
		this.select = select;
		this.term = term;
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
	
	public void activarAire() {
		if(select.getTempElegida()<term.getTempActual()) {
			activarFrio();
		}
		if(select.getTempElegida()>term.getTempActual()) {
			activarCalor();
		}
	}
	
	public void activarFrio() {
		int grados = 0;
			try {
				setAireCaliente(false);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		setAireFrio(true);
		grados = term.getTempActual()-select.getTempElegida();
		System.out.println("Aire Frio: on");
		for(int i=0;i<=grados;i++) {
			System.out.println("Termometro:"+(term.getTempActual()-i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		setAireFrio(false);
		System.out.println("Aire Frio: off");
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
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
	retardo(1);
	activarAire();
//	System.out.println("Termomentro:"+term.getTempActual()+"\n"+isAireFrio());
	}


	
	
}


