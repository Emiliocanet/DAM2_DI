import java.util.ArrayList;
import java.util.Scanner;

public abstract class Usuario {
    private String nombre;
    private String password;

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    // Devuelve true si la contraseña escrita es la correcta
    public boolean comprobarPassword(String password) {
        return this.password.equals(password);
    }

    // Ver brawlers lo pueden hacer los dos tipos de usuario, por eso está en el padre
    public void verBrawlers(ArrayList<Brawler> brawlers) {
        if (brawlers.isEmpty()) {
            System.out.println("Todavía no hay brawlers creados...");
        } else {
            for (Brawler b : brawlers) {
                System.out.println(b);
            }
        }
        System.out.println();
    }

    // Cada tipo de usuario tiene su propio menú, que se repite hasta cerrar sesión
    public abstract void menu(ArrayList<Brawler> brawlers, Scanner sc);
}