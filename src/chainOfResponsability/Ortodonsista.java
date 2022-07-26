package chainOfResponsability;

public class Ortodonsista implements IAprobador {
	
	private IAprobador next;
	public IAprobador getNext() {
	return next;
	}
	
	public void solicituHora(int hora) {
		if (hora > 14  && hora <= 17) {
			System.out.println("Su hora sera agendad con el Ortodonsista");
		}else {
			next.solicituHora(hora);
		}
	}
	
	public void setNext(IAprobador aprobador) {
		next = aprobador;
	}
}
