package Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Visitante {
    private String dni;
    private String nombre;
    private String direccion;
    private String profesion;
    // Un Visitante tiene 1..n RegistrosVisita
    private List<RegistroVisita> registrosVisita;
    // Un Visitante puede tener estadías en alojamientos (relación con Estacia)
    private List<Estacia> estadias;

    // Constructor
    public Visitante(String dni, String nombre, String direccion, String profesion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.profesion = profesion;
        this.registrosVisita = new ArrayList<>();
        this.estadias = new ArrayList<>();
    }

    // Getters y Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public List<RegistroVisita> getRegistrosVisita() {
        return registrosVisita;
    }

    public void agregarRegistroVisita(RegistroVisita registro) {
        this.registrosVisita.add(registro);
    }

    public List<Estacia> getEstadias() {
        return estadias;
    }

    public void agregarEstadia(Estacia estacia) {
        this.estadias.add(estacia);
    }
}
