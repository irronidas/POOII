package mediator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcreteMediador medidador = new ConcreteMediador();
		
		ClienteA clienteA = new ClienteA(medidador);
		ModWeb modWeb = new ModWeb(medidador);
		
		medidador.setClienteA(clienteA);
		medidador.setClienteB(modWeb);
		
		clienteA.send(" Confirmo!");
		modWeb.send(" Hora confirmada!!");
		
	}
}
