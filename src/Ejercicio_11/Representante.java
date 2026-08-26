package Ejercicio_11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Representante {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected LocalDate fechaNacimiento;
    protected String cuitCuil;
    protected LocalDate fechaIncorporacion;
    protected List<Cliente> clientes;
    protected List<Ticket> tickets;

    public Representante(String nombre, String direccion, String telefono, LocalDate fechaNacimiento, String cuitCuil, LocalDate fechaIncorporacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuitCuil = cuitCuil;
        this.fechaIncorporacion = fechaIncorporacion;
        this.clientes = new ArrayList<>();
        this.tickets = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void registrarVenta(Ticket ticket, Cliente cliente) {
        
        if (!tickets.contains(ticket)) {
            throw new IllegalArgumentException("El ticket no pertenece a este representante.");
        }
        ticket.concretarVenta(cliente);
    }

    public double getTotalVentasDesde(LocalDate desde, LocalDate hasta) {
        double total = 0.0;
        for (Ticket t : tickets) {
            if (!t.estaVendido()) {
                continue;
            }
            LocalDate fecha = t.getFecha();
            boolean despuesDeDesde = (desde == null || fecha.isAfter(desde));
            boolean antesOIgualAHasta = (fecha.isEqual(hasta) || fecha.isBefore(hasta));
            if (despuesDeDesde && antesOIgualAHasta) {
                total += t.getPrecioAbonado();
            }
        }
        return total;
    }

    public abstract double calcularComision(double porcentaje, LocalDate desde, LocalDate hasta);

    public String getNombre() {
        return nombre;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void agregarTicket(Ticket ticket) {
        tickets.add(ticket);
    }
}