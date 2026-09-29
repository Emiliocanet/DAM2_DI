import java.util.ArrayList;
import java.util.Scanner;

/**
 * Administrador: puede ver brawlers y crearlos, pero no combatir.
 */
public class Admin extends Usuario {

    public Admin(String nombre, String password) {
        super(nombre, password);
    }

    @Override
    public void menu(ArrayList<Brawler> brawlers, Scanner sc) {
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("1. Ver brawlers");
            System.out.println("2. Crear brawler épico");
            System.out.println("3. Crear brawler legendario");
            System.out.println("4. Cerrar sesión");
            System.out.println();
            System.out.print("OPCION: ");
            opcion = Integer.parseInt(sc.nextLine());
            System.out.println();

            if (opcion == 1) {
                verBrawlers(brawlers);
            } else if (opcion == 2) {
                crearEpico(brawlers, sc);
            } else if (opcion == 3) {
                crearLegendario(brawlers, sc);
            } else if (opcion == 4) {
                System.out.println("Sesión cerrada");
                System.out.println();
            } else {
                System.out.println("Opción no válida");
                System.out.println();
            }
        }
    }

    // Pide los datos de un épico y lo añade a la lista
    private void crearEpico(ArrayList<Brawler> brawlers, Scanner sc) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Vida: ");
        int vida = Integer.parseInt(sc.nextLine());
        System.out.print("Suministros: ");
        int suministros = Integer.parseInt(sc.nextLine());

        brawlers.add(new Epico(nombre, vida, suministros));
        System.out.println();
    }

    // Pide los datos de un legendario y lo añade a la lista
    private void crearLegendario(ArrayList<Brawler> brawlers, Scanner sc) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Vida: ");
        int vida = Integer.parseInt(sc.nextLine());
        System.out.print("Daño: ");
        int damage = Integer.parseInt(sc.nextLine());

        brawlers.add(new Legendario(nombre, vida, damage));
        System.out.println();
    }
}


