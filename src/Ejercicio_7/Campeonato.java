package Ejercicio_7;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private String nombre;
    private int anio;
    private List<Prueba> pruebas;

    public Campeonato(String nombre, int anio) {
        this.nombre = nombre;
        this.anio = anio;
        this.pruebas = new ArrayList<>();
    }

    public void agregarPrueba(Prueba prueba) {
        pruebas.add(prueba);
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public List<Prueba> getPruebas() { return pruebas; }

    @Override
    public String toString() {
        return "Campeonato{nombre='" + nombre + "', anio=" + anio +
               ", pruebas=" + pruebas.size() + "}";
    }
}
