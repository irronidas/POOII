
public class Hora_menor implements Solicitud_hora {
	
	public String TipoAtencion(String tipo){
		tipo = "\033[0;1m" + "atencion para ";
		return tipo + "MENOR, Odontopediatría ";

	}
	public int horario(int time){
		time = 15;
	return time;
	}
}
