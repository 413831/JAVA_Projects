package work.poo.herencia.dominio;

public class Empleado extends Persona
{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado()
    {
        //super();
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo)
    {
        //super(nombre);
        this(); // Llamada al constructor vacio
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado()
    {
        return this.idEmpleado;
    }

    public double getSueldo()
    {
        return this.sueldo;
    }

    public void setSueldo(double sueldo)
    {
        this.sueldo = sueldo;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", Persona=").append(super.toString()).append("}");
        sb.append('}');
        return sb.toString();
    }
}
