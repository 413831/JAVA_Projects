package work.basico;

public class  Operadores
{
    public static void main(String[] args)
    {
        /*
            Operadores aritmeticos
         */
        int a = 3;
        int b = 2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        
        var resultado2 = 3F / b;
        System.out.println("resultado division = " + resultado2);

        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);

        System.out.println("Valor de a = " + a);
        a += 1;
        System.out.println("a += 1 = " + a);

        a -= 1;
        System.out.println("a -= 1 = " + a);

        a *= 2;
        System.out.println("a *= 2 = " + a);

        a /= 2;
        System.out.println("a /= 2 = " + a);

        a %= 2;
        System.out.println("a %= 2 = " + a);
    }

}
