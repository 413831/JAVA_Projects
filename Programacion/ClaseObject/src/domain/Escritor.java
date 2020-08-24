package domain;

public class Escritor extends Empleado
{
    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura escritura)
    {
        super(nombre,sueldo);
        this.tipoEscritura = escritura;
    }

    @Override
    public String obtenerDetalles()
    {
        return super.obtenerDetalles() + ", tipoEscritura: " + this.tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura()
    {
        return this.tipoEscritura;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Escritor{");
        sb.append("tipoEscritura=").append(tipoEscritura);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
