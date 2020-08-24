package test;

import accesoDatos.*;

public class TestInterfaces
{
    public static void main(String[] args)
    {
        /* Polimorfismo con interfaces
            Se utilizan dos clases diferentes con la misma implementacion de interfaz
            Cada objeto tendra su propia implementacion pero a su vez comparten la interfaz
        */
        IAccesoDatos datos;

        datos = new ImplementacionMySql();
        //datos.listar();
        imprimir(datos);

        datos = new ImplementacionOracle();
        //datos.listar();
    }

    public static void imprimir(IAccesoDatos datos)
    {
        datos.listar();
    }
}
