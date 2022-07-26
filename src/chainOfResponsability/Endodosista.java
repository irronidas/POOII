package chainOfResponsability;

public class Endodosista implements IAprobador {

	private IAprobador next;
	public IAprobador getNext() {
	return next;
	}
	
	public void solicituHora(int hora) {
		if (hora <= 13) {
			System.out.println("Su hora sera agendada con el Endodosista");
		}else {
			next.solicituHora(hora);
		}
	}
	
	public void setNext(IAprobador aprobador) {
		next = aprobador;
	}
}
