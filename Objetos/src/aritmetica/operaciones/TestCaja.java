package aritmetica.operaciones;

public class TestCaja
{
    public static void main(String[] args)
    {
        Caja caja1;
        Caja caja2;
        int volumenCaja1;
        int volumenCaja2;

        caja1 = new Caja();
        caja1.ancho = 3;
        caja1.alto = 2;
        caja1.profundo = 6;
        volumenCaja1 = caja1.calcularVolumen();

        caja2 = new Caja(3,2,6);
        volumenCaja2 = caja2.calcularVolumen();

        System.out.println("Volumen caja 1 = " + volumenCaja1);
        System.out.println("Volumen caja 2 = " + volumenCaja2);
    }
}
