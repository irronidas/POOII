
public class Tarea7 {

	private String nombre;
	private String apellido;
	private String rut;
	private String direccion;
	private int fono;
	
	public Tarea7(String nombre, String apellido, String rut, String direccion, int fono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.direccion = direccion;
		this.fono = fono;
	}

	public void generar_hora() {

	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getFono() {
		return fono;
	}

	public void setFono(int fono) {
		this.fono = fono;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Contexto contexto = new Contexto(new Hora_adulto());
		System.out.println("usuario xxx " + contexto.ejecuteStrategia());
	}

}
