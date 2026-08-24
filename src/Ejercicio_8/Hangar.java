package Ejercicio_8;

import java.util.ArrayList;
import java.util.List;

public class Hangar {
    private int numero;
    private int capacidad;
    private String ubicacion;
    // Un hangar puede guardar muchos aviones (hasta su capacidad)
    private List<Avion> aviones;

    public Hangar(int numero, int capacidad, String ubicacion) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.aviones = new ArrayList<>();
    }

    public boolean agregarAvion(Avion avion) {
        if (aviones.size() >= capacidad) {
            System.out.println("Hangar " + numero + " lleno. No se puede agregar " + avion.getMatricula());
            return false;
        }
        if (!aviones.contains(avion)) {
            aviones.add(avion);
        }
        return true;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public List<Avion> getAviones() { return aviones; }

    @Override
    public String toString() {
        return "Hangar{numero=" + numero + ", ubicacion='" + ubicacion +
               "', aviones=" + aviones.size() + "/" + capacidad + "}";
    }
}
