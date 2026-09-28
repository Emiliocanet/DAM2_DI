public class Legendario extends Brawler {
    private int damage;

    public Legendario(String nombre, int vida, int damage) {
        super(nombre, vida);
        this.damage = damage;
    }

    @Override
    public void accion(Brawler rival) {
        rival.recibirDamage(damage);
        System.out.println(this + " Apply -" + damage + " damage to " + rival.getNombre());
    }
}
