package Ejercicio_9;

import java.time.LocalDate;

/**
 * Régimen patrimonial: la obra pertenece de forma permanente al museo.
 */
public class Permanente implements RegimenPatrimonial {
    private LocalDate fechaAdquisicion;
    private double coste;
    private String estado;

    public Permanente(LocalDate fechaAdquisicion, double coste, String estado) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.coste = coste;
        this.estado = estado;
    }

    @Override
    public String getTipoRegimen() { return "Permanente"; }

    @Override
    public String getResumenRegimen() {
        return "Adquirida: " + fechaAdquisicion + " | Coste: " + coste + "€ | Estado: " + estado;
    }

    public LocalDate getFechaAdquisicion() { return fechaAdquisicion; }
    public void setFechaAdquisicion(LocalDate fechaAdquisicion) { this.fechaAdquisicion = fechaAdquisicion; }

    public double getCoste() { return coste; }
    public void setCoste(double coste) { this.coste = coste; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Permanente{adquisicion=" + fechaAdquisicion + ", coste=" + coste + ", estado='" + estado + "'}";
    }
}
