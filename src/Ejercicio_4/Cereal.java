package Ejercicio_4;

import java.util.ArrayList;
import java.util.List;

public class Cereal {
    private String nombre;
    private TipoCereal tipo;
    private List<Mineral> mineralesRequeridos;

    public Cereal(String nombre, TipoCereal tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.mineralesRequeridos = new ArrayList<>();
    }

    public void agregarMineralRequerido(Mineral mineral) {
        mineralesRequeridos.add(mineral);
    }
    
    public boolean esAptoPara(Lote lote) {
        if (!lote.contieneTodos(mineralesRequeridos)) {
            return false;
        }
        if (tipo == TipoCereal.PASTURA && lote.isPasturaSembradaPreviamente()) {
            return false;
        }

        return true;
    }

    
    public String getNombre() {
        return nombre;
    }

    public TipoCereal getTipo() {
        return tipo;
    }

    public List<Mineral> getMineralesRequeridos() {
        return mineralesRequeridos;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ")";
    }
}