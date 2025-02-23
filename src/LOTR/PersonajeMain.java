package LOTR;

/**
 * Clase Main de Personaje LOTR
 * @author Ian del Castillo
 * @version 1.0
 * @since 2025
 */
public class PersonajeMain {
    public static void main(String[] args) {

        Personaje p1 = new Personaje("Legolas", "Elfo", "Arquero",3000);
        Personaje p2 = new Personaje("Gimli", "Enano", "Guerrero",130);
        Personaje p3 = new Personaje("Aragorn", "Hombre", "Duelista",90);

        p1.mostrarDatos();
        p2.mostrarDatos();
        p3.mostrarDatos();

        System.out.println("Total de personajes creados: " + contarPersonajes(3));
    }

    /**
     * Cuenta el número de personajes creados.
     * @param cantidad Número de personajes instanciados.
     * @return Mensaje con la cantidad de personajes creados.
     */
    public static String contarPersonajes(int cantidad) {
        return "Se han creado " + cantidad + " personajes.";
    }
}