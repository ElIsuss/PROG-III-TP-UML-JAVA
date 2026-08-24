package Ejercicio_10;

public class Material {

    private String nombre;
    private int cantidad;
    private Evento evento;

    public Material(String nombre, int cantidad, Evento evento) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.evento = evento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Evento getEvento() {
        return evento;
    }

    @Override
    public String toString() {
        return "Material{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}