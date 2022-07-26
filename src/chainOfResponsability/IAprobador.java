package chainOfResponsability;

public interface IAprobador {

	public 	void setNext(IAprobador aprobador);
	public IAprobador getNext();
	public void solicituHora(int hora);
	
}
