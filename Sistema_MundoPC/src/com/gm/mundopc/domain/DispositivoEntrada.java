package com.gm.mundopc.domain;

public class DispositivoEntrada
{
    protected String tipoEntrada;
    protected String marca;


    public DispositivoEntrada(String tipoEntrada, String marca)
    {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    // Getters & Setters

    public String getMarca()
    {
        return this.marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getTipoEntrada()
    {
        return this.tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada)
    {
        this.tipoEntrada = tipoEntrada;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("DispositivoEntrada{");
        sb.append("tipoEntrada='").append(tipoEntrada).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
