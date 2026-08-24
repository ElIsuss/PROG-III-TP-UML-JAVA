package Ejercicio_10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {

    private LocalDate fecha;
    private int duracion;
    private int numParticipantes;
    private int numComisarios;
    private ComplejoDeportivo complejo;
    private List<Comisario> Comisarios;
    private List<Material> materiales;

    public Evento(LocalDate fecha, int duracion, int numParticipantes, int numComisarios, ComplejoDeportivo complejo) {
        this.fecha = fecha;
        this.duracion = duracion;
        this.numParticipantes = numParticipantes;
        this.numComisarios = numComisarios;
        this.complejo = complejo;
        this.Comisarios = new ArrayList<>();
        this.materiales = new ArrayList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNumParticipantes() {
        return numParticipantes;
    }

    public void setNumParticipantes(int numParticipantes) {
        this.numParticipantes = numParticipantes;
    }

    public int getNumComisarios() {
        return numComisarios;
    }

    public void setNumComisarios(int numComisarios) {
        this.numComisarios = numComisarios;
    }

    public ComplejoDeportivo getComplejo() {
        return complejo;
    }

    public List<Comisario> getComisarios() {
        return Comisarios;
    }

    public void agregarComisario(Comisario comisario) {
        Comisarios.add(comisario);
    }

    public List<Material> getMateriales() {
        return materiales;
    }

    public void agregarMaterial(Material material) {
        materiales.add(material);
    }

    @Override
    public String toString() {
        return "Evento{" +
                "fecha=" + fecha +
                ", duracion=" + duracion +
                ", numParticipantes=" + numParticipantes +
                ", numComisarios=" + numComisarios +
                '}';
    }
}
