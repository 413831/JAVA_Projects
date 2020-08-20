package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeracion
{
    public static void main(String[] args)
    {
        System.out.println(Dias.LUNES);
        indicarDiaSemana(Dias.MARTES);

        System.out.println("Continente 1: " + Continentes.AFRICA);
        System.out.println("Nro. de paises del continente 1: " + Continentes.AFRICA.getPaises());
    }

    private static void indicarDiaSemana(Dias dias)
    {
        switch (dias)
        {
            case LUNES :
                System.out.println("Primer dia de la semana");
                break;
            case MARTES :
                System.out.println("Segundo dia de la semana");
                break;
        }
    }
}
