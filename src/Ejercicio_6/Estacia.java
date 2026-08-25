package Ejercicio_6;

// Clase de asociación entre Visitante y Alojamiento
public class Estacia {
    private String habitacion;
    private String fechaInicio;
    private String fechaFin;
    private Visitante visitante;
    private Alojamiento alojamiento;

    // Constructor
    public Estacia(String habitacion, String fechaInicio, String fechaFin,
                   Visitante visitante, Alojamiento alojamiento) {
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.visitante = visitante;
        this.alojamiento = alojamiento;
    }

    // Getters y Setters
    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }
}
