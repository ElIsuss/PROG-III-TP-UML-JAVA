package Ejercicio_7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // --- Federaciones ---
        Federacion fedAlpina = new Federacion("Federación Alpina", 350);
        Federacion fedNordica = new Federacion("Federación Nórdica", 200);

        // --- Estaciones ---
        Estacion estacion1 = new Estacion("EST01", "Sierra Nevada", "Juan López",
                "Granada, España", "958-000-000", 120.5, 15);
        estacion1.agregarFederacion(fedAlpina);
        estacion1.agregarFederacion(fedNordica);

        Estacion estacion2 = new Estacion("EST02", "Candanchú", "María García",
                "Huesca, España", "974-000-000", 80.0, 10);
        estacion2.agregarFederacion(fedAlpina);

        // --- Pistas ---
        Pista pista1 = new Pista(1, 3.5, "rojo", estacion1);
        Pista pista2 = new Pista(2, 2.0, "azul", estacion1);
        Pista pista3 = new Pista(1, 5.0, "negro", estacion2);

        // --- Esquiadores (deben estar federados) ---
        Esquiador e1 = new Esquiador("ESQ001", "12345678A", "Carlos", "Martínez",
                25, LocalDate.of(2001, 3, 10), fedAlpina);
        Esquiador e2 = new Esquiador("ESQ002", "87654321B", "Ana", "Ruiz",
                28, LocalDate.of(1998, 7, 22), fedAlpina);
        Esquiador e3 = new Esquiador("ESQ003", "11223344C", "Pedro", "Sánchez",
                30, LocalDate.of(1996, 1, 5), fedNordica);

        // --- Equipo ---
        Equipo equipo1 = new Equipo("EQ001", "Equipo Alpino A", "Roberto Torres");
        equipo1.agregarEsquiador(e1);
        equipo1.agregarEsquiador(e2);

        // --- Campeonato ---
        Campeonato campeonato = new Campeonato("Copa de España de Esquí", 2026);

        // --- Prueba individual (slalom) en estación 1 ---
        Prueba slalom = new Prueba("P001", "Slalom Gigante", "slalom",
                LocalDate.of(2026, 2, 10), LocalDate.of(2026, 2, 11), estacion1);
        slalom.agregarPista(pista1);
        slalom.agregarPista(pista2);
        campeonato.agregarPrueba(slalom);

        // --- Prueba por equipos (descenso) en estación 2 ---
        Prueba descenso = new Prueba("P002", "Descenso Classic", "fondo",
                LocalDate.of(2026, 2, 15), LocalDate.of(2026, 2, 15), estacion2);
        descenso.agregarPista(pista3);
        campeonato.agregarPrueba(descenso);

        // --- Inscripciones ---
        // Carlos compite individualmente en slalom
        Inscripcion ins1 = new Inscripcion(1, e1, slalom);
        ins1.agregarFechaCompeticion(LocalDate.of(2026, 2, 10));
        ins1.registrarResultado(95.4, 1);

        // Ana compite individualmente en slalom
        Inscripcion ins2 = new Inscripcion(2, e2, slalom);
        ins2.agregarFechaCompeticion(LocalDate.of(2026, 2, 10));
        ins2.registrarResultado(97.1, 2);

        // El equipo compite en descenso
        Inscripcion ins3 = new Inscripcion(1, equipo1, descenso);
        ins3.agregarFechaCompeticion(LocalDate.of(2026, 2, 15));
        ins3.registrarResultado(310.5, 1);

        // Registrar vencedores
        slalom.registrarVencedor(e1, 95.4);
        descenso.registrarVencedor(equipo1, 310.5);

        // --- Mostrar resultados ---
        System.out.println("=== " + campeonato + " ===\n");

        for (Prueba p : campeonato.getPruebas()) {
            System.out.println("Prueba: " + p.getNombre() + " (" + p.getTipo() + ")");
            System.out.println("  Estación: " + p.getEstacion().getNombre());
            System.out.println("  Pistas utilizadas:");
            for (Pista pista : p.getPistas()) {
                System.out.println("    " + pista);
            }
            System.out.println("  Inscripciones:");
            for (Inscripcion ins : p.getInscripciones()) {
                System.out.println("    " + ins);
            }
            if (p.getVencedor() != null) {
                System.out.println("  Vencedor: " + p.getVencedor().getIdParticipante() +
                                   " - Tiempo: " + p.getTiempoVencedor() + "s");
            }
            System.out.println();
        }

        System.out.println("=== Federaciones ===");
        System.out.println(fedAlpina + " - Esquiadores: " + fedAlpina.getEsquiadores().size());
        System.out.println(fedNordica + " - Esquiadores: " + fedNordica.getEsquiadores().size());
        System.out.println("\n=== Estación con múltiples federaciones ===");
        System.out.println(estacion1.getNombre() + " administrada por:");
        for (Federacion f : estacion1.getFederaciones()) {
            System.out.println("  - " + f.getNombre());
        }
    }
}
