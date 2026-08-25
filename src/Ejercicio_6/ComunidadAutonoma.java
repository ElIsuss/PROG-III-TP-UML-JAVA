package Ejercicio_6;

public class ComunidadAutonoma {
    private String nombre;
    private String organizacionResponsable;

    // Constructor
    public ComunidadAutonoma(String nombre, String organizacionResponsable) {
        this.nombre = nombre;
        this.organizacionResponsable = organizacionResponsable;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrganizacionResponsable() {
        return organizacionResponsable;
    }

    public void setOrganizacionResponsable(String organizacionResponsable) {
        this.organizacionResponsable = organizacionResponsable;
    }
}