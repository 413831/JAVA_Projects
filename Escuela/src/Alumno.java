
class Alumno {
	private String nombreAlumno;
	private int id;
	private int edadAlumno;
	private double promedioAlumno;
	private String statusAlumno;
	private static int staticId = 1;

	public Alumno(String nombre,int edad,String status)
	{
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setStatus(status);
		this.setId();
		this.setPromedio(0);
	}

	private void setNombre(String nombre){
		this.nombreAlumno = nombre;
	}
	private void setEdad(int edad){
		this.edadAlumno = edad;
	}
	private void setPromedio(double promedio){
		this.promedioAlumno = promedio;
	}
	private void setStatus(String status){
		this.statusAlumno = status;
	}
	private void setId()
	{
		this.id = staticId;
		staticId++;
	}

	public String getNombre(){
		return this.nombreAlumno;
	}
	public int getEdad(){
		return this.edadAlumno;
	}
	public double getPromedio(){
		return this.promedioAlumno;
	}
	public String getStatus(){
		return this.statusAlumno;
	}
	public int getId(){
		return this.id;
	}
}
