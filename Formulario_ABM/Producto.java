import java.time.*;

public class Producto
{
    private String descripcion;
    private float precio;
    private int cantidad;
    private String codigo;
    private String deposito;
    private LocalDateTime fechaIngreso;
    
    public Producto(String descripcion, float precio, int cantidad, String deposito)
    {
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.deposito = deposito;
        this.fechaIngreso = LocalDateTime.now();
        /*this.codigo = getNextCode()*/
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDeposito() {
        return deposito;
    }

    public void setDeposito(String deposito) {
        this.deposito = deposito;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
}