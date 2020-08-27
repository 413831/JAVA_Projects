package peliculas.datos;

import peliculas.domain.Pelicula;
import peliculas.excepciones.AccesoDatosEx;
import peliculas.excepciones.EscrituraDatosEx;
import peliculas.excepciones.LecturaDatosEx;

import java.io.*;
import java.util.*;

public class PeliculaDAO implements IAccesoDatos
{
    public PeliculaDAO()
    {

    }
    /*
    Metodo para verificar si existe un archivo
     */
    @Override
    public boolean existe(String recurso)
    {
        File archivo = new File(recurso);
        return archivo.exists();
    }

    /*
    Metodo para leer todas las peliculas
    Retorna un listado de Peliculas
     */
    @Override
    public List<Pelicula> listar(String recurso) throws LecturaDatosEx
    {
        File archivo = new File(recurso);
        List<Pelicula> peliculas = new ArrayList<Pelicula>();

        try
        {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();

            while(lectura != null)
            {
                peliculas.add(new Pelicula(lectura));
                lectura = entrada.readLine();
            }

            entrada.close();
            System.out.println("Se obtiene listado de peliculas");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al listar peliculas " + e.getMessage());
        }
        catch (IOException e)
        {
            e.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al listar peliculas " + e.getMessage());
        }
        return peliculas;
    }

    /*
    Metodo para escribir una pelicula en un archivo determinado
     */
    @Override
    public void escribir(Pelicula pelicula, String recurso, boolean anexar) throws EscrituraDatosEx
    {
        File archivo = new File(recurso);
        try
        {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(pelicula.getNombre());
            salida.close();
            System.out.println("Se ha escrito en el archivo");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
            throw new EscrituraDatosEx("Excepcion al escribir pelicula " + e.getMessage());
        }
        catch (IOException e)
        {
            e.printStackTrace(System.out);
            throw new EscrituraDatosEx("Excepcion al escribir pelicula " + e.getMessage());
        }

    }

    /*
    Metodo para buscar un nombre de pelicula en el archivo indicado
     */
    @Override
    public String buscar(String recurso, String buscar) throws LecturaDatosEx
    {
        File archivo = new File(recurso);
        String resultado = null;
        int indice = 1;

        try
        {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura != null)
            {
                if(buscar != null && buscar.equalsIgnoreCase(lectura))
                {
                    resultado = "Pelicula " + lectura + " encontrada en el indice " + indice;
                    break;
                }
                indice++;
                lectura = entrada.readLine();
            }
            entrada.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al buscar pelicula "+ e.getMessage());
        }
        catch (IOException e)
        {
            e.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al buscar pelicula "+ e.getMessage());
        }
        return resultado;
    }

    /*
    Metodo para crear un archivo vacio
     */
    @Override
    public void crear(String recurso) throws AccesoDatosEx
    {
        File archivo = new File(recurso);
        try
        {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al crear archivo "+ e.getMessage());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al crear archivo "+ e.getMessage());
        }
    }

    /*
    Metodo para borrar un archivo
     */
    @Override
    public void borrar(String recurso)
    {
        File archivo = new File(recurso);

        if(archivo.exists())
        {
            archivo.delete();
            System.out.println("Se ha borrado el archivo");
        }
    }
}
