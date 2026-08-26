package Ejercicio_11;

import java.time.LocalDate;

public class Ticket {
    private LocalDate fecha;
    private Producto producto;
    private double precio;   
    private Cliente clienteFinal;

    public Ticket(LocalDate fecha, Producto producto, double precio) {
        this.fecha = fecha;
        this.producto = producto;
        this.precio = precio;
        this.clienteFinal = null;
    }

    public void concretarVenta(Cliente cliente) {
        if (clienteFinal != null) {
            throw new IllegalStateException("El ticket ya fue vendido");
        }
        this.clienteFinal = cliente;
    }

    public boolean estaVendido() {
        return clienteFinal != null;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getPrecioAbonado() {
        return precio;
    }
}