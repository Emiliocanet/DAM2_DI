import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // La lista de brawlers es la misma para todos los usuarios y todas las sesiones
        ArrayList<Brawler> brawlers = new ArrayList<>();

        // Usuarios registrados: nombre y contraseña
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Admin("admin", "admin"));
        usuarios.add(new Guest("guest", "guest"));

        int opcion = 0;

        // Pantalla de inicio: se vuelve a ella cada vez que se cierra sesión
        while (opcion != 2) {
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Salir");
            System.out.println();
            System.out.print("OPCION: ");
            opcion = Integer.parseInt(sc.nextLine());
            System.out.println();

            if (opcion == 1) {
                System.out.print("Usuario: ");
                String nombre = sc.nextLine();
                System.out.print("Contraseña: ");
                String password = sc.nextLine();
                System.out.println();

                Usuario usuario = buscarUsuario(usuarios, nombre, password);

                if (usuario == null) {
                    System.out.println("Usuario o contraseña incorrectos...");
                    System.out.println();
                } else {
                    System.out.println("Bienvenido, " + usuario.getNombre());
                    System.out.println();
                    // Cada usuario abre su propio menú (polimorfismo)
                    usuario.menu(brawlers, sc);
                }

            } else if (opcion != 2) {
                System.out.println("Opción no válida");
                System.out.println();
            }
        }
    }

    // Busca un usuario con ese nombre y esa contraseña. Si no existe, devuelve null
    public static Usuario buscarUsuario(ArrayList<Usuario> usuarios, String nombre, String password) {
        for (Usuario u : usuarios) {
            if (u.getNombre().equals(nombre) && u.comprobarPassword(password)) {
                return u;
            }
        }
        return null;
    }
}
