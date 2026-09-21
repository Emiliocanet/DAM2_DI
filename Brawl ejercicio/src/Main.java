import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Brawler> brawlers = new ArrayList<>();

    //
        brawlers.add(new Legendario("Spike", 3000, 1200));
        brawlers.add(new Legendario("Crow", 2800, 900));
        brawlers.add(new Mitico("Mortis", 4000, 1000));
        brawlers.add(new Mitico("Tara", 3500, 800));
        brawlers.add(new Epico("Piper", 2500, 1500));
        brawlers.add(new Epico("Bibi", 4500, 1100));

        for (Brawler b : brawlers) {
            b.mostrarDatos();
            b.atacar();
            b.superAtaque();
            System.out.println();
        }
    }
}
