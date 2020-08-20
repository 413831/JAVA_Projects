package test;

public class TestArgsVariables
{
    public static void main(String[] args)
    {
        imprimirNumeros(9);
        imprimirNumeros(3,4,5,6);

        variosParametros("Numeros",9,8,7);

    }

    // El argumento variable debe ser el último argumento
    private static void variosParametros(String nombre, int ... numeros)
    {
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }

    private static void imprimirNumeros(int... numeros)
    {
        for (int i = 0; i < numeros.length ; i++)
        {
            System.out.println("elemento = " + numeros[i]);
        }

    }
}
