
public class Tarea7 {

	private static String nombre = "Jaime";
	private static String apellido = "Bustamante";
	private static String rut = "15123456-k";
	private static String direccion = "las galaxias 11";
	private static int fono = 123456789;
	
	public Tarea7(String nombre, String apellido, String rut, String direccion, int fono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.direccion = direccion;
		this.fono = fono;
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

		Contexto contexto = new Contexto(new Hora_adulto());
		System.out.println("Estimado " + nombre+" " + apellido +", "+"cedula " + rut + ", con dirección " + direccion + ", telefono"+" "+ fono +"\n"+
				"Su hora agendada es del tipo de " + contexto.ejecuteStrategia1() +"\n" + 
				"Su horario de atencion es de las " + contexto.ejecuteStrategia2() + " Hrs.");
	}
}
