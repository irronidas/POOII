package mediator;

public class ModWeb extends Cliente {

	public ModWeb(Medidador medidador) {
		super(medidador);
	}
	
	@Override
	public void send(String message) {
		medidador.send(message, this);
	}
	
	@Override
	public void messageRecived(String message) {
		System.out.println("Estimados confirmo mi sistencia a la " + message);
	}
}
