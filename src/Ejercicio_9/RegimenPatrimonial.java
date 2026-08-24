package Ejercicio_9;

/**
 * Interfaz que representa el régimen patrimonial de un objeto de arte.
 * En Java no existe herencia múltiple de clases, por lo que el segundo
 * eje de jerarquía del diagrama (Permanente / EnPrestamo) se modela
 * como una interfaz que ObjetoDeArte referencia por composición.
 */
public interface RegimenPatrimonial {
    String getTipoRegimen();
    String getResumenRegimen();
}
