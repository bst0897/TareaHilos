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
		System.out.println("Aire Caliente: on");
		setAireCaliente(false);
		retardo(1);
		setAireFrio(true);
		grados = term.getTempActual()-select.getTempElegida();
		for(int i=0;i<=grados;i++) {
			System.out.println("Termometro:"+(term.getTempActual()-i));
			retardo(1);
		}
		pararFrio();
	}
	
	public void pararFrio() {
		setAireFrio(false);
		System.out.println("Aire Frio: off");
		
	}
	public void activarCalor() {
		int grados = 0;
		
		System.out.println("Aire Caliente: on");
		retardo(1);
		setAireFrio(false);
		setAireCaliente(true);
		grados = select.getTempElegida()-term.getTempActual();
		for(int i=0;i<=grados;i++) {
			System.out.println("Termometro:"+(term.getTempActual()+i));
			retardo(1);
		}
		pararCalor();
	}
	
	public void pararCalor() {
		setAireCaliente(false);
		System.out.println("Aire Caliente: off");
	}
	private void retardo(int ret) {
		try {
			Thread.sleep(ret*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void medirTemperatura() {
		System.out.println("Termometro:"+term.getTempActual());
	}
	
	@Override
	public void run() {
	retardo(1);
	activarAire();
	medirTemperatura();
	
//	System.out.println("Termomentro:"+term.getTempActual()+"\n"+isAireFrio());
	}


	
	
}


