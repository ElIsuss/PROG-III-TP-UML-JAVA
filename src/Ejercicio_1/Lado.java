package Ejercicio_1;

public class Lado {

    private Punto puntoInicio;
    private Punto puntoFin;

    public Lado(Punto puntoInicio, Punto puntoFin) {
        this.puntoInicio = puntoInicio;
        this.puntoFin = puntoFin;
    }

    public Punto getPuntoInicio() {
        return puntoInicio;
    }

    public Punto getPuntoFin() {
        return puntoFin;
    }
}
