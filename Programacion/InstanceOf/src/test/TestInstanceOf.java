package test;

import domain.*;

public class TestInstanceOf
{
    public static void main(String[] args)
    {
        Empleado empleado = new Empleado("Juancito", 3000);

        Gerente gerente = new Gerente("Pepito",5000, "Sistemas");
        determinarTipo(gerente);

    }

    public static void determinarTipo(Empleado empleado)
    {
        if(empleado instanceof Gerente)
        {
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente)empleado;
            //((Gerente) empleado).getDepartamento();
            System.out.println("Departamento = " + gerente.getDepartamento());
        }
        else if(empleado instanceof Empleado)
        {
            System.out.println("Es de tipo Empleado");
        }
        else if(empleado instanceof Object)
        {
            System.out.println("Es de tipo Object");
        }

    }
}
