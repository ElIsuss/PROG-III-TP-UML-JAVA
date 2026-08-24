package Ejercicio_9;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // =============================================
        // ARTISTAS
        // =============================================
        Artista velazquez = new Artista(
                "Diego Velázquez",
                LocalDate.of(1599, 6, 6),
                LocalDate.of(1660, 8, 6),
                "España", "Barroco", "Realismo barroco",
                "Pintor de la corte de Felipe IV, maestro del retrato y la luz.");

        Artista rodin = new Artista(
                "Auguste Rodin",
                LocalDate.of(1840, 11, 12),
                LocalDate.of(1917, 11, 17),
                "Francia", "Modernismo", "Escultura expresionista",
                "Considerado el padre de la escultura moderna.");

        Artista kahlo = new Artista(
                "Frida Kahlo",
                LocalDate.of(1907, 7, 6),
                LocalDate.of(1954, 7, 13),
                "México", "Surrealismo", "Arte naïf / Surrealismo",
                "Conocida por sus autorretratos autobiográficos.");

        // =============================================
        // REGÍMENES PATRIMONIALES
        // =============================================
        Permanente regPermanente1 = new Permanente(
                LocalDate.of(1995, 3, 20), 2500000.0, "Excelente");

        Permanente regPermanente2 = new Permanente(
                LocalDate.of(2001, 7, 14), 800000.0, "Bueno");

        ColeccionExterna colLouvre = new ColeccionExterna(
                "Museo del Louvre", "Museo nacional",
                "Colección nacional de Francia con obras de todas las épocas.",
                "Rue de Rivoli, París, Francia", "+33-1-40-20-50-50", "Marie Dupont");

        ColeccionExterna colMoMA = new ColeccionExterna(
                "MoMA Nueva York", "Museo de arte moderno",
                "Colección de arte moderno y contemporáneo.",
                "11 W 53rd St, New York, USA", "+1-212-708-9400", "James Smith");

        EnPrestamo regPrestamo1 = new EnPrestamo(
                "Museo del Louvre",
                LocalDate.of(2026, 1, 15),
                LocalDate.of(2026, 9, 30),
                colLouvre);

        EnPrestamo regPrestamo2 = new EnPrestamo(
                "MoMA Nueva York",
                LocalDate.of(2026, 3, 1),
                LocalDate.of(2026, 12, 31),
                colMoMA);

        // =============================================
        // OBRAS DE ARTE
        // =============================================
        Pintura lasMeninas = new Pintura(
                "OBJ-001", "Las Meninas",
                "Obra maestra del Barroco español.",
                1656, velazquez, regPermanente1,
                "Óleo", "Lienzo", "Realismo barroco");

        Pintura autoretrato = new Pintura(
                "OBJ-002", "Autorretrato con collar de espinas",
                "Autorretrato icónico con simbolismo de sufrimiento y resistencia.",
                1940, kahlo, regPrestamo1,
                "Óleo", "Lienzo", "Surrealismo");

        Escultura elPensador = new Escultura(
                "OBJ-003", "El Pensador",
                "Figura de un hombre en meditación profunda.",
                1904, rodin, regPermanente2,
                "Bronce", 1.86, 700.0, "Expresionismo");

        Otro instalacion = new Otro(
                "OBJ-004", "Raíces",
                "Instalación que explora la identidad y los vínculos con la tierra natal.",
                1943, kahlo, regPrestamo2,
                "Instalación / técnica mixta");

        // =============================================
        // EXPOSICIONES
        // =============================================
        Exposicion expBarroco = new Exposicion(
                "El Arte del Barroco",
                LocalDate.of(2026, 2, 1),
                LocalDate.of(2026, 6, 30));

        Exposicion expModerno = new Exposicion(
                "Arte Moderno Internacional",
                LocalDate.of(2026, 4, 1),
                LocalDate.of(2026, 10, 31));

        expBarroco.agregarObra(lasMeninas);
        expBarroco.agregarObra(elPensador);
        expModerno.agregarObra(autoretrato);
        expModerno.agregarObra(instalacion);
        expModerno.agregarObra(elPensador); // aparece en ambas exposiciones

        // =============================================
        // SALIDA EN CONSOLA
        // =============================================
        System.out.println("====================================================");
        System.out.println("              MUSEO - SISTEMA DE GESTIÓN");
        System.out.println("====================================================\n");

        // Artistas y sus obras
        System.out.println("--- ARTISTAS ---");
        for (Artista a : new Artista[]{velazquez, rodin, kahlo}) {
            System.out.println(a);
            System.out.println("  Obras en el museo:");
            for (ObjetoDeArte o : a.getObras()) {
                System.out.println("    · [" + o.getClass().getSimpleName() + "] " +
                                   o.getTitulo() + " (" + o.getAnioCreacion() + ")");
                System.out.println("      Régimen: " + o.getRegimen().getTipoRegimen() +
                                   " | " + o.getRegimen().getResumenRegimen());
            }
            System.out.println();
        }

        // Exposiciones y sus obras
        System.out.println("--- EXPOSICIONES ---");
        for (Exposicion e : new Exposicion[]{expBarroco, expModerno}) {
            System.out.println(e);
            for (ObjetoDeArte o : e.getObras())
                System.out.println("  · " + o.getTitulo() + " — " + o.getArtista().getNombre() +
                                   " [" + o.getClass().getSimpleName() + "]");
            System.out.println();
        }

        // Relación n:n verificada: obras y sus exposiciones
        System.out.println("--- OBRAS Y SUS EXPOSICIONES ---");
        for (ObjetoDeArte o : new ObjetoDeArte[]{lasMeninas, autoretrato, elPensador, instalacion}) {
            System.out.println(o);
            System.out.println("  Aparece en " + o.getExposiciones().size() + " exposición/es:");
            for (Exposicion e : o.getExposiciones())
                System.out.println("    · " + e.getNombre() +
                                   " (" + e.getFechaComienzo() + " → " + e.getFechaFinalizacion() + ")");
            System.out.println();
        }

        // Colecciones externas
        System.out.println("--- COLECCIONES EXTERNAS ---");
        for (ColeccionExterna col : new ColeccionExterna[]{colLouvre, colMoMA}) {
            System.out.println(col);
            System.out.println("  Dirección: " + col.getDireccion());
            System.out.println("  Contacto:  " + col.getPersonaContacto() + " | " + col.getTelefono());
            System.out.println("  Obras prestadas al museo:");
            for (EnPrestamo ep : col.getObrasEnPrestamo())
                System.out.println("    · Recibido: " + ep.getFechaRecibido() +
                                   " | Devolución: " + ep.getFechaDevolucion());
            System.out.println();
        }
    }
}
