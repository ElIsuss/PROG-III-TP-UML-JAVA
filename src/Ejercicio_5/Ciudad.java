package Ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {

    private String nombre;
    private List<Restaurante> restaurantes;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.restaurantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void agregarRestaurante(Restaurante restaurante) {
        restaurantes.add(restaurante);
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}