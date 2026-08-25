package Ejercicio_2;

public class Main {

    public static void main(String[] args) {

        // Crear continente
        Continente americaDelSur = new Continente("América del Sur");

        // Crear países
        Pais argentina = new Pais("Argentina", americaDelSur);
        Pais chile = new Pais("Chile", americaDelSur);
        Pais bolivia = new Pais("Bolivia", americaDelSur);

        // Capital de Argentina
        Ciudad buenosAires = new Ciudad("Buenos Aires");
        argentina.setCiudadCapital(buenosAires);

        // Provincias argentinas
        Provincia mendoza = new Provincia("Mendoza");
        Provincia sanJuan = new Provincia("San Juan");
        Provincia sanLuis = new Provincia("San Luis");

        // Agregar provincias a Argentina
        argentina.agregarProvincia(mendoza);
        argentina.agregarProvincia(sanJuan);
        argentina.agregarProvincia(sanLuis);

        // Ciudades de Mendoza
        Ciudad ciudadMendoza = new Ciudad("Ciudad de Mendoza");
        Ciudad sanRafael = new Ciudad("San Rafael");

        mendoza.agregarCiudad(ciudadMendoza);
        mendoza.agregarCiudad(sanRafael);

        // Capital de Mendoza
        mendoza.setCiudadCapital(ciudadMendoza);

        // Ciudades de San Juan
        Ciudad ciudadSanJuan = new Ciudad("Ciudad de San Juan");

        sanJuan.agregarCiudad(ciudadSanJuan);
        sanJuan.setCiudadCapital(ciudadSanJuan);

        // Ciudades de San Luis
        Ciudad ciudadSanLuis = new Ciudad("Ciudad de San Luis");

        sanLuis.agregarCiudad(ciudadSanLuis);
        sanLuis.setCiudadCapital(ciudadSanLuis);

        // Países limítrofes
        argentina.agregarPaisLimitrofe(chile);
        argentina.agregarPaisLimitrofe(bolivia);
        chile.agregarPaisLimitrofe(argentina);
        bolivia.agregarPaisLimitrofe(argentina);

        // Provincias limítrofes
        mendoza.agregarProvinciaLimitrofe(sanJuan);
        mendoza.agregarProvinciaLimitrofe(sanLuis);

        sanJuan.agregarProvinciaLimitrofe(mendoza);
        sanLuis.agregarProvinciaLimitrofe(mendoza);

        // Mostrar información
        System.out.println("País: " + argentina);
        System.out.println("Continente: " + argentina.getContinente());
        System.out.println("Capital: " + argentina.getCiudadCapital());

        System.out.println("\nProvincias:");

        for (Provincia provincia : argentina.getProvincias()) {
            System.out.println("- " + provincia);
            System.out.println("  Capital: " + provincia.getCiudadCapital());

            System.out.println("  Ciudades:");
            for (Ciudad ciudad : provincia.getCiudades()) {
                System.out.println("    - " + ciudad);
            }
        }

        System.out.println("\nPaíses limítrofes:");

        for (Pais pais : argentina.getPaisesLimitrofes()) {
            System.out.println("- " + pais);
        }

        System.out.println("\nProvincias limítrofes de Mendoza:");

        for (Provincia provincia : mendoza.getProvinciasLimitrofes()) {
            System.out.println("- " + provincia);
        }
    }
}