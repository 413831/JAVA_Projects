package work.practice;

import java.util.Scanner;

public class Ejercicio_Tipos
{
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String nombre;
        int id;
        int precio;
        boolean envio;

        System.out.println("Proporciona el nombre");
        nombre = consola.nextLine();
        System.out.println("Proporciona el id");
        id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio");
        precio = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el envio gratuito: true / false");
        envio = Boolean.parseBoolean(consola.nextLine());

        System.out.println("Nombre: " + nombre + " #" + id);
        System.out.println("Precio: $" + precio + ".00");
        System.out.println("Envio gratuito: " + envio);
    }
}
