package com.gm.mundopc.domain;

import java.util.Objects;

public class Orden
{
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 20;

    public Orden()
    {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora)
    {
        if(!Objects.isNull(computadora) && contadorComputadoras < Orden.MAX_COMPUTADORAS)
        {
            for (int i = 0; i < this.computadoras.length ; i++)
            {
                if(Objects.isNull(this.computadoras[i]))
                {
                    this.computadoras[i] = computadora;
                    break;
                }
            }
        }
    }

    public void mostrarOrden()
    {
        final StringBuilder sb = new StringBuilder("Id Orden =");
        sb.append(this.idOrden).append('\n');

        for (int i = 0; i < this.computadoras.length; i++)
        {
            if(!Objects.isNull(this.computadoras[i]))
            {
                sb.append(this.computadoras[i]).append('\n');
            }
        }
        System.out.println(sb.toString());
    }
}
