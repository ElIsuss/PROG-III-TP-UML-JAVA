package Ejercicio_2;
import java.util.ArrayList;
import java.util.List;

public class Pais {

    private String nombre;
    private List<Provincia> provincias;
    private Ciudad ciudadCapital;
    private Continente continente;
    private List<Pais> paisesLimitrofes;

    public Pais(String nombre, Continente continente) {
        this.nombre = nombre;
        this.continente = continente;
        this.provincias = new ArrayList<>();
        this.paisesLimitrofes = new ArrayList<>();

        continente.agregarPais(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public Ciudad getCiudadCapital() {
        return ciudadCapital;
    }

    public void setCiudadCapital(Ciudad ciudadCapital) {
        this.ciudadCapital = ciudadCapital;
    }

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public List<Pais> getPaisesLimitrofes() {
        return paisesLimitrofes;
    }

    public void agregarProvincia(Provincia provincia) {
        if (!provincias.contains(provincia)) {
            provincias.add(provincia);
        }
    }

    public void agregarPaisLimitrofe(Pais pais) {
        if (!paisesLimitrofes.contains(pais)) {
            paisesLimitrofes.add(pais);
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
}