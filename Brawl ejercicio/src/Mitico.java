public class Mitico implements Brawler {
    private String nombre;

    public Mitico(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " (Mítico) ataca");
    }

    @Override
    public void superAtaque() {
        System.out.println(nombre + " (Mítico) lanza su superataque");
    }
}
