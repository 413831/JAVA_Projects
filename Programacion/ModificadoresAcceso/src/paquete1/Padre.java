package paquete1;

public class Padre
{
    protected String atributoProtected = "Valor atributo protected";

    protected Padre()
    {
        System.out.println("Constructor protected");
    }

    protected void metodoProtected()
    {
        System.out.println("Metodo protected");
    }
}
