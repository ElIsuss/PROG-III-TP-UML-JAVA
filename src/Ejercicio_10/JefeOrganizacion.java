package Ejercicio_10;

public class JefeOrganizacion {

    private String nombre;
    private ComplejoDeportivo complejo;

    public JefeOrganizacion(String nombre, ComplejoDeportivo complejo) {
        this.nombre = nombre;
        this.complejo = complejo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ComplejoDeportivo getComplejo() {
        return complejo;
    }

    @Override
    public String toString() {
        return "JefeOrganizacion{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}