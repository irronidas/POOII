package chainOfResponsability;

public class Evaluador implements IAprobador {

	private IAprobador next;
	public IAprobador getNext() {
	return next;
	}
	
	public void solicituHora(int hora) {
		Endodosista endodosista = new Endodosista();
		this.setNext(endodosista);
		
		Ortodonsista ortodonsista = new Ortodonsista();
		endodosista.setNext(ortodonsista);
		
		Urgencia urgencia  = new Urgencia();
		ortodonsista.setNext(urgencia);
		
		next.solicituHora(hora);
	}

	public void setNext(IAprobador aprobador) {
		next = aprobador;
		
	}
	
}
