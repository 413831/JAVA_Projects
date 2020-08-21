package paquete1;

public class Clase1 extends Clase2
{
    public String atributoPublico = "Valor atributo publico";

    public Clase1()
    {
        super();
        System.out.println("Constructor publico");
    }

    public void metodoPublico()
    {
        System.out.println("Metodo publico");
        super.metodoDefault();
    }

    public void atributoDefault()
    {
        System.out.println("Atributo default" + super.atributoDefault);
    }

}
