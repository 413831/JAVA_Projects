package mx.com.gm.ventas.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

public class VentasTest
{
    public static void main(String[] args)
    {
        Orden orden1 = new Orden();
        Producto producto1 = new Producto("Cerveza",80);
        Producto producto2 = new Producto("Jabon en polvo",75.99);
        Producto producto3 = new Producto("Queso cremoso",120.50);
        double totalOrden;

        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);

        totalOrden = orden1.calcularTotal();
        System.out.println("totalOrden = " + totalOrden);

        orden1.mostrarOrden();
    }
}
