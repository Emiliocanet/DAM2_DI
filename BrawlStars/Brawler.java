public abstract class Brawler {
    private String nombre;
    private int vida;

    public Brawler(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    // Suma vida al brawler
    public void curar(int cantidad) {
        vida = vida + cantidad;
    }

    // Resta vida al brawler, sin bajar de 0
    public void recibirDamage(int cantidad) {
        vida = vida - cantidad;
        if (vida < 0) {
            vida = 0;
        }
    }

    // Cada tipo de brawler hace una acción distinta en el combate
    public abstract void accion(Brawler rival);

    // Formato con el que se muestra un brawler: [Nombre:vida]
    @Override
    public String toString() {
        return "[" + nombre + ":" + vida + "]";
    }
}
