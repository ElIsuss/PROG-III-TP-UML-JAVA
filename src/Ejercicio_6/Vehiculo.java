package Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    private String tipo;
    private String matricula;
    // Un Vehiculo es usado por M Guardas (relación N:M con Guarda)
    private List<Guarda> guardas;

    // Constructor
    public Vehiculo(String tipo, String matricula) {
        this.tipo = tipo;
        this.matricula = matricula;
        this.guardas = new ArrayList<>();
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Guarda> getGuardas() {
        return guardas;
    }

    public void agregarGuarda(Guarda guarda) {
        this.guardas.add(guarda);
    }
}
