package test;

public class TestAutoboxingUnboxing
{
    public static void main(String[] args)
    {
        // Clases envolventes de tipos primitivos (Wrapper)
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
        --------------
        Para cálculos se recomienda utilizar tipos primitivos
         */

        // Autoboxing
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero.doubleValue() = " + entero.doubleValue());

        // Unboxing
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);

    }
}
