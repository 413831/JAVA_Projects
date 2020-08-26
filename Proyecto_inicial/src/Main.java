import domain.Persona;

public class Main
{
    public static void main(String[] args)
    {
        // Tipos primitivos

        int numeroEntero = 10;
        float numeroFloat = 10.5f;
        double numeroDouble = 10.8;
        char letra = 'A';
        long numeroLong = 100;
        byte numeroByte = 100;
        short numeroShort = 27777;
        boolean variableBooleana = true;

        // Tipo Object
        String palabrita = "Pepito";
        Object objeto = new Object();

        // Ejemplo clase
        // Persona personita = new Persona();
        Persona personita = new Persona("Pepito");
        personita.caminar();
        System.out.println(personita.nombre);

    }
}


