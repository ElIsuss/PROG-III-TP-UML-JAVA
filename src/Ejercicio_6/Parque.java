package Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Parque {
    private String nombre;
    private String fechaDeclaracion;
    // Un Parque tiene 1..n Areas (composición)
    private List<Area> areas;
    // Un Parque tiene 1..n Alojamientos (composición)
    private List<Alojamiento> alojamientos;
    // Un Parque tiene 1..n Personal
    private List<Personal> personal;
    // Un Parque tiene 1..n Entradas
    private List<Entrada> entradas;

    // Constructor
    public Parque(String nombre, String fechaDeclaracion) {
        this.nombre = nombre;
        this.fechaDeclaracion = fechaDeclaracion;
        this.areas = new ArrayList<>();
        this.alojamientos = new ArrayList<>();
        this.personal = new ArrayList<>();
        this.entradas = new ArrayList<>();
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

    public List<Area> getAreas() {
        return areas;
    }

    public void agregarArea(Area area) {
        this.areas.add(area);
    }

    public List<Alojamiento> getAlojamientos() {
        return alojamientos;
    }

    public void agregarAlojamiento(Alojamiento alojamiento) {
        this.alojamientos.add(alojamiento);
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public void agregarPersonal(Personal p) {
        this.personal.add(p);
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void agregarEntrada(Entrada entrada) {
        this.entradas.add(entrada);
    }
}