package Ejercicio_11;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private double porcentajeComision;
    private LocalDate fechaUltimaReunion;
    private LocalDate fechaProximaReunion;
    private List<Representante> representantes;
    private List<Producto> productos;

    public Empresa(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
        this.representantes = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.fechaUltimaReunion = null;
        this.fechaProximaReunion = null;
    }

    public void agregarRepresentante(Representante r) {
        representantes.add(r);
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    
    public Ticket emitirTicket(Representante representante, Producto producto, LocalDate fecha) {
        Ticket ticket = new Ticket(fecha, producto, producto.getPrecio());
        representante.agregarTicket(ticket);
        return ticket;
    }

    public void realizarReunion(LocalDate fechaReunion, LocalDate fechaProxima) {
        liquidarComisiones(fechaUltimaReunion, fechaReunion);
        this.fechaUltimaReunion = fechaReunion;
        this.fechaProximaReunion = fechaProxima;
    }

    private void liquidarComisiones(LocalDate desde, LocalDate hasta) {
        System.out.println("----LIQUIDACIÓN DE COMISIONES----");
        System.out.println("Período: " + (desde == null ? "inicio" : desde) + " - " + hasta);
        for (Representante r : representantes) {
            double comision = r.calcularComision(porcentajeComision, desde, hasta);
            System.out.println(r.getNombre() + ": $" + comision);
        }
        System.out.println("____________________________________");
    }

    public LocalDate getFechaUltimaReunion() {
        return fechaUltimaReunion;
    }

    public LocalDate getFechaProximaReunion() {
        return fechaProximaReunion;
    }
}