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

    public void curar(int cantidad) {
        vida = vida + cantidad;
    }

    public void recibirDamage(int cantidad) {
        vida = vida - cantidad;
        if (vida < 0) {
            vida = 0;
        }
    }

    public abstract void accion(Brawler rival);

    @Override
    public String toString() {
        return "[" + nombre + ":" + vida + "]";
    }
}