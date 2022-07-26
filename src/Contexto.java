//aquí abstraemos la utilizacion del algoritmo como una estrategia cambiante 
public class Contexto {

	//generaos variable de la interfaz estrategia
	private Solicitud_hora estrategia;

	//constructor donde recibimos las impementaciones de la intefaz
	public Contexto(Solicitud_hora estrategia) {
		this.estrategia = estrategia;
	}
	
	//Métodos ejecutar para dispara el comportamiento
	public String ejecuteStrategia1() {
		return estrategia.TipoAtencion(null);
	}
	public int ejecuteStrategia2() {
		return estrategia.horario(0);
	}
}
