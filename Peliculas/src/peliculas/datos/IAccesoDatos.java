package peliculas.datos;

import peliculas.domain.Pelicula;
import peliculas.excepciones.*;

import java.util.List;

public interface IAccesoDatos
{
    boolean existe(String recurso) throws AccesoDatosEx;
    List<Pelicula> listar(String recurso) throws LecturaDatosEx;
    void escribir(Pelicula pelicula, String recurso, boolean anexar) throws EscrituraDatosEx;
    String buscar(String recurso, String buscar) throws LecturaDatosEx;
    void crear(String recurso) throws AccesoDatosEx;
    void borrar(String recurso) throws AccesoDatosEx;
}
