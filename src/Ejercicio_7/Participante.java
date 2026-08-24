package Ejercicio_7;

public abstract class Participante {
    protected String idParticipante;

    public Participante(String idParticipante) {
        this.idParticipante = idParticipante;
    }

    public String getIdParticipante() { return idParticipante; }
    public void setIdParticipante(String idParticipante) { this.idParticipante = idParticipante; }

    @Override
    public String toString() {
        return "Participante{id='" + idParticipante + "'}";
    }
}
