package Ejercicio_6;

// Clase de asociación entre Area y Especie
// Registra cuántos individuos de una especie habitan en un área
public class Habita {
    private int cantIndividuos;
    private Area area;
    private Especie especie;

    // Constructor
    public Habita(Area area, Especie especie, int cantIndividuos) {
        this.area = area;
        this.especie = especie;
        this.cantIndividuos = cantIndividuos;
    }

    // Getters y Setters
    public int getCantIndividuos() {
        return cantIndividuos;
    }

    public void setCantIndividuos(int cantIndividuos) {
        this.cantIndividuos = cantIndividuos;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
}
