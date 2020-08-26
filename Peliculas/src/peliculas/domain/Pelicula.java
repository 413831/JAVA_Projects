package peliculas.domain;

public class Pelicula
{
    private String nombre;
    private int idPelicula;
    private static int contadorPeliculas;

    public Pelicula()
    {
        this.idPelicula = ++Pelicula.contadorPeliculas;
    }

    public Pelicula(String nombre)
    {
        super();
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getIdPelicula()
    {
        return this.idPelicula;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Pelicula{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", idPelicula=").append(idPelicula);
        sb.append('}');
        return sb.toString();
    }
}
