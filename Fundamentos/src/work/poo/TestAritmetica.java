package work.poo;

public class TestAritmetica
{
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.operandoA = 5;
        aritmetica1.operandoB = 3;
        aritmetica1.sumar();

        var resultado = aritmetica1.sumarConRetorno();
        System.out.println("Suma con retorno = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(8,10);
        System.out.println("Suma con argumentos = " + resultado);

        // Prueba constructores
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 operandoA = " + aritmetica2.operandoA);
        System.out.println("aritmetica2 operandoB = " + aritmetica2.operandoB);



    }
}
