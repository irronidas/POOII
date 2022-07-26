package chainOfResponsability;

public class Urgencia implements IAprobador {

	private IAprobador next;

	public IAprobador getNext() {
		return next;
	}

	public void solicituHora(int hora) {
		if (hora <= 18) {
			System.out.println("Su hora sera agendad con el Urgencia");
		}
	}

	@Override
	public void setNext(IAprobador aprobador) {
		// TODO Auto-generated method stub
	}
}