package manejoarchivos;

import java.io.*;

public class ManejoArchivos
{
    public static void crear(String nombre)
    {
        File archivo = new File(nombre);
        try
        {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
        }
    }

    public static void escribir(String nombre, String contenido)
    {
        File archivo = new File(nombre);
        try
        {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito al archivo");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
        }
    }

    public static void agregar(String nombre, String contenido)
    {
        File archivo = new File(nombre);
        try
        {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito al archivo");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
        }
        catch (IOException e)
        {
            e.printStackTrace(System.out);
        }
    }

    public static void leer(String nombre)
    {
        File archivo = new File(nombre);
        try
        {
            BufferedReader entrada = new BufferedReader(new FileReader(nombre));
            var lectura = entrada.readLine();

            while (lectura != null)
            {
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
        }
        catch (IOException e)
        {
            e.printStackTrace(System.out);
        }
    }
}
