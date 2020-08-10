package work.practice;

import java.util.Scanner;

public class Ejercicio_Rectangulo
{
    public static void main(String[] args)
    {
        int alto;
        int ancho;
        int area;
        int perimetro;
        Scanner consola = new Scanner(System.in);

        System.out.println("Proporcione el alto:");
        alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporcione el ancho:");
        ancho = Integer.parseInt(consola.nextLine());

        area = alto * ancho;
        System.out.println("Area : " + area);
        perimetro = (alto + ancho) * 2;
        System.out.println("Perimetro : " + perimetro);
    }
}
