package work.basico;

import java.util.Scanner;

public class Parse
{
    public static void main(String[] args)
    {
        // Convertir tipo String a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        // Pedir valor
        System.out.println("Ingrese un valor");
        var consola = new Scanner(System.in);
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad: "+edad);

        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);

    }
}
