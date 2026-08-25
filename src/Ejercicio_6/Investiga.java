package Ejercicio_6;

// Clase de asociación entre Investigador y Proyecto
public class Investiga {
    private Investigador investigador;
    private Proyecto proyecto;

    // Constructor
    public Investiga(Investigador investigador, Proyecto proyecto) {
        this.investigador = investigador;
        this.proyecto = proyecto;
    }

    // Getters y Setters
    public Investigador getInvestigador() {
        return investigador;
    }

    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
}
