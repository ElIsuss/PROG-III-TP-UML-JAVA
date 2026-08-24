package Ejercicio_10;

import java.util.ArrayList;
import java.util.List;

public class Comisario {

    private String nombre;
    private List<Evento> Eventos;

    public Comisario(String nombre) {
        this.nombre = nombre;
        this.Eventos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Evento> getEventos() {
        return Eventos;
    }

    public void asignarEvento(Evento evento) {
        Eventos.add(evento);
        evento.agregarComisario(this);
    }

    @Override
    public String toString() {
        return "Comisario{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
