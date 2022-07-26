package mediator;

public class ClienteA extends Cliente {

	public ClienteA(Medidador medidador) {
		super(medidador);
	}
	
	@Override
	public void send(String message) {
		medidador.send(message, this);
	}
	
	@Override
	public void messageRecived(String message) {
		System.out.println("Web dental diente blanco dice: " + message);
	}
}
