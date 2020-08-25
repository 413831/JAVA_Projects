package test;

import java.util.*;

public class TestColeccionesGenericas
{
    public static void main(String[] args)
    {
        List<String> dias = new ArrayList<String>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sabado");
        dias.add("Domingo");
        String elemento = dias.get(0);
        System.out.println("elemento =  " + elemento);
        imprimir(dias);

        Set<String> set = new HashSet<>();// Notacion de diamante
        set.add("Enero");
        set.add("Febrero");
        set.add("Marzo");
        set.add("Abril");
        set.add("Mayo");
        set.add("Junio");
        imprimir(set);

        Map<String, String> map = new HashMap<>();
        map.put("Uno","Pepito");
        map.put("Dos","Manuela");
        map.put("Tres","Fercho");

        String valor = map.get("Uno");
        System.out.println("valor = " + valor);

        imprimir(map.keySet());
        imprimir(map.values());
    }

    public static void imprimir(Collection<String> coleccion)
    {
        System.out.println("coleccion = " + coleccion);
    }
}
