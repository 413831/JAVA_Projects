package test;

import excepciones.OperacionExcepcion;

import static aritmetica.Aritmetica.dividir;

public class TestExcepciones
{
    public static void main(String[] args)
    {
        int resultado = 0;

        try
        {
            resultado = dividir(10,0);
        }
        catch(OperacionExcepcion e)
        {
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Excepcion = " + e.getMessage());
        }
        finally
        {
            System.out.println("resultado: " + resultado);
        }
    }
}
