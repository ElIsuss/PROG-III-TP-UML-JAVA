package Ejercicio_10;

public class AreaDeportiva {

    private String deporte;
    private String situacion;
    private ComplejoDeportivo complejo;

    public AreaDeportiva(String deporte, String situacion, ComplejoDeportivo complejo) {
        this.deporte = deporte;
        this.situacion = situacion;
        this.complejo = complejo;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public ComplejoDeportivo getComplejo() {
        return complejo;
    }

    @Override
    public String toString() {
        return "AreaDeportiva{" +
                "deporte='" + deporte + '\'' +
                ", situacion='" + situacion + '\'' +
                '}';
    }
}