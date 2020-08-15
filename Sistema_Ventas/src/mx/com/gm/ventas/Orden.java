package mx.com.gm.ventas;

import java.util.Arrays;
import java.util.Objects;

public class Orden
{
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private static int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    /**
     * Constructor publico para setear idOrden
     * Incrementa la variable contadorOrdenes
     */
    public Orden()
    {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    /**
     * @param producto : Nuevo producto para agregar a array productos
     */
    public void agregarProducto(Producto producto)
    {
        if(!Objects.isNull(producto) && Orden.contadorProductos < Orden.MAX_PRODUCTOS)
        {
            for (int i = 0; i < this.productos.length; i++)
            {
                if(this.productos[i] == null)
                {
                    this.productos[i] = producto;
                    Orden.contadorProductos++;
                    return;
                }
            }
        }
        // Se debería agregar excepcion
        System.out.println("Se ha superado el máximo de productos");
    }

    /**
     * @return : Precio de todos los productos de la orden
     */
    public double calcularTotal()
    {
        var total = 0D;

        for (int i = 0; i < this.productos.length ; i++)
        {
            if(!Objects.isNull(this.productos[i]))
            {
                total += this.productos[i].getPrecio();
            }
        }
        return total;
    }

    /**
     * Método para mostrar datos de todos los productos de la orden
     */
    public void mostrarOrden()
    {
        System.out.println(this);
    }

    // Getters & Setters

    public int getIdOrden()
    {
        return this.idOrden;
    }

    public Producto[] getProductos()
    {
        return this.productos;
    }

    public void setProductos(Producto[] productos)
    {
        this.productos = productos;
    }

    public static int getContadorOrdenes()
    {
        return Orden.contadorOrdenes;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Orden= ");
        sb.append(idOrden);
        sb.append("\n");

        for (int i = 0; i < this.productos.length ; i++)
        {
            if(!Objects.isNull(this.productos[i]))
            {
                sb.append(this.productos[i]).append("\n");
            }
        }

        return sb.toString();
    }
}
