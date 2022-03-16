package co.com.sofka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class FiltrarFacturaTest {

    @Test
    void FiltrarTest(){
        //arrange
        //registros de la data
        Factura f=new Factura("Ordenador",1000,1, LocalDate.of(2020,12,21),"AFX2362");
        Factura f2= new Factura("movil",300,3,LocalDate.of(2022,12,18),"RX6208");
        Factura f3= new Factura("impresora",200,10,LocalDate.of(2022,01,01),"HG4835");
        Factura f4 = new Factura("imac",1500,1,LocalDate.of(2021,12,16),"MAC3854");
        Factura f5=new Factura("Ordenador",1000,15, LocalDate.now(),"AFZ2364");
        //generar una lista
        List<Factura> lista = new ArrayList<Factura>();
        //Agregar los productos de la factura
        lista.add(f);
        lista.add(f2);
        lista.add(f3);
        lista.add(f4);
        lista.add(f5);


        //act
        Factura facturaDescription= FiltrarFactura.filterFirstByDescription(lista,"Ordenador");
        List<Factura> facturasDescription= FiltrarFactura.filterByDescription(lista,"Ordenador");
        Factura firsImporte=FiltrarFactura.filterFirstByImporte(lista,200);
        List<Factura> facturasImporte=FiltrarFactura.filterByImporte(lista,1000);
        Factura facturaCantidad = FiltrarFactura.filterFirstByCantidadGreater(lista,10);
        Factura fechaAfter= FiltrarFactura.filterFirstByFechaIsAfter(lista,LocalDate.of(2021,01,02));
        Factura fechaBefore=FiltrarFactura.filterFirstByFechaIsBefore(lista,LocalDate.of(2022,12,16));
        Factura facturaCodigo=FiltrarFactura.filterFirsByCodigo(lista,"MAC3854");


        //assert
        Assertions.assertEquals("Ordenador",facturaDescription.getDescripcion());
        Assertions.assertEquals("AFX2362",facturaDescription.getCodigo());
        Assertions.assertEquals("AFX2362",facturasDescription.get(0).getCodigo());
        Assertions.assertEquals("AFZ2364",facturasDescription.get(1).getCodigo());
        Assertions.assertEquals(1,facturasImporte.get(0).getCantidad());
        Assertions.assertEquals(15,facturasImporte.get(1).getCantidad());
        Assertions.assertEquals(2,facturasImporte.size());
        Assertions.assertEquals("impresora",firsImporte.getDescripcion());
        Assertions.assertEquals("impresora",firsImporte.getDescripcion());
        Assertions.assertEquals("Ordenador",facturaCantidad.getDescripcion());
        Assertions.assertEquals("movil",fechaAfter.getDescripcion());
        Assertions.assertEquals("AFX2362",fechaBefore.getCodigo());
        Assertions.assertEquals("imac",facturaCodigo.getDescripcion());

    }

}