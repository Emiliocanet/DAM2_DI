public class Epico extends Brawler {
    private int suministros;

    public Epico(String nombre, int vida, int suministros) {
        super(nombre, vida);
        this.suministros = suministros;
    }

    @Override
    public void accion(Brawler rival) {
        curar(suministros);
        System.out.println(this + " Increase health to " + getVida());
    }
}