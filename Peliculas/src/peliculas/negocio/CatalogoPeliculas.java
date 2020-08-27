package peliculas.negocio;

import peliculas.datos.IAccesoDatos;
import peliculas.datos.PeliculaDAO;
import peliculas.domain.Pelicula;
import peliculas.excepciones.*;

import java.util.List;

public class CatalogoPeliculas implements ICatalogoPeliculas
{
    private final IAccesoDatos datos;
    List<Pelicula> listadoPeliculas;

    public CatalogoPeliculas()
    {
        this.datos = new PeliculaDAO();
    }

    @Override
    public void agregarPelicula(String nombrePelicula)
    {
        try
        {
            if(this.datos.existe(NOMBRE_RECURSO))
            {
                this.datos.escribir(new Pelicula(nombrePelicula), NOMBRE_RECURSO, true);
            }
        }
        catch (AccesoDatosEx accesoDatosEx)
        {
            accesoDatosEx.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas()
    {
        try
        {
            if(this.datos.existe(NOMBRE_RECURSO))
            {
                this.listadoPeliculas = this.datos.listar(NOMBRE_RECURSO);
                for (Pelicula pelicula:this.listadoPeliculas)
                {
                    System.out.println(pelicula);
                }
            }
        }
        catch (AccesoDatosEx accesoDatosEx)
        {
            System.out.println("Error de acceso a datos");
            accesoDatosEx.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String busqueda)
    {
        String resultado = null;
        try
        {
            if(this.datos.existe(NOMBRE_RECURSO))
            {
                resultado = this.datos.buscar(NOMBRE_RECURSO, busqueda);
                System.out.println("resultado = " + resultado);
            }
        }
        catch (AccesoDatosEx accesoDatosEx)
        {
            System.out.println("Error de acceso a datos");
            accesoDatosEx.printStackTrace(System.out);
        }
    }

    @Override
    public void iniciarArchivo()
    {
        try
        {
            if(this.datos.existe(NOMBRE_RECURSO))
            {
                this.datos.borrar(NOMBRE_RECURSO);
                this.datos.crear(NOMBRE_RECURSO);
            }
            else
            {
                this.datos.crear(NOMBRE_RECURSO);
            }
        }
        catch (AccesoDatosEx accesoDatosEx)
        {
            accesoDatosEx.printStackTrace();
        }
    }
}
