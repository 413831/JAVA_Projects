package paquete1;

public class ClasePrivada
{
    private String atributoPrivado = "Valor atributo privado";

    private ClasePrivada()
    {
        System.out.println("Constructor privado");
    }

    public ClasePrivada(String argumento)
    {
        this();
        System.out.println("Constructor publico clase privada");
        this.metodoPrivado();
    }

    private void metodoPrivado()
    {
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado()
    {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado)
    {
        this.atributoPrivado = atributoPrivado;
    }
}
