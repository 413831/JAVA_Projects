
public class Materia {
	private String asignatura;
	private String profesor;
	private int idMateria;
	private String horario;
	//Enlace con alumnos
	private static int staticId = 1;

	public Materia(String materia,String profesor,String horario)
	{
		this.setMateria(materia);
		this.setProfesor(profesor);
		this.setHorario(horario);
		this.setId();
	}

	private void setMateria(String materia){
		this.asignatura = materia;
	}
	private void setProfesor(String nombre){
		this.profesor = nombre;
	}
	private void setId(){
		this.idMateria = staticId;
		staticId++;
	}
	private void setHorario(String franjaHoraria){
		this.horario = franjaHoraria;
	}

	public String getMateria(){
		return this.asignatura;
	}
	public String getProfesor(){
		return this.profesor;
	}
	public int getId(){
		return this.idMateria;
	}
	public String getHorario(){
		return this.horario;
	}


}
