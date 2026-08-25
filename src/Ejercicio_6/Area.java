package Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private String nombre;
    private double km2;
    // Un Area tiene relaciones Habita con Especies
    private List<Habita> habitantes;

    // Constructor
    public Area(String nombre, double km2) {
        this.nombre = nombre;
        this.km2 = km2;
        this.habitantes = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getKm2() {
        return km2;
    }

    public void setKm2(double km2) {
        this.km2 = km2;
    }

    public List<Habita> getHabitantes() {
        return habitantes;
    }

    public void agregarHabita(Habita habita) {
        this.habitantes.add(habita);
    }
}
