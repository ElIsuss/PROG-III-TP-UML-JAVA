package Ejercicio_5;

public class Sucursal {

    private String ubicacion;
    private Restaurante restaurante;

    public Sucursal(String ubicacion, Restaurante restaurante) {
        this.ubicacion = ubicacion;
        this.restaurante = restaurante;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "ubicacion='" + ubicacion + '\'' +
                '}';
    }
}