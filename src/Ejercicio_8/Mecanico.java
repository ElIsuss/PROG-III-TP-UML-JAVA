package Ejercicio_8;

import java.util.ArrayList;
import java.util.List;

public class Mecanico extends Persona {
    private double salario;
    private String turno;
    // Relación muchos a muchos con TipoAvion (tipos que puede mantener)
    private List<TipoAvion> tiposAutorizados;
    // Servicios realizados por este mecánico
    private List<Servicios> serviciosRealizados;

    public Mecanico(String nroSeguridadSocial, String nombre, String direccion,
                    String telefono, double salario, String turno) {
        super(nroSeguridadSocial, nombre, direccion, telefono);
        this.salario = salario;
        this.turno = turno;
        this.tiposAutorizados = new ArrayList<>();
        this.serviciosRealizados = new ArrayList<>();
    }

    public void autorizarTipoAvion(TipoAvion tipo) {
        if (!tiposAutorizados.contains(tipo)) {
            tiposAutorizados.add(tipo);
            tipo.agregarMecanico(this);
        }
    }

    public void agregarServicio(Servicios servicio) {
        serviciosRealizados.add(servicio);
    }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    public List<TipoAvion> getTiposAutorizados() { return tiposAutorizados; }
    public List<Servicios> getServiciosRealizados() { return serviciosRealizados; }

    @Override
    public String toString() {
        return "Mecanico{nombre='" + getNombre() + "', turno='" + turno +
               "', salario=" + salario + "}";
    }
}
