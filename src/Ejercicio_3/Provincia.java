package Ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre;
    private List<Ciudad> ciudades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public void agregarCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
    }

    
    public List<Ciudad> getCiudadesElegibles() {
        List<Ciudad> elegibles = new ArrayList<>();
        for (Ciudad c : ciudades) {
            if (c.isElegible()) {
                elegibles.add(c);
            }
        }
        return elegibles;
    }

    
    public List<Ciudad> getCiudadesEnDeficit() {
        List<Ciudad> deficit = new ArrayList<>();
        for (Ciudad c : getCiudadesElegibles()) {
            if (c.isEnDeficit()) {
                deficit.add(c);
            }
        }
        return deficit;
    }

    
    public boolean tieneMayoriaEnDeficit() {
        List<Ciudad> elegibles = getCiudadesElegibles();
        if (elegibles.isEmpty()) {
            return false;
        }
        int totalElegibles = elegibles.size();
        int deficitCount = getCiudadesEnDeficit().size();
        return deficitCount > (totalElegibles / 2.0);
    }

    public String getNombre() {
        return nombre; 
    }
    public List<Ciudad> getCiudades() {
        return ciudades; 
    }
}