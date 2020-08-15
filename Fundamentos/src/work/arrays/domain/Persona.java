package work.arrays.domain;

public class Persona
{
    private String nombre;

    public Persona(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append('}');
        sb.append("Padre='").append(super.toString());
        return sb.toString();
    }
}
