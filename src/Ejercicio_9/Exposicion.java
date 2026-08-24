package Ejercicio_9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exposicion {
    private String nombre;
    private LocalDate fechaComienzo;
    private LocalDate fechaFinalizacion;
    // Relación muchos a muchos con ObjetoDeArte
    private List<ObjetoDeArte> obras;

    public Exposicion(String nombre, LocalDate fechaComienzo, LocalDate fechaFinalizacion) {
        this.nombre = nombre;
        this.fechaComienzo = fechaComienzo;
        this.fechaFinalizacion = fechaFinalizacion;
        this.obras = new ArrayList<>();
    }

    public void agregarObra(ObjetoDeArte obra) {
        if (!obras.contains(obra)) {
            obras.add(obra);
            obra.agregarExposicion(this);
        }
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalDate getFechaComienzo() { return fechaComienzo; }
    public void setFechaComienzo(LocalDate fechaComienzo) { this.fechaComienzo = fechaComienzo; }

    public LocalDate getFechaFinalizacion() { return fechaFinalizacion; }
    public void setFechaFinalizacion(LocalDate fechaFinalizacion) { this.fechaFinalizacion = fechaFinalizacion; }

    public List<ObjetoDeArte> getObras() { return obras; }

    @Override
    public String toString() {
        return "Exposicion{nombre='" + nombre + "', desde=" + fechaComienzo +
               ", hasta=" + fechaFinalizacion + ", obras=" + obras.size() + "}";
    }
}
