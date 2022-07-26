package mediator;

public abstract class Cliente {
	
	protected Medidador medidador;
	
	public Cliente(Medidador medidador) {
		this.medidador = medidador;
	}
	
	public abstract	void send(String message);
	public abstract	void messageRecived(String message);
	
}
