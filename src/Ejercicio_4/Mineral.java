package Ejercicio_4;


import java.util.Objects;

public class Mineral {
    private String nombre;
    private TipoMineral tipo;

    public Mineral(String nombre, TipoMineral tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoMineral getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mineral mineral = (Mineral) o;
        return Objects.equals(nombre, mineral.nombre) && tipo == mineral.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipo);
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ")";
    }
}