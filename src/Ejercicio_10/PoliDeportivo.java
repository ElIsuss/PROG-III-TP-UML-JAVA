package Ejercicio_10;

public class PoliDeportivo extends ComplejoDeportivo {

    private String deportes;

    public PoliDeportivo(String localizacion, String deportes) {
        super(localizacion);
        this.deportes = deportes;
    }

    public String getDeportes() {
        return deportes;
    }

    public void setDeportes(String deportes) {
        this.deportes = deportes;
    }

    @Override
    public String toString() {
        return "PoliDeportivo{" +
                "localizacion='" + getLocalizacion() + '\'' +
                ", deportes='" + deportes + '\'' +
                '}';
    }
}