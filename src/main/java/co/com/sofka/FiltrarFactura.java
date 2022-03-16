package co.com.sofka;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FiltrarFactura {

    public FiltrarFactura(List<Factura> facturas) {
    }

    public static Factura filterFirstByDescription(List<Factura> facturas, String description){
        Objects.requireNonNull(facturas);
        Objects.requireNonNull(description);
        return facturas.stream()
                .filter(factura->factura.getDescripcion().equals(description))
                .findFirst()
                .orElseThrow();
    }

    public static List<Factura> filterByDescription(List<Factura>facturas,String description){
        Objects.requireNonNull(facturas);
        Objects.requireNonNull(description);
        return facturas.stream()
                .filter(factura->factura.getDescripcion().equals(description))
                .collect(Collectors.toList());
    }

    public static Factura filterFirstByImporte(List<Factura> facturas,int importe){
        Objects.requireNonNull(facturas);
        Objects.requireNonNull(importe);
        return facturas.stream()
                .filter(factura->factura.getImporte()==importe)
                .findFirst()
                .orElseThrow();
    }

    public static List<Factura> filterByImporte(List<Factura> facturas,int importe){
        Objects.requireNonNull(facturas);
        Objects.requireNonNull(importe);
        return facturas.stream()
                .filter(factura->factura.getImporte()==importe)
                .collect(Collectors.toList());
    }

    public static Factura filterFirstByCantidadGreater(List<Factura> facturas,int cantidad){
        Objects.requireNonNull(facturas);
        Objects.requireNonNull(cantidad);
        return facturas.stream()
                .filter(factura->factura.getCantidad()>cantidad)
                .findFirst()
                .orElseThrow();
    }

    public static Factura filterFirstByFechaIsAfter(List<Factura> facturas, LocalDate fecha){
        Objects.requireNonNull(facturas);
        Objects.requireNonNull(fecha);
        return facturas.stream()
                .filter(factura->factura.getFecha().isAfter(fecha))
                .findFirst()
                .orElseThrow();
    }

    public static Factura filterFirstByFechaIsBefore(List<Factura> facturas, LocalDate fecha){
        Objects.requireNonNull(facturas);
        Objects.requireNonNull(fecha);
        return facturas.stream()
                .filter(factura->factura.getFecha().isBefore(fecha))
                .findFirst()
                .orElseThrow();
    }

    public static Factura filterFirsByCodigo(List<Factura> facturas, String codigo){
        Objects.requireNonNull(facturas);
        Objects.requireNonNull(codigo);
        return facturas.stream()
                .filter(factura->factura.getCodigo().equals(codigo))
                .findFirst()
                .orElseThrow();
    }
}
