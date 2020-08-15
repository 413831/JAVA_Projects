package mx.com.gm.ventas;

public class Producto
{
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;


    /**
     * Constructor publico para setear idProducto
     */
    public Producto()
    {
        this.idProducto = ++Producto.contadorProductos;
    }

    /**
     * @param nombre : Nombre del producto
     * @param precio : Precio del producto
     */
    public Producto(String nombre, double precio)
    {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters & Setters

    public int getIdProducto()
    {
        return this.idProducto;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public double getPrecio()
    {
        return this.precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public static int getContadorProductos()
    {
        return Producto.contadorProductos;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Producto{");
        sb.append("idProducto=").append(idProducto);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
