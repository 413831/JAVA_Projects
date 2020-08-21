package test;

import paquete1.*;

public class TestModificadoresAcceso
{
    public static void main(String[] args)
    {
        // Public
        Clase1 clase1 = new Clase1();
        System.out.println("clase1.atributoPublico = " + clase1.atributoPublico);
        clase1.metodoPublico();

        // Protected
        Hija claseHija = new Hija();
        System.out.println("claseHija = " + claseHija);

        // Default
        clase1.atributoDefault();
        //Clase2 clase2 = new Clase2();

        // Private
        ClasePrivada clase3 = new ClasePrivada("Argumento");
        clase3.setAtributoPrivado("Valor nuevo");
        System.out.println("clase3.getAtributoPrivado() = " + clase3.getAtributoPrivado());
    }
}
