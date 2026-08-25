package Ejercicio_6;

public class Parque {
    private String nombre;
    private String fechaDeclaracion; // O LocalDate, según prefieras manejar fechas

    // Constructor
    public Parque(String nombre, String fechaDeclaracion) {
        this.nombre = nombre;
        this.fechaDeclaracion = fechaDeclaracion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeclaracion() {
        return fechaDeclaracion;
    }

    public void setFechaDeclaracion(String fechaDeclaracion) {
        this.fechaDeclaracion = fechaDeclaracion;
    }
}