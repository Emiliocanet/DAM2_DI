import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Brawler> brawlers = new ArrayList<>();

        int opcion = 0;

        while (opcion != 5) {
            System.out.println("1. Ver brawlers");
            System.out.println("2. Crear brawler legendario");
            System.out.println("3. Crear brawler épico");
            System.out.println("4. Combatir");
            System.out.println("5. Salir");
            System.out.println();
            System.out.print("OPCION: ");
            opcion = Integer.parseInt(sc.nextLine());
            System.out.println();

            if (opcion == 1) {
                // ---------- VER LOS BRAWLERS ----------
                if (brawlers.isEmpty()) {
                    System.out.println("Todavía no hay brawlers creados...");
                } else {
                    for (Brawler b : brawlers) {
                        System.out.println(b);
                    }
                }
                System.out.println();

            } else if (opcion == 2) {
                // ---------- CREAR BRAWLER LEGENDARIO ----------
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Vida: ");
                int vida = Integer.parseInt(sc.nextLine());
                System.out.print("Daño: ");
                int damage = Integer.parseInt(sc.nextLine());

                brawlers.add(new Legendario(nombre, vida, damage));
                System.out.println();

            } else if (opcion == 3) {
                // ---------- CREAR BRAWLER EPICO ----------
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Vida: ");
                int vida = Integer.parseInt(sc.nextLine());
                System.out.print("Suministros: ");
                int suministros = Integer.parseInt(sc.nextLine());

                brawlers.add(new Epico(nombre, vida, suministros));
                System.out.println();

            } else if (opcion == 4) {
                // ---------- COMBATE ----------
                System.out.print("Nombre del brawler 1: ");
                Brawler b1 = buscarBrawler(brawlers, sc.nextLine());
                System.out.print("Nombre del brawler 2: ");
                Brawler b2 = buscarBrawler(brawlers, sc.nextLine());

                if (b1 == null || b2 == null) {
                    System.out.println("Uno de los brawlers no se ha encontrado...");
                } else {
                    // Inician asi
                    System.out.println(b1);
                    System.out.println(b2);
                    System.out.println();

                    // Ahora hace la accion el primer brawler
                    b1.accion(b2);
                    System.out.println(b2);
                    System.out.println();

                    //Ahora tocaria el segundo brawler
                    b2.accion(b1);
                    System.out.println(b1);
                }
                System.out.println();

            } else if (opcion != 5) {
                System.out.println("Opción no válida");
                System.out.println();
            }
        }
    }

    // Busca un brawler por su nombre. Si no lo encuentra, devuelve null
    public static Brawler buscarBrawler(ArrayList<Brawler> brawlers, String nombre) {
        for (Brawler b : brawlers) {
            if (b.getNombre().equals(nombre)) {
                return b;
            }
        }
        return null;
    }
}