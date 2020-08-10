package work.practice;

import work.practice.clases.Persona;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        Persona personita;

        personita = new Persona();
        personita.nombre = "Pepito";
        personita.apellido = "Gonzalez";
        personita.desplegarInfo();
    }
}
