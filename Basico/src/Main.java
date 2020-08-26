public class Main
{
    // Firma
    public static void main(String[] args)
    {
        // Cuerpo
        int numeroUno = 10;
        int numeroDos = 20;
        int resultado;

        // resultado = numeroUno + numeroDos;
        resultado = sumar(numeroUno, numeroDos);
        imprimir(resultado);
    }

    public static void imprimir(String texto)
    {
        System.out.println(texto);
    }

    public static void imprimir(int numero)
    {
        System.out.println(numero);
    }

    public static int sumar(int numeroUno, int numeroDos)
    {
        int resultado = numeroUno + numeroDos;
        return resultado;
    }
}
