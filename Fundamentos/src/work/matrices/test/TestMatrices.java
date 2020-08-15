package work.matrices.test;

import work.matrices.domain.Persona;

public class TestMatrices
{
    public static void main(String[] args)
    {
        // Declaraciones
        int edades[][] = new int[3][2];
        String frutas[][] = {{"Naranja","Limon"}, {"Fresa","Zarzamora"}};
        Persona personas[][] = new Persona[2][3];

        // Inicializacion
        edades[0][0] = 5;
        edades[0][1] = 15;
        edades[1][0] = 7;
        edades[1][1] = 20;
        edades[2][0] = 3;
        edades[2][1] = 11;

        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[0][2] = new Persona("Pepito");
        personas[1][0] = new Persona("Manuela");
        personas[1][1] = new Persona("Tito");
        personas[1][2] = new Persona("Paco");

        // Iteracion de matriz de enteros
        for (int fila = 0; fila < edades.length; fila++)
        {
            for (int columna = 0; columna < edades[fila].length; columna++)
            {
                System.out.println("Fila = "+fila+" - columna = "+columna+": Valor = " + edades[fila][columna]);
            }
        }

        // Iteracion de matriz de String
        imprimir(frutas);

        // Iteracion de matriz de Persona
        imprimir(personas);
    }

    public static void imprimir(Object matriz[][])
    {
        for (int fila = 0; fila < matriz.length; fila++)
        {
            for (int columna = 0; columna < matriz[fila].length; columna++)
            {
                System.out.println(fila + " - "+ columna + " : valor = " + matriz[fila][columna]);
            }
        }
    }
}
