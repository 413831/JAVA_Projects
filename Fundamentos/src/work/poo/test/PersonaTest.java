package work.poo.test;

import work.poo.dominio.Persona;

public class PersonaTest
{
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pepito", 5000, false);
        persona1.setNombre("Pepito Almendras");

        System.out.println("persona1 nombre = " + persona1.getNombre());
        System.out.println("persona1 sueldo = " + persona1.getSueldo());
        System.out.println("persona1 eliminado = " + persona1.isEliminado());

        //System.out.println(persona1.toString());
        System.out.println(persona1);
    }
}
