package work.basico.clases;

public class Persona
{
    public String nombre;
    public String apellido;
    public char genero;
    public String ocupacion;

    // Existe un constructor por defecto siempre
    /*
        public Persona(){}
     */

    public void desplegarInfo()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido = " + apellido);
    }
}
