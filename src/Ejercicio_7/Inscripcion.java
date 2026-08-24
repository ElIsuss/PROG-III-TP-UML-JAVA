package Ejercicio_7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private String codigoInscripcion; // nombre de la prueba + dorsal
    private int dorsal;
    private double tiempoEmpleado;
    private int posicion;
    private Participante participante;
    private Prueba prueba;
    // Fechas en las que el participante compite en esta prueba (puede ser varios días)
    private List<LocalDate> fechasCompeticion;

    public Inscripcion(int dorsal, Participante participante, Prueba prueba) {
        this.dorsal = dorsal;
        this.participante = participante;
        this.prueba = prueba;
        // El código se forma con el nombre de la prueba y el dorsal
        this.codigoInscripcion = prueba.getNombre() + "-" + dorsal;
        this.fechasCompeticion = new ArrayList<>();
        prueba.agregarInscripcion(this);
    }

    public void agregarFechaCompeticion(LocalDate fecha) {
        fechasCompeticion.add(fecha);
    }

    public void registrarResultado(double tiempoEmpleado, int posicion) {
        this.tiempoEmpleado = tiempoEmpleado;
        this.posicion = posicion;
    }

    // Getters y setters
    public String getCodigoInscripcion() { return codigoInscripcion; }

    public int getDorsal() { return dorsal; }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
        this.codigoInscripcion = prueba.getNombre() + "-" + dorsal;
    }

    public double getTiempoEmpleado() { return tiempoEmpleado; }
    public void setTiempoEmpleado(double tiempoEmpleado) { this.tiempoEmpleado = tiempoEmpleado; }

    public int getPosicion() { return posicion; }
    public void setPosicion(int posicion) { this.posicion = posicion; }

    public Participante getParticipante() { return participante; }
    public Prueba getPrueba() { return prueba; }
    public List<LocalDate> getFechasCompeticion() { return fechasCompeticion; }

    @Override
    public String toString() {
        return "Inscripcion{codigo='" + codigoInscripcion + "', participante='" +
               participante.getIdParticipante() + "', posicion=" + posicion +
               ", tiempo=" + tiempoEmpleado + "}";
    }
}
