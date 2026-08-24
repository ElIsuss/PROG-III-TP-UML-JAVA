package Ejercicio_7;

public class Pista {
    // Se identifica por el código de la estación + número correlativo
    private int numeroCorrelativo;
    private double longitudKm;
    private String nivelDificultad; // código de colores: verde, azul, rojo, negro
    private Estacion estacion;

    public Pista(int numeroCorrelativo, double longitudKm, String nivelDificultad, Estacion estacion) {
        this.numeroCorrelativo = numeroCorrelativo;
        this.longitudKm = longitudKm;
        this.nivelDificultad = nivelDificultad;
        this.estacion = estacion;
        estacion.agregarPista(this);
    }

    // El identificador compuesto es codigoEstacion + numeroCorrelativo
    public String getIdentificador() {
        return estacion.getCodigoEstacion() + "-" + numeroCorrelativo;
    }

    // Getters y setters
    public int getNumeroCorrelativo() { return numeroCorrelativo; }
    public void setNumeroCorrelativo(int numeroCorrelativo) { this.numeroCorrelativo = numeroCorrelativo; }

    public double getLongitudKm() { return longitudKm; }
    public void setLongitudKm(double longitudKm) { this.longitudKm = longitudKm; }

    public String getNivelDificultad() { return nivelDificultad; }
    public void setNivelDificultad(String nivelDificultad) { this.nivelDificultad = nivelDificultad; }

    public Estacion getEstacion() { return estacion; }

    @Override
    public String toString() {
        return "Pista{id='" + getIdentificador() + "', longitud=" + longitudKm + "km, dificultad='" + nivelDificultad + "'}";
    }
}
