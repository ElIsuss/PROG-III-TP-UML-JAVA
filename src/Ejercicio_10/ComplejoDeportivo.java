package Ejercicio_10;

import java.util.ArrayList;
import java.util.List;

public class ComplejoDeportivo {

    private String localizacion;
    private List<AreaDeportiva> areas;
    private List<Evento> Eventos;
    private Comisario comisario;
    private JefeOrganizacion jefeOrganizacion;

    public ComplejoDeportivo(String localizacion) {
        this.localizacion = localizacion;
        this.areas = new ArrayList<>();
        this.Eventos = new ArrayList<>();
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public List<AreaDeportiva> getAreas() {
        return areas;
    }

    public void agregarArea(AreaDeportiva area) {
        areas.add(area);
    }

    public List<Evento> getEventos() {
        return Eventos;
    }

    public void agregarEvento(Evento evento) {
        Eventos.add(evento);
    }

    public Comisario getComisario() {
        return comisario;
    }

    public void setComisario(Comisario comisario) {
        this.comisario = comisario;
    }

    public JefeOrganizacion getJefeOrganizacion() {
        return jefeOrganizacion;
    }

    public void setJefeOrganizacion(JefeOrganizacion jefeOrganizacion) {
        this.jefeOrganizacion = jefeOrganizacion;
    }

    @Override
    public String toString() {
        return "ComplejoDeportivo{" +
                "localizacion='" + localizacion + '\'' +
                '}';
    }
}