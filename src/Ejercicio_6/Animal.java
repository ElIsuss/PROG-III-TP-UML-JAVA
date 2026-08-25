package Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Animal extends Especie {
    private String periodoCelo;
    private String tipoAlimentacion;
    // Un Animal se alimenta de 1..n Vegetales
    private List<Vegetal> seAlimentaDe;

    // Constructor
    public Animal(String nombreCientifico, String nombreVulgar, String periodoCelo, String tipoAlimentacion) {
        super(nombreCientifico, nombreVulgar);
        this.periodoCelo = periodoCelo;
        this.tipoAlimentacion = tipoAlimentacion;
        this.seAlimentaDe = new ArrayList<>();
    }

    // Getters y Setters
    public String getPeriodoCelo() {
        return periodoCelo;
    }

    public void setPeriodoCelo(String periodoCelo) {
        this.periodoCelo = periodoCelo;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public List<Vegetal> getSeAlimentaDe() {
        return seAlimentaDe;
    }

    public void agregarVegetal(Vegetal vegetal) {
        this.seAlimentaDe.add(vegetal);
    }
}
