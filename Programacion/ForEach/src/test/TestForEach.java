package test;

import domain.Persona;

public class TestForEach
{
    public static void main(String[] args)
    {
        int edades[] = {1,2,3,4,5};

        for(int edad: edades)
        {
            System.out.println("edad = " + edad);
        }

        Persona personas[] = {new Persona("Pepito"),new Persona("Nicolas"),new Persona("Agustin")};

        for (Persona persona: personas)
        {
            System.out.println("persona = " + persona);
        }
    }
}


