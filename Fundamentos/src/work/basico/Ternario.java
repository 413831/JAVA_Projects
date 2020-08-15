package work.basico;

import java.util.Scanner;

public class Ternario
{
    public static void main(String[] args)
    {
        Scanner consola = new Scanner(System.in);

        var resultado = (3 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);

        var numero = 8;
        resultado = numero % 2 == 0 ? "es par" : "es impar";
        System.out.println("El numero " + resultado);

        System.out.println("Proporciona el numero1");
        int numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el numero2");
        int numero2 = Integer.parseInt(consola.nextLine());

        if(numero1 > numero2)
        {
            System.out.println("El numero1 es mayor");
        }
        else if(numero2 > numero1)
        {
            System.out.println("El numero2 es mayor");
        }
        else
        {
            System.out.println("Ambos numeros son iguales");
        }
    }
}
