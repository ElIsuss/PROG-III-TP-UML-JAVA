package Ejercicio_6;

public class Vegetal extends Especie {
    private boolean tieneFlor;
    private String floreceEn;

    // Constructor
    public Vegetal(String nombreCientifico, String nombreVulgar, boolean tieneFlor, String floreceEn) {
        super(nombreCientifico, nombreVulgar);
        this.tieneFlor = tieneFlor;
        this.floreceEn = floreceEn;
    }

    // Getters y Setters
    public boolean isTieneFlor() {
        return tieneFlor;
    }

    public void setTieneFlor(boolean tieneFlor) {
        this.tieneFlor = tieneFlor;
    }

    public String getFloreceEn() {
        return floreceEn;
    }

    public void setFloreceEn(String floreceEn) {
        this.floreceEn = floreceEn;
    }
}
