package Ejercicio_7;

import java.util.ArrayList;
import java.util.List;

public class Equipo extends Participante {
    private String nombreEquipo;
    private String entrenador;
    private List<Esquiador> esquiadores;

    public Equipo(String idParticipante, String nombreEquipo, String entrenador) {
        super(idParticipante);
        this.nombreEquipo = nombreEquipo;
        this.entrenador = entrenador;
        this.esquiadores = new ArrayList<>();
    }

    public void agregarEsquiador(Esquiador esquiador) {
        if (!esquiadores.contains(esquiador)) {
            esquiadores.add(esquiador);
        }
    }

    public int getCantidadEsquiadores() {
        return esquiadores.size();
    }

    // Getters y setters
    public String getNombreEquipo() { return nombreEquipo; }
    public void setNombreEquipo(String nombreEquipo) { this.nombreEquipo = nombreEquipo; }

    public String getEntrenador() { return entrenador; }
    public void setEntrenador(String entrenador) { this.entrenador = entrenador; }

    public List<Esquiador> getEsquiadores() { return esquiadores; }

    @Override
    public String toString() {
        return "Equipo{nombre='" + nombreEquipo + "', entrenador='" + entrenador +
               "', cantidad=" + getCantidadEsquiadores() + "}";
    }
}
