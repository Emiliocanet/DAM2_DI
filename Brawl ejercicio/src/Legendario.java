public class Legendario implements Brawler {
    private String nombre;

    public Legendario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " (Legendario) ataca");
    }

    @Override
    public void superAtaque() {
        System.out.println(nombre + " (Legendario) lanza su superataque");
    }
}
