package palabraFinal.test;

import palabraFinal.domain.Persona;

public class TestFinal
{
    public static void main(String[] args)
    {
        final int variable = 10;
        System.out.println("variable = " + variable);

        //Persona.LA_CONSTANTE = 6;
        System.out.println("Persona.LA_CONSTANTE = " + Persona.LA_CONSTANTE);

        final Persona persona = new Persona();
        //persona = new Persona();
    }
}
