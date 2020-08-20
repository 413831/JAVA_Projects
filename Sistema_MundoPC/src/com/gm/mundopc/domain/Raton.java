package com.gm.mundopc.domain;

public class Raton extends DispositivoEntrada
{
    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca)
    {
        super(tipoEntrada,marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    public int getIdRaton()
    {
        return this.idRaton;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Raton{");
        sb.append("idRaton=").append(idRaton);
        sb.append(super.toString()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
