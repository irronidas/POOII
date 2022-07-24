
public class Contexto {

	private Solicitud_hora estrategia;

	public Contexto(Solicitud_hora estrategia) {
		this.estrategia = estrategia;
	}
	
	public String ejecuteStrategia() {
		return estrategia.horario(null);
	}
}
