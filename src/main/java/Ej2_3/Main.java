package Ej2_3;

public class Main {
    public static void main(String[] args) {
        Ciudad buenosAires = new Ciudad("CABA", true);
        Ciudad sanrafael = new Ciudad("San Rafael", false);
        Ciudad lasheras = new Ciudad("Las Heras", false);
        Ciudad laplata = new Ciudad("La Plata", false);
        Ciudad mendoza = new Ciudad("Mendoza", true);

        // Crear ciudades para Chile
        Ciudad santiago = new Ciudad("Santiago", true);
        Ciudad valparaiso = new Ciudad("Valparaíso", false);
        Ciudad concepcion = new Ciudad("Concepción", false);

        // Crear provincias para Argentina
        Provincia buenosAiresProvincia = new Provincia("Buenos Aires");
        buenosAiresProvincia.setCiudades(buenosAires);
        buenosAiresProvincia.setCiudades(laplata);

        Provincia mendozaProvincia = new Provincia("Mendoza");
        mendozaProvincia.setCiudades(lasheras);
        mendozaProvincia.setCiudades(sanrafael);
        mendozaProvincia.setCiudades(mendoza);

        // Crear provincias para Chile
        Provincia santiagoProvincia = new Provincia("Santiago");
        santiagoProvincia.setCiudades(santiago);
        santiagoProvincia.setCiudades(valparaiso);

        Provincia concepcionProvincia = new Provincia("Concepción");
        concepcionProvincia.setCiudades(concepcion);

        // Crear el país Argentina
        Pais argentina = new Pais("Argentina", buenosAires);
        argentina.setProvincia(buenosAiresProvincia);
        argentina.setProvincia(mendozaProvincia);

        // Crear el país Chile
        Pais chile = new Pais("Chile", santiago);
        chile.setProvincia(santiagoProvincia);
        chile.setProvincia(concepcionProvincia);

        // Establecer países limítrofes
        argentina.setPaiseLimite(chile);
        chile.setPaiseLimite(argentina);

        // Crear continente y agregar los países
        Continente americaDelSur = new Continente("América del Sur");
        americaDelSur.setPais(argentina);
        americaDelSur.setPais(chile);

        // Ejemplo de cómo acceder a la información:
        System.out.println("País: " + argentina.getNombre());
        System.out.println("Capital: " + argentina.getCapital().getNombre());
        System.out.println("Primera provincia: " + argentina.getProvincia(0).getNombre());
        System.out.println("Segunda provincia: " + argentina.getProvincia(1).getNombre());
        System.out.println("País limítrofe de Argentina: " + argentina.getPaises(0).getNombre());

        System.out.println("\nPaís: " + chile.getNombre());
        System.out.println("Capital: " + chile.getCapital().getNombre());
        System.out.println("Primera provincia: " + chile.getProvincia(0).getNombre());
        System.out.println("Segunda provincia: " + chile.getProvincia(1).getNombre());
        System.out.println("País limítrofe de Chile: " + chile.getPaises(0).getNombre());
    }
}