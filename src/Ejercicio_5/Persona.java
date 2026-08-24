package Ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private List<Restaurante> restaurantesFrecuentados;
    private List<Preferencia> preferencias;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.restaurantesFrecuentados = new ArrayList<>();
        this.preferencias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Restaurante> getRestaurantesFrecuentados() {
        return restaurantesFrecuentados;
    }

    public void frecuentar(Restaurante restaurante) {
        restaurantesFrecuentados.add(restaurante);
        restaurante.agregarPersona(this);
    }

    public List<Preferencia> getPreferencias() {
        return preferencias;
    }

    public void agregarPreferencia(Preferencia preferencia) {
        preferencias.add(preferencia);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
