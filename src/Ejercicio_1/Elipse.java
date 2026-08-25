package Ejercicio_1;

public class Elipse extends Figura {

    private double radioMayor;
    private double radioMenor;

    public Elipse(double radioMayor, double radioMenor) {
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public double getRadioMayor() {
        return radioMayor;
    }

    public double getRadioMenor() {
        return radioMenor;
    }
}