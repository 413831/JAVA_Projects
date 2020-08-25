package colecciones;

import java.util.*;

public class ManejoColecciones
{
    public static void main(String[] args)
    {
        List lista = new ArrayList();
        lista.add(3);
        lista.add("1");
        lista.add(5);
        lista.add(4);
        imprimir(lista);

        Set set = new HashSet();
        set.add("100");
        set.add("300");
        set.add("200");
        set.add("300");
        imprimir(set);

        Map mapa = new HashMap();
        // key , value
        mapa.put(1,"Pepito");
        mapa.put(2,"Manolo");
        mapa.put(3,"Pancho");
        mapa.put(4,"Nancy");
        // Llave repetida
        mapa.put(4,"Pepito");
        // imprimimos llaves
        imprimir(mapa.keySet());
        // imprimimos valores
        imprimir(mapa.values());
        // Imprimir un valor
        System.out.println(mapa.get(1));
    }

    private static void imprimir(Collection collection)
    {
        System.out.println("Colleccion = " + collection);
    }
}
