package Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public abstract class Figura {

    private List<Figura> figuras;

    public Figura() {
        this.figuras = new ArrayList<>();
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }
}