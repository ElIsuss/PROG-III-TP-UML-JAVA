package Ejercicio_1;
import java.util.ArrayList;
import java.util.List;

public abstract class Poligono extends Figura {

    private int numeroLados;
    private List<Lado> lados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
        this.lados = new ArrayList<>();
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public List<Lado> getLados() {
        return lados;
    }

    public void agregarLado(Lado lado) {
        lados.add(lado);
    }
}