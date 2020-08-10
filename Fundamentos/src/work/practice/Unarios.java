package work.practice;

public class Unarios {
    public static void main(String[] args)
    {
        /*
            Operadores unarios
         */
        var a = 3;
        var b = -a; // Se invierte el valor de a
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // incremento
        // 1.preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e; // Primero se incrementa la variable y luego se utiliza su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        // 2.postincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++; // Primseo se utiliza el valor y luego se incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        // decremento
        // 1.predecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        // 2.postdecremento
        var k = 3;
        var m = k--;
        System.out.println("k = " + k);
        System.out.println("m = " + m);

    }
}
