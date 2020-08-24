package domain;

import java.util.Objects;

public class Empleado
{
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo)
    {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles()
    {
        return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
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
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o)
    {
        // Se compara si son la misma referencia en memoria
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            // Se compara si el argumento es null o si las clases son distintas
            return false;
        }
        Empleado empleado = (Empleado) o;
        // Se comparan los valores de los atributos
        return Double.compare(empleado.sueldo, sueldo) == 0 &&
                Objects.equals(nombre, empleado.nombre);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(nombre, sueldo);
    }
}
