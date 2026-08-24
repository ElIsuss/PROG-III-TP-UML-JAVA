package Ejercicio_8;

import java.util.ArrayList;
import java.util.List;

public class TipoAvion {
    private String nroModelo;
    private int capacidad;
    private double peso;
    // Pilotos autorizados para volar este tipo
    private List<Piloto> pilotos;
    // Mecánicos autorizados para mantener este tipo
    private List<Mecanico> mecanicos;

    public TipoAvion(String nroModelo, int capacidad, double peso) {
        this.nroModelo = nroModelo;
        this.capacidad = capacidad;
        this.peso = peso;
        this.pilotos = new ArrayList<>();
        this.mecanicos = new ArrayList<>();
    }

    public void agregarPiloto(Piloto piloto) {
        if (!pilotos.contains(piloto)) {
            pilotos.add(piloto);
        }
    }

    public void agregarMecanico(Mecanico mecanico) {
        if (!mecanicos.contains(mecanico)) {
            mecanicos.add(mecanico);
        }
    }

    public String getNroModelo() { return nroModelo; }
    public void setNroModelo(String nroModelo) { this.nroModelo = nroModelo; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public List<Piloto> getPilotos() { return pilotos; }
    public List<Mecanico> getMecanicos() { return mecanicos; }

    @Override
    public String toString() {
        return "TipoAvion{modelo='" + nroModelo + "', capacidad=" + capacidad +
               ", peso=" + peso + "kg}";
    }
}
