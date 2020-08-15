package work.basico;

public class Tipos {
    public static void main(String[] args) {
        /*
            tipos primitivos enteros: byte, short, int ,long
        */
        byte numeroByte = 10; // -128 a 127
        System.out.println("Valor minimo byte: "+ Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: "+ Byte.MAX_VALUE);

        short numeroShort = 10;
        System.out.println("Valor minimo short: "+ Short.MIN_VALUE);
        System.out.println("Valor maximo short: "+ Short.MAX_VALUE);

        int numeroInt = 10;
        System.out.println("Valor minimo int: "+ Integer.MIN_VALUE);
        System.out.println("Valor maximo int: "+ Integer.MAX_VALUE);

        long numeroLong = 10;
        System.out.println("Valor minimo long: "+ Long.MIN_VALUE);
        System.out.println("Valor maximo long: "+ Long.MAX_VALUE);
        /*
            tipos primitivos flotantes: float, double
        */
        float numeroFloat = 3.4028235E38F;
        System.out.println("Valor minimo float " + Float.MIN_VALUE);
        System.out.println("Valor maximo float " + Float.MAX_VALUE);

        double numeroDouble = 10;
        System.out.println("Valor minimo double " + Double.MIN_VALUE);
        System.out.println("Valor maximo double " + Double.MAX_VALUE);
        /*
            tipo primitivo char
        */
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);

        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);

        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        /*
            tipo primitivo boolean
        */
        boolean flag = true;
        System.out.println("flag = " + flag);

        if(flag)
        {
            System.out.println("El flag es true");
        }
        else
        {
            System.out.println("El flag es false");
        }

        var edad = 30;
        var esAdulto = edad >= 18;

        if(esAdulto)
        {
            System.out.println("Eres mayor de edad");
        }
        else
        {
            System.out.println("Eres menor de edad");
        }


    }
}
