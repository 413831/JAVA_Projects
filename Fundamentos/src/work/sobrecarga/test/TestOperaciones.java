package work.sobrecarga.test;

import work.sobrecarga.operaciones.Operaciones;

public class TestOperaciones
{
    public static void main(String[] args)
    {
        var resultado = Operaciones.sumar(5, 3);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(2.4, 3.1);
        System.out.println("resultado2 = " + resultado2);
    }
}
