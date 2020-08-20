package domain;

public class Persona
{
    private final int idPersona;
    private static int contadorPersonas;

    // Bloque de inicializacion estático
    // Se ejecuta cuando se carga la clase en memoria
    static
    {
        System.out.println("Ejecución bloque estático");
        ++Persona.contadorPersonas;
    }

    // Bloque de inicializacion no estático
    // Se ejecuta antes del constructor de la clase
    {
        System.out.println("Ejecución bloque no estático");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona()
    {
        System.out.println("Ejecución del constructor");
    }

    public int getIdPersona()
    {
        return this.idPersona;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
}
