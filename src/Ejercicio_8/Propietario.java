package Ejercicio_8;

import java.util.ArrayList;
import java.util.List;

public class Propietario extends Persona {
    // Relación muchos a muchos con Avion
    private List<Avion> aviones;

    public Propietario(String nroSeguridadSocial, String nombre, String direccion, String telefono) {
        super(nroSeguridadSocial, nombre, direccion, telefono);
        this.aviones = new ArrayList<>();
    }

    public void agregarAvion(Avion avion) {
        if (!aviones.contains(avion)) {
            aviones.add(avion);
            avion.agregarPropietario(this);
        }
    }

    public List<Avion> getAviones() { return aviones; }

    @Override
    public String toString() {
        return "Propietario{nombre='" + getNombre() + "', aviones=" + aviones.size() + "}";
    }
}
