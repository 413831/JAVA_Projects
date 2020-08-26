package peliculas.datos;

import peliculas.domain.Pelicula;

import java.io.*;
import java.util.List;

public class PeliculaDAO implements IAccesoDatos
{
    @Override
    public boolean existe(String nombreArchivo)
    {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombre)
    {
        File archivo = new File(nombre);
        try
        {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura != null)
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

        return null;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar)
    {
        File archivo = new File(nombreArchivo);
        try
        {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(pelicula);
            salida.close();
            System.out.println("Se ha escrito en el archivo");
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

    @Override
    public String buscar(String nombreArchivo, String buscar)
    {
        File archivo = new File(nombreArchivo);
        String nombreBuscado = null;
        try
        {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura.equals(buscar))
            {
                lectura = entrada.readLine();

            }
            nombreBuscado = lectura;
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
        }
        catch (IOException e)
        {
            e.printStackTrace(System.out);
        }
        return nombreBuscado;
    }

    @Override
    public void crear(String nombreArchivo)
    {
        File archivo = new File(nombreArchivo);
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

    @Override
    public void borrar(String nombreArchivo)
    {
        File archivo = new File(nombreArchivo);

        archivo.delete();

    }
}
