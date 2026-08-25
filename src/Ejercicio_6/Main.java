package Ejercicio_6;

public class Main {
    public static void main(String[] args) {

        // ---- Comunidad Autónoma ----
        ComunidadAutonoma ca = new ComunidadAutonoma("Andalucía", "Junta de Andalucía");

        // ---- Parque ----
        Parque parque = new Parque("Parque Nacional Doñana", "1969-10-28");
        ca.agregarParque(parque);

        // ---- Areas ----
        Area areaMajaral = new Area("Majaral", 150.5);
        Area areaVeta = new Area("La Veta", 200.0);
        parque.agregarArea(areaMajaral);
        parque.agregarArea(areaVeta);

        // ---- Especies ----
        Vegetal romero = new Vegetal("Rosmarinus officinalis", "Romero", true, "Primavera");
        Vegetal retama = new Vegetal("Retama sphaerocarpa", "Retama", true, "Verano");

        Animal lince = new Animal("Lynx pardinus", "Lince ibérico", "Enero-Febrero", "Carnívoro");
        Animal ciervo = new Animal("Cervus elaphus", "Ciervo", "Septiembre-Octubre", "Herbívoro");
        ciervo.agregarVegetal(romero);
        ciervo.agregarVegetal(retama);

        // ---- Habita (Area <-> Especie) ----
        Habita habitaLince = new Habita(areaMajaral, lince, 12);
        Habita habitaCiervo = new Habita(areaVeta, ciervo, 85);
        Habita habitaRomero = new Habita(areaMajaral, romero, 500);
        areaMajaral.agregarHabita(habitaLince);
        areaMajaral.agregarHabita(habitaRomero);
        areaVeta.agregarHabita(habitaCiervo);

        // ---- Personal ----
        Investigador investigador = new Investigador("12345678A", "Ana García", "Calle Luna 1",
                "600111222", 2500.0, "SS-001");
        Celador celador = new Celador("87654321B", "Luis Pérez", "Calle Sol 5",
                "600333444", 1800.0, "SS-002");
        Guarda guarda = new Guarda("11223344C", "María López", "Calle Mar 10",
                "600555666", 2000.0, "SS-003");

        parque.agregarPersonal(investigador);
        parque.agregarPersonal(celador);
        parque.agregarPersonal(guarda);

        // ---- Proyecto e Investiga ----
        Proyecto proyecto = new Proyecto("Conservación del Lince", 50000.0, "2024-01-01", "2025-12-31");
        Investiga investiga = new Investiga(investigador, proyecto);
        investigador.agregarInvestigacion(investiga);

        // ---- Vehículo y Guarda ----
        Vehiculo jeep = new Vehiculo("Jeep", "MAT-1234");
        Vehiculo quad = new Vehiculo("Quad", "MAT-5678");
        guarda.agregarVehiculo(jeep);
        guarda.agregarVehiculo(quad);
        jeep.agregarGuarda(guarda);
        quad.agregarGuarda(guarda);

        // ---- Entradas y Celadores ----
        Entrada entrada1 = new Entrada(1);
        Entrada entrada2 = new Entrada(2);
        entrada1.agregarCelador(celador);
        entrada2.agregarCelador(celador);
        parque.agregarEntrada(entrada1);
        parque.agregarEntrada(entrada2);

        // ---- Visitantes y RegistroVisita ----
        Visitante visitante1 = new Visitante("99887766D", "Carlos Ruiz", "Av. Paz 3", "Biólogo");
        Visitante visitante2 = new Visitante("55443322E", "Sofía Martín", "Calle Norte 7", "Turista");

        visitante1.agregarRegistroVisita(new RegistroVisita("2024-06-15"));
        visitante2.agregarRegistroVisita(new RegistroVisita("2024-06-15"));
        visitante2.agregarRegistroVisita(new RegistroVisita("2024-08-20"));

        // ---- Alojamiento y Excursiones ----
        Alojamiento hotel = new Alojamiento("Hotel Doñana", 50, "3 estrellas");
        parque.agregarAlojamiento(hotel);

        Excurcion excurcion1 = new Excurcion("EXC-001", "2024-06-16", "09:00");
        excurcion1.agregarVisitante(visitante1);
        excurcion1.agregarVisitante(visitante2);
        hotel.agregarExcursion(excurcion1);

        // ---- Estacia (Visitante <-> Alojamiento) ----
        Estacia estacia1 = new Estacia("101", "2024-06-15", "2024-06-18", visitante1, hotel);
        Estacia estacia2 = new Estacia("102", "2024-06-15", "2024-06-17", visitante2, hotel);
        visitante1.agregarEstadia(estacia1);
        visitante2.agregarEstadia(estacia2);

        // ---- Impresión de resultados ----
        System.out.println("=== COMUNIDAD AUTÓNOMA ===");
        System.out.println("Nombre: " + ca.getNombre());
        System.out.println("Organización: " + ca.getOrganizacionResponsable());
        System.out.println("Parques: " + ca.getParques().size());

        System.out.println("\n=== PARQUE ===");
        System.out.println("Nombre: " + parque.getNombre());
        System.out.println("Fecha declaración: " + parque.getFechaDeclaracion());
        System.out.println("Áreas: " + parque.getAreas().size());
        System.out.println("Personal: " + parque.getPersonal().size());
        System.out.println("Entradas: " + parque.getEntradas().size());
        System.out.println("Alojamientos: " + parque.getAlojamientos().size());

        System.out.println("\n=== ÁREAS Y ESPECIES ===");
        for (Area area : parque.getAreas()) {
            System.out.println("Área: " + area.getNombre() + " (" + area.getKm2() + " km²)");
            for (Habita h : area.getHabitantes()) {
                System.out.println("  -> " + h.getEspecie().getNombreVulgar()
                        + " | individuos: " + h.getCantIndividuos());
            }
        }

        System.out.println("\n=== ANIMALES Y ALIMENTACIÓN ===");
        System.out.println(ciervo.getNombreVulgar() + " se alimenta de:");
        for (Vegetal v : ciervo.getSeAlimentaDe()) {
            System.out.println("  -> " + v.getNombreVulgar());
        }

        System.out.println("\n=== PERSONAL ===");
        for (Personal p : parque.getPersonal()) {
            System.out.println(p.getClass().getSimpleName() + ": " + p.getNombre()
                    + " | Sueldo: $" + p.getSueldo());
        }

        System.out.println("\n=== PROYECTO DE INVESTIGACIÓN ===");
        System.out.println("Proyecto: " + proyecto.getNombre());
        System.out.println("Investigador: " + investigador.getInvestigaciones().get(0).getInvestigador().getNombre());

        System.out.println("\n=== VEHÍCULOS DEL GUARDA ===");
        for (Vehiculo v : guarda.getVehiculos()) {
            System.out.println("Vehículo: " + v.getTipo() + " | Matrícula: " + v.getMatricula());
        }

        System.out.println("\n=== EXCURSIÓN ===");
        System.out.println("Excursión: " + excurcion1.getCodigo()
                + " | Día: " + excurcion1.getDia()
                + " | Hora: " + excurcion1.getHora());
        System.out.println("Visitantes en la excursión: " + excurcion1.getVisitantes().size());
        for (Visitante v : excurcion1.getVisitantes()) {
            System.out.println("  -> " + v.getNombre() + " (" + v.getProfesion() + ")");
        }

        System.out.println("\n=== ESTADÍAS ===");
        System.out.println(visitante1.getNombre() + " se aloja en: "
                + visitante1.getEstadias().get(0).getAlojamiento().getNombre()
                + " | Hab: " + visitante1.getEstadias().get(0).getHabitacion());
        System.out.println(visitante2.getNombre() + " se aloja en: "
                + visitante2.getEstadias().get(0).getAlojamiento().getNombre()
                + " | Hab: " + visitante2.getEstadias().get(0).getHabitacion());

        System.out.println("\n=== REGISTROS DE VISITA ===");
        System.out.println(visitante2.getNombre() + " visitó el parque "
                + visitante2.getRegistrosVisita().size() + " vez/veces:");
        for (RegistroVisita r : visitante2.getRegistrosVisita()) {
            System.out.println("  -> " + r.getFecha());
        }
    }
}
