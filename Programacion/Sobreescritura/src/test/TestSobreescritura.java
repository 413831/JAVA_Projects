package test;

import domain.Empleado;
import domain.Gerente;

public class TestSobreescritura
{
    public static void main(String[] args)
    {
        Empleado empleado = new Empleado("Juancito", 3000);
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);

        Gerente gerente = new Gerente("Pepito",5000, "Sistemas");
        //System.out.println("gerente1 = " + gerente.obtenerDetalles());
        imprimir(gerente);
    }

    public static void imprimir(Empleado empleado)
    {
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }


}
