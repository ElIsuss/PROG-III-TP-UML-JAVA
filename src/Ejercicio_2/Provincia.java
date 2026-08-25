package Ejercicio_2;
import java.util.ArrayList;
import java.util.List;

public class Provincia {

    private String nombre;
    private List<Ciudad> ciudades;
    private Ciudad ciudadCapital;
    private List<Provincia> provinciasLimitrofes;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
        this.provinciasLimitrofes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public Ciudad getCiudadCapital() {
        return ciudadCapital;
    }

    public void setCiudadCapital(Ciudad ciudadCapital) {
        this.ciudadCapital = ciudadCapital;
    }

    public List<Provincia> getProvinciasLimitrofes() {
        return provinciasLimitrofes;
    }

    public void agregarCiudad(Ciudad ciudad) {
        if (!ciudades.contains(ciudad)) {
            ciudades.add(ciudad);
        }
    }

    public void agregarProvinciaLimitrofe(Provincia provincia) {
        if (!provinciasLimitrofes.contains(provincia)) {
            provinciasLimitrofes.add(provincia);
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
}