
public class Contexto {

	private Solicitud_hora estrategia;

	public Contexto(Solicitud_hora estrategia) {
		this.estrategia = estrategia;
	}
	
	public String ejecuteStrategia1() {
		return estrategia.TipoAtencion(null);
	}
	public int ejecuteStrategia2() {
		return estrategia.horario(0);
	}
}
