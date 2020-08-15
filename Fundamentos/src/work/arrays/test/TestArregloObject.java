package work.arrays.test;

import work.arrays.domain.Persona;

public class TestArregloObject
{
    public static void main(String[] args)
    {
        Persona personas[] = new Persona[2];
        String frutas[] = {"Naranja", "Anana", "Banana", "Melon", "Frutilla"};

        personas[0] = new Persona("Pepito");
        personas[1] = new Persona("Karla");

        //System.out.println("personas[0] = " + personas[0]);
        //System.out.println("personas[1] = " + personas[1]);

        for(int i = 0; i < personas.length; i++)
        {
            System.out.println("Indice : " + i + " - " + personas[i]);
        }

        for (int i = 0; i < frutas.length ; i++)
        {
            System.out.println("frutas = " + frutas[i]);
        }
    }
}
