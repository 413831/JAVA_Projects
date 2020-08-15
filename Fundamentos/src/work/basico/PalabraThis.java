package work.basico;

public class PalabraThis
{
    public static void main(String[] args)
    {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
    }
}

class Persona{
    String nombre;
    String apellido;

    Persona(String nombre , String apellido)
    {
        // super(): llamada al constructor de la clase padre Object
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
        // Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
    }
}

class Imprimir
{
    public void imprimir(Persona persona)
    {
        System.out.println("Persona desde imprimir:" + persona);
        System.out.println("Impresion del objeto actual:" + this);
    }
}