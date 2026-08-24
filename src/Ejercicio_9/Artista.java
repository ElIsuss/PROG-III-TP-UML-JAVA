package Ejercicio_9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate fechaDefuncion; // null si sigue vivo
    private String paisOrigen;
    private String epoca;
    private String estiloPrincipal;
    private String descripcion;
    private List<ObjetoDeArte> obras;

    public Artista(String nombre, LocalDate fechaNacimiento, LocalDate fechaDefuncion, String paisOrigen, String epoca, String estiloPrincipal, String descripcion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDefuncion = fechaDefuncion;
        this.paisOrigen = paisOrigen;
        this.epoca = epoca;
        this.estiloPrincipal = estiloPrincipal;
        this.descripcion = descripcion;
        this.obras = new ArrayList<>();
    }

    public void agregarObra(ObjetoDeArte obra) {
        if (!obras.contains(obra)) {
            obras.add(obra);
        }
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public LocalDate getFechaDefuncion() { return fechaDefuncion; }
    public void setFechaDefuncion(LocalDate fechaDefuncion) { this.fechaDefuncion = fechaDefuncion; }

    public String getPaisOrigen() { return paisOrigen; }
    public void setPaisOrigen(String paisOrigen) { this.paisOrigen = paisOrigen; }

    public String getEpoca() { return epoca; }
    public void setEpoca(String epoca) { this.epoca = epoca; }

    public String getEstiloPrincipal() { return estiloPrincipal; }
    public void setEstiloPrincipal(String estiloPrincipal) { this.estiloPrincipal = estiloPrincipal; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public List<ObjetoDeArte> getObras() { return obras; }

    @Override
    public String toString() {
        String defuncion = (fechaDefuncion != null) ? fechaDefuncion.toString() : "vivo/a";
        return "Artista{nombre='" + nombre + "', origen='" + paisOrigen +
               "', epoca='" + epoca + "', estilo='" + estiloPrincipal +
               "', nacimiento=" + fechaNacimiento + ", defuncion=" + defuncion + "}";
    }
}
