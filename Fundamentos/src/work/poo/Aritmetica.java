package work.poo;

public class Aritmetica {
    // Atributos de clase
    int operandoA;
    int operandoB;

    // Constructor vacio
    public Aritmetica()
    {
        System.out.println("Ejecutando constructor");
    }

    public Aritmetica(int arg1, int arg2)
    {
        this.operandoA = arg1;
        this.operandoB = arg2;
    }

    // Metodo
    public void sumar()
    {
        int resultado = this.operandoA + this.operandoB;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno()
    {
        return this.operandoA + this.operandoB;
    }

    public int sumarConArgumentos(int arg1, int arg2)
    {
        this.operandoA = arg1;
        this.operandoB = arg2;

        return this.sumarConRetorno();
    }
}
