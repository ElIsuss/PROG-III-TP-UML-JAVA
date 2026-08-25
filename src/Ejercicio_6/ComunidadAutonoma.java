package Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class ComunidadAutonoma {
    private String nombre;
    private String organizacionResponsable;
    // Una ComunidadAutonoma tiene n Parques
    private List<Parque> parques;

    // Constructor
    public ComunidadAutonoma(String nombre, String organizacionResponsable) {
        this.nombre = nombre;
        this.organizacionResponsable = organizacionResponsable;
        this.parques = new ArrayList<>();
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

    public List<Parque> getParques() {
        return parques;
    }

    public void agregarParque(Parque parque) {
        this.parques.add(parque);
    }
}