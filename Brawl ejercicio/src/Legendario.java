public class Legendario implements Brawler {
    private String nombre;
    private int vida;
    private int damage;

    public Legendario(String nombre, int vida, int damage) {
        this.nombre = nombre;
        this.vida = vida;
        this.damage = damage;
    }

    @Override
    public void mostrarDatos() {
        System.out.println(nombre + " (Legendario) - Vida: " + vida + " - Daño: " + damage);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca y hace " + damage + " de daño");
    }

    @Override
    public void superAtaque() {
        System.out.println(nombre + " lanza su superataque y hace " + (damage * 2) + " de daño");
    }
}
