import java.util.*;

interface Listas {
	LinkedList<Alumno> listadoAlumnos = new LinkedList<Alumno>();
	LinkedList<Materia> listadoMaterias = new LinkedList<Materia>();
	LinkedList<Legajo> listadoPrincipal = new LinkedList<Legajo>();

}

class Legajo implements Listas{
	private int idMateria;
	private int idAlumno;
	private int idLegajo;
	private String status;
	private double nota;
	private static int numeroLegajo = 0;

	public void alta(int materia,int alumno){
		this.setIdAlumno(alumno);		//falta validar
		this.setIdMateria(materia);
		this.setStatus("Activo");//Usar ENUM
		this.setIdLegajo(Legajo.numeroLegajo++);
		listadoPrincipal.add(this);
	}
	public void calificar(double nota){

		this.setNota(nota);		//falta validar
	}
	public void baja(){				//Baja logica
		this.setStatus("Inactivo");
	}
	/////Setters & getters///////
	public int getIdLegajo() {
		return idLegajo;
	}
	public void setIdLegajo(int idLegajo) {
		this.idLegajo = idLegajo;
	}
	public int getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	public int getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}

}