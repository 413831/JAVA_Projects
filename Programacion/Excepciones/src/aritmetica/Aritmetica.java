package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica
{
    //public static int dividir(int numerador, int denominador) throws OperacionExcepcion
    public static int dividir(int numerador, int denominador)
    {
        if(denominador == 0)
        {
            throw new OperacionExcepcion("Division entre cero");
        }
        return numerador / denominador;
    }



}
