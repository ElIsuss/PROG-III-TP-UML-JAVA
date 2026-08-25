package Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Excurcion {
    private String codigo;
    private String dia;
    private String hora;
    // Una Excursión tiene M Visitantes (relación N:M)
    private List<Visitante> visitantes;

    // Constructor
    public Excurcion(String codigo, String dia, String hora) {
        this.codigo = codigo;
        this.dia = dia;
        this.hora = hora;
        this.visitantes = new ArrayList<>();
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public List<Visitante> getVisitantes() {
        return visitantes;
    }

    public void agregarVisitante(Visitante visitante) {
        this.visitantes.add(visitante);
    }
}
