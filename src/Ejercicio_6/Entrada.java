package Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Entrada {
    private int numEntrada;
    // Una Entrada es vigilada por 1..n Celadores
    private List<Celador> celadores;

    // Constructor
    public Entrada(int numEntrada) {
        this.numEntrada = numEntrada;
        this.celadores = new ArrayList<>();
    }

    // Getters y Setters
    public int getNumEntrada() {
        return numEntrada;
    }

    public void setNumEntrada(int numEntrada) {
        this.numEntrada = numEntrada;
    }

    public List<Celador> getCeladores() {
        return celadores;
    }

    public void agregarCelador(Celador celador) {
        this.celadores.add(celador);
    }
}
