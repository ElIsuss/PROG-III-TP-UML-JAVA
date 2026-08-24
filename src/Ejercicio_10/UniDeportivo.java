package Ejercicio_10;

public class UniDeportivo extends ComplejoDeportivo {

    private String deporte;

    public UniDeportivo(String localizacion, String deporte) {
        super(localizacion);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "UniDeportivo{" +
                "localizacion='" + getLocalizacion() + '\'' +
                ", deporte='" + deporte + '\'' +
                '}';
    }
}