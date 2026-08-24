package Ejercicio_7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Prueba {
    private String codigoPrueba;
    private String nombre;
    private String tipo; // fondo, slalom, salto, etc.
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Estacion estacion;
    private List<Pista> pistas;
    private List<Inscripcion> inscripciones;
    // Vencedor y su tiempo (se registra al finalizar la prueba)
    private Participante vencedor;
    private double tiempoVencedor;

    public Prueba(String codigoPrueba, String nombre, String tipo,
                  LocalDate fechaInicio, LocalDate fechaFin, Estacion estacion) {
        this.codigoPrueba = codigoPrueba;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estacion = estacion;
        this.pistas = new ArrayList<>();
        this.inscripciones = new ArrayList<>();
    }

    public void agregarPista(Pista pista) {
        // Solo se aceptan pistas de la estación asignada a esta prueba
        if (pista.getEstacion().equals(estacion)) {
            pistas.add(pista);
        } else {
            throw new IllegalArgumentException("La pista no pertenece a la estación de esta prueba.");
        }
    }

    public void agregarInscripcion(Inscripcion inscripcion) {
        inscripciones.add(inscripcion);
    }

    public void registrarVencedor(Participante vencedor, double tiempo) {
        this.vencedor = vencedor;
        this.tiempoVencedor = tiempo;
    }

    // Getters y setters
    public String getCodigoPrueba() { return codigoPrueba; }
    public void setCodigoPrueba(String codigoPrueba) { this.codigoPrueba = codigoPrueba; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }

    public LocalDate getFechaFin() { return fechaFin; }
    public void setFechaFin(LocalDate fechaFin) { this.fechaFin = fechaFin; }

    public Estacion getEstacion() { return estacion; }
    public List<Pista> getPistas() { return pistas; }
    public List<Inscripcion> getInscripciones() { return inscripciones; }

    public Participante getVencedor() { return vencedor; }
    public double getTiempoVencedor() { return tiempoVencedor; }

    @Override
    public String toString() {
        return "Prueba{codigo='" + codigoPrueba + "', nombre='" + nombre +
               "', tipo='" + tipo + "', estacion='" + estacion.getNombre() + "'}";
    }
}
