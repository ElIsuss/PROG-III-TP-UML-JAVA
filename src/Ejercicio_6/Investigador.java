package Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Investigador extends Personal {
    // Un Investigador participa en proyectos a través de la clase Investiga
    private List<Investiga> investigaciones;

    // Constructor
    public Investigador(String dni, String nombre, String direccion, String telefono,
                        double sueldo, String numSeguroSocial) {
        super(dni, nombre, direccion, telefono, sueldo, numSeguroSocial);
        this.investigaciones = new ArrayList<>();
    }

    // Getters y Setters
    public List<Investiga> getInvestigaciones() {
        return investigaciones;
    }

    public void agregarInvestigacion(Investiga investiga) {
        this.investigaciones.add(investiga);
    }
}
