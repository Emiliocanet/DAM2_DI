public class Epico implements Brawler {
    private String nombre;

    public Epico(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " (Épico) ataca");
    }

    @Override
    public void superAtaque() {
        System.out.println(nombre + " (Épico) lanza su superataque");
    }
}
