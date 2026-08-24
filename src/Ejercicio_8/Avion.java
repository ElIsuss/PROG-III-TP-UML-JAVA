package Ejercicio_8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Avion {
    private String matricula;
    private LocalDate fechaAdquisicion;
    // Un avión pertenece a un único TipoAvion
    private TipoAvion tipoAvion;
    // Un avión se guarda en un único Hangar
    private Hangar hangar;
    // Relación muchos a muchos con Propietario
    private List<Propietario> propietarios;
    // Servicios recibidos por este avión
    private List<Servicios> servicios;

    public Avion(String matricula, LocalDate fechaAdquisicion, TipoAvion tipoAvion, Hangar hangar) {
        this.matricula = matricula;
        this.fechaAdquisicion = fechaAdquisicion;
        this.tipoAvion = tipoAvion;
        this.hangar = hangar;
        this.propietarios = new ArrayList<>();
        this.servicios = new ArrayList<>();
        hangar.agregarAvion(this);
    }

    public void agregarPropietario(Propietario propietario) {
        if (!propietarios.contains(propietario)) {
            propietarios.add(propietario);
        }
    }

    public void agregarServicio(Servicios servicio) {
        servicios.add(servicio);
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public LocalDate getFechaAdquisicion() { return fechaAdquisicion; }
    public void setFechaAdquisicion(LocalDate fechaAdquisicion) { this.fechaAdquisicion = fechaAdquisicion; }

    public TipoAvion getTipoAvion() { return tipoAvion; }
    public void setTipoAvion(TipoAvion tipoAvion) { this.tipoAvion = tipoAvion; }

    public Hangar getHangar() { return hangar; }
    public void setHangar(Hangar hangar) { this.hangar = hangar; }

    public List<Propietario> getPropietarios() { return propietarios; }
    public List<Servicios> getServicios() { return servicios; }

    @Override
    public String toString() {
        return "Avion{matricula='" + matricula + "', tipo='" + tipoAvion.getNroModelo() +
               "', hangar=" + hangar.getNumero() + "}";
    }
}
