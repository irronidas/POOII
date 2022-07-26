package mediator;

public class ConcreteMediador implements Medidador{

	private ClienteA usu1;
	private ModWeb usu2;
	
	public void setClienteA(ClienteA clienteA) {
		usu1 = clienteA;
	}
	
	public void setClienteB(ModWeb modWeb) {
		usu2 = modWeb;
	}
	
	@Override
	public void send(String message, Cliente cliente) {
		if(cliente == usu1) {
			usu2.messageRecived(message);
		}
		else if (cliente == usu2) {
			usu1.messageRecived(message);
		}
	}
}
