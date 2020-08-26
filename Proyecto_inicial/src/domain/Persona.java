package domain;

public class Persona
{
    public String nombre;
    public int edad;
    public int dni;
    public String direccion;

    public Persona()
    {
        System.out.println("Constructor vacio");
    }

    public Persona(String nombre)
    {
        this.nombre = nombre;
        System.out.println("Constructor con nombre");
    }

    public void caminar()
    {
        System.out.println("Estoy caminando");
    }

    public void correr()
    {
        System.out.println("Estoy corriendo");
    }
}
