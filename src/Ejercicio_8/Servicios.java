package Ejercicio_8;

import java.time.LocalDate;

// Clase asociativa entre Mecanico y Avion
public class Servicios {
    private LocalDate fecha;
    private int horasInvertidas;
    private String tipoTrabajo;
    private Mecanico mecanico;
    private Avion avion;

    public Servicios(LocalDate fecha, int horasInvertidas, String tipoTrabajo,
                     Mecanico mecanico, Avion avion) {
        this.fecha = fecha;
        this.horasInvertidas = horasInvertidas;
        this.tipoTrabajo = tipoTrabajo;
        this.mecanico = mecanico;
        this.avion = avion;
        // Registro bidireccional
        mecanico.agregarServicio(this);
        avion.agregarServicio(this);
    }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public int getHorasInvertidas() { return horasInvertidas; }
    public void setHorasInvertidas(int horasInvertidas) { this.horasInvertidas = horasInvertidas; }

    public String getTipoTrabajo() { return tipoTrabajo; }
    public void setTipoTrabajo(String tipoTrabajo) { this.tipoTrabajo = tipoTrabajo; }

    public Mecanico getMecanico() { return mecanico; }
    public Avion getAvion() { return avion; }

    @Override
    public String toString() {
        return "Servicio{fecha=" + fecha + ", trabajo='" + tipoTrabajo +
               "', horas=" + horasInvertidas + ", mecanico='" + mecanico.getNombre() +
               "', avion='" + avion.getMatricula() + "'}";
    }
}
