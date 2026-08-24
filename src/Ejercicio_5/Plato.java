package Ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Plato {

    private String nombre;
    private Restaurante restaurante;
    private List<Preferencia> preferencias;

    public Plato(String nombre, Restaurante restaurante) {
        this.nombre = nombre;
        this.restaurante = restaurante;
        this.preferencias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public List<Preferencia> getPreferencias() {
        return preferencias;
    }

    public void agregarPreferencia(Preferencia preferencia) {
        preferencias.add(preferencia);
    }

    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}