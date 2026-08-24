package Ejercicio_10;

import java.util.ArrayList;
import java.util.List;

public class SedeOlimpica {

    private int numComplejos;
    private int presupuestoAprox;
    private List<ComplejoDeportivo> complejos;

    public SedeOlimpica(int numComplejos, int presupuestoAprox) {
        this.numComplejos = numComplejos;
        this.presupuestoAprox = presupuestoAprox;
        this.complejos = new ArrayList<>();
    }

    public int getNumComplejos() {
        return numComplejos;
    }

    public void setNumComplejos(int numComplejos) {
        this.numComplejos = numComplejos;
    }

    public int getPresupuestoAprox() {
        return presupuestoAprox;
    }

    public void setPresupuestoAprox(int presupuestoAprox) {
        this.presupuestoAprox = presupuestoAprox;
    }

    public List<ComplejoDeportivo> getComplejos() {
        return complejos;
    }

    public void agregarComplejo(ComplejoDeportivo complejo) {
        complejos.add(complejo);
    }

    @Override
    public String toString() {
        return "SedeOlimpica{" +
                "numComplejos=" + numComplejos +
                ", presupuestoAprox=" + presupuestoAprox +
                '}';
    }
}