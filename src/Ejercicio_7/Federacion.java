package Ejercicio_7;

import java.util.ArrayList;
import java.util.List;

public class Federacion {
    private String nombre;
    private int numFederados;
    private List<Esquiador> esquiadores;
    private List<Estacion> estaciones;

    public Federacion(String nombre, int numFederados) {
        this.nombre = nombre;
        this.numFederados = numFederados;
        this.esquiadores = new ArrayList<>();
        this.estaciones = new ArrayList<>();
    }

    public void agregarEsquiador(Esquiador esquiador) {
        if (!esquiadores.contains(esquiador)) {
            esquiadores.add(esquiador);
        }
    }

    public void agregarEstacion(Estacion estacion) {
        if (!estaciones.contains(estacion)) {
            estaciones.add(estacion);
        }
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getNumFederados() { return numFederados; }
    public void setNumFederados(int numFederados) { this.numFederados = numFederados; }

    public List<Esquiador> getEsquiadores() { return esquiadores; }
    public List<Estacion> getEstaciones() { return estaciones; }

    @Override
    public String toString() {
        return "Federacion{nombre='" + nombre + "', numFederados=" + numFederados + "}";
    }
}
