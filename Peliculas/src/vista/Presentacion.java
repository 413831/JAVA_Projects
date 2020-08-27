package vista;

import peliculas.negocio.*;

import java.util.Scanner;

public class Presentacion
{
    private static Scanner scanner;
    private static int opcion;
    private static String nombreArchivo;
    private static ICatalogoPeliculas catalogoPeliculas;

    public static void main(String[] args)
    {
        scanner = new Scanner(System.in);
        catalogoPeliculas = new CatalogoPeliculas();
        String pelicula;

        do
        {
            System.out.flush();
            System.out.println("Elige opción: \n" +
                                "1 - Iniciar catalogo de peliculas\n" +
                                "2 - Agregar pelicula\n" +
                                "3 - Listar peliculas\n" +
                                "4 - Buscar pelicula\n" +
                                "0 - Salir");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion)
            {
                case 1 :
                    catalogoPeliculas.iniciarArchivo();
                    break;
                case 2 :
                    System.out.println("Ingrese el nombre de la nueva pelicula");
                    pelicula = scanner.nextLine();
                    catalogoPeliculas.agregarPelicula(pelicula);
                    break;
                case 3 :
                    catalogoPeliculas.listarPeliculas();
                    break;
                case 4 :
                    System.out.println("Ingrese el nombre de la pelicula a buscar");
                    pelicula = scanner.nextLine();
                    catalogoPeliculas.buscarPelicula(pelicula);
                    break;
                case 0 :
                    System.out.println("hasta prontos");
                    break;
                default :
                    System.out.println("La opcion no es valida");
            }

        }while(opcion != 0);
    }
}
