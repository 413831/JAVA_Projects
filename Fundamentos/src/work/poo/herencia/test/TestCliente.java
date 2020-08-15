package work.poo.herencia.test;

import work.poo.herencia.dominio.Cliente;

import java.util.Date;

public class TestCliente
{
    public static void main(String[] args)
    {
        Cliente cliente1 = new Cliente("Pepito", 'm', 25, "Siemprevivas 1234",
                                        new Date(),true);
        System.out.println("cliente1 = " + cliente1);
    }
}
