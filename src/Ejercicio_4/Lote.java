package Ejercicio_4;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private String nombre;
    private List<Mineral> minerales;
    private boolean pasturaSembradaPreviamente;

    public Lote(String nombre) {
        this.nombre = nombre;
        this.minerales = new ArrayList<>();
        this.pasturaSembradaPreviamente = false;
    }

    public void agregarMineral(Mineral mineral) {
        minerales.add(mineral);
    }

    public boolean contieneMineral(Mineral mineral) {
        return minerales.contains(mineral);
    }
    
    public boolean contieneTodos(List<Mineral> requeridos) {
        return minerales.containsAll(requeridos);
    }
    
    public List<Cereal> recomendarCereales(List<Cereal> catalogo) {
        List<Cereal> aptos = new ArrayList<>();
        for (Cereal cereal : catalogo) {
            if (cereal.esAptoPara(this)) {
                aptos.add(cereal);
            }
        }
        return aptos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public List<Mineral> getMinerales() {
        return minerales;
    }

    public boolean isPasturaSembradaPreviamente() {
        return pasturaSembradaPreviamente;
    }

    public void setPasturaSembradaPreviamente(boolean pasturaSembradaPreviamente) {
        this.pasturaSembradaPreviamente = pasturaSembradaPreviamente;
    }

    @Override
    public String toString() {
        return "Lote " + nombre + " (minerales: " + minerales + ", pastura previa: " + pasturaSembradaPreviamente + ")";
    }
}