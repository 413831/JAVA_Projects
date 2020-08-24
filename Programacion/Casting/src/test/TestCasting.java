package test;

import domain.*;

public class TestCasting
{
    public static void main(String[] args)
    {
        // Polimorfismo con Upcasting y Downcasting
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        // System.out.println("empleado = " + empleado);

        // Downcasting
        ((Escritor)empleado).getTipoEscritura();
        Escritor escritor = (Escritor)empleado;

        // Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}
