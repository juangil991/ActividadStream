package co.com.sofka;

import java.time.LocalDate;

public class Factura {
   private final String descripcion;
   private final int importe;
   private final int cantidad;
   private final LocalDate fecha;
   private final String Codigo;

    public Factura(String descripcion, int importe,int cantidad, LocalDate fecha, String codigo) {
        this.descripcion = descripcion;
        this.importe = importe;
        this.cantidad=cantidad;
        this.fecha = fecha;
        Codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImporte() {
        return importe;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getCodigo() {
        return Codigo;
    }
}
