import java.util.ArrayList;
import java.util.Scanner;

/**
 * Invitado: puede ver brawlers y hacerlos combatir, pero no crearlos.
 */
public class Guest extends Usuario {

    public Guest(String nombre, String password) {
        super(nombre, password);
    }

    @Override
    public void menu(ArrayList<Brawler> brawlers, Scanner sc) {
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("1. Ver brawlers");
            System.out.println("2. Combatir");
            System.out.println("3. Cerrar sesión");
            System.out.println();
            System.out.print("OPCION: ");
            opcion = Integer.parseInt(sc.nextLine());
            System.out.println();

            if (opcion == 1) {
                verBrawlers(brawlers);
            } else if (opcion == 2) {
                combatir(brawlers, sc);
            } else if (opcion == 3) {
                System.out.println("Sesión cerrada");
                System.out.println();
            } else {
                System.out.println("Opción no válida");
                System.out.println();
            }
        }
    }

    // Enfrenta a dos brawlers elegidos por nombre
    private void combatir(ArrayList<Brawler> brawlers, Scanner sc) {
        System.out.print("Nombre del brawler 1: ");
        Brawler b1 = buscarBrawler(brawlers, sc.nextLine());
        System.out.print("Nombre del brawler 2: ");
        Brawler b2 = buscarBrawler(brawlers, sc.nextLine());

        if (b1 == null || b2 == null) {
            System.out.println("Uno de los brawlers no se ha encontrado...");
        } else {
            // Estado inicial
            System.out.println(b1);
            System.out.println(b2);
            System.out.println();

            // Turno del brawler 1
            b1.accion(b2);
            System.out.println(b2);
            System.out.println();

            // Turno del brawler 2
            b2.accion(b1);
            System.out.println(b1);
        }
        System.out.println();
    }

    // Busca un brawler por su nombre. Si no lo encuentra, devuelve null
    private Brawler buscarBrawler(ArrayList<Brawler> brawlers, String nombre) {
        for (Brawler b : brawlers) {
            if (b.getNombre().equals(nombre)) {
                return b;
            }
        }
        return null;
    }
}