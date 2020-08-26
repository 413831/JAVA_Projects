package peliculas.datos;

import peliculas.domain.Pelicula;

import java.io.File;
import java.io.FileReader;
import java.util.List;

public class PeliculaDAO implements IAccesoDatos
{
    @Override
    public boolean existe(String nombreArchivo)
    {
        return false;
    }

    @Override
    public List<Pelicula> listar(String nombre)
    {
        File archivo = new File(nombre);
        FileReader lector = new FileReader()

        return null;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar)
    {

    }

    @Override
    public String buscar(String nombreArchivo, String buscar)
    {
        return null;
    }

    @Override
    public void crear(String nombreArchivo)
    {

    }

    @Override
    public void borrar(String nombreArchivo)
    {

    }
}
