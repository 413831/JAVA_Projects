package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos
{
    public static void main(String[] args)
    {
        var nombreArchivo = "test.txt";
        // Creacion de archivo
        //crear(nombreArchivo);

        // Escritura de archivo
        // escribir(nombreArchivo,"Hola desde Java");

        // Agregar datos a archivo
        //agregar(nombreArchivo, "Adios");

        // Leer datos de archivo
        leer(nombreArchivo);
    }
}
