package Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Alojamiento {
    private String nombre;
    private int capacidad;
    private String categoria;
    // Un Alojamiento organiza 1..n Excursiones
    private List<Excurcion> excursiones;

    // Constructor
    public Alojamiento(String nombre, int capacidad, String categoria) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.categoria = categoria;
        this.excursiones = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Excurcion> getExcursiones() {
        return excursiones;
    }

    public void agregarExcursion(Excurcion excurcion) {
        this.excursiones.add(excurcion);
    }
}
