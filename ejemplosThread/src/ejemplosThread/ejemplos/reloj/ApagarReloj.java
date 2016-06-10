package ejemplosThread.ejemplos.reloj;

public class ApagarReloj extends Thread {
	
	private Reloj reloj;
    private long milisegundos;
    
    
	public ApagarReloj(Reloj reloj, long milisegundos) {
		super();
		this.reloj = reloj;
		this.milisegundos = milisegundos;
	}


	public Reloj getReloj() {
		return reloj;
	}


	public void setReloj(Reloj reloj) {
		this.reloj = reloj;
	}


	public long getMilisegundos() {
		return milisegundos;
	}


	public void setMilisegundos(long milisegundos) {
		this.milisegundos = milisegundos;
	}
    
    @Override
    public void run() {
    	try {
			sleep(this.getMilisegundos());
			this.getReloj().setEstaEncendido(false);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }


}
