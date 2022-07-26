
public class Hora_adulto implements Solicitud_hora {

	
	public String TipoAtencion(String tipo){
		tipo = "\033[0;1m" + "atencion para ";
		return tipo + "ADULTO, Ortodoncia Funcional";

	}
	
	public int horario(int time){
		time = 10;
	return time;
	}
}

