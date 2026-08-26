package Ejercicio_11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lider extends Representante {
    private LocalDate fechaPromocion;
    private List<Vendedor> equipo;

    public Lider(String nombre, String direccion, String telefono, LocalDate fechaNacimiento, String cuitCuil, LocalDate fechaIncorporacion, LocalDate fechaPromocion) {
        super(nombre, direccion, telefono, fechaNacimiento, cuitCuil, fechaIncorporacion);
        this.fechaPromocion = fechaPromocion;
        this.equipo = new ArrayList<>();
    }

    public void agregarVendedor(Vendedor vendedor) {
        equipo.add(vendedor);
    }

    @Override
    public double calcularComision(double porcentaje, LocalDate desde, LocalDate hasta) {
        double total = getTotalVentasDesde(desde, hasta);
        for (Vendedor v : equipo) {
            total += v.getTotalVentasDesde(desde, hasta);
        }
        return porcentaje * total;
    }
}