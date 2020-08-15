package work.poo;

public class Caja
{
    int ancho;
    int alto;
    int profundo;

    public Caja()
    {  }

    public Caja(int ancho, int alto, int profundo)
    {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int calcularVolumen()
    {
        if(this.ancho > 0 && this.alto > 0 && this.profundo > 0)
        {
            return this.ancho * this.alto * this.profundo;
        }
        return 0;
    }
}
