package Ejercicio_5;

public class Preferencia {

    private Persona persona;
    private Restaurante restaurante;
    private Plato plato;
    private boolean leGusta;

    public Preferencia(Persona persona, Restaurante restaurante, Plato plato, boolean leGusta) {
        this.persona = persona;
        this.restaurante = restaurante;
        this.plato = plato;
        this.leGusta = leGusta;
    }

    public Persona getPersona() {
        return persona;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public Plato getPlato() {
        return plato;
    }

    public boolean isLeGusta() {
        return leGusta;
    }

    public void setLeGusta(boolean leGusta) {
        this.leGusta = leGusta;
    }

    @Override
    public String toString() {
        return "Preferencia{" +
                "persona=" + persona.getNombre() +
                ", restaurante=" + restaurante.getNombre() +
                ", plato=" + plato.getNombre() +
                ", leGusta=" + leGusta +
                '}';
    }
}