import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Brawler> brawlers = new ArrayList<>();

        brawlers.add(new Legendario("Spike"));
        brawlers.add(new Legendario("Crow"));
        brawlers.add(new Mitico("Mortis"));
        brawlers.add(new Mitico("Tara"));
        brawlers.add(new Epico("Piper"));
        brawlers.add(new Epico("Bibi"));

        for (int i = 0; i < brawlers.size(); i++) {
            brawlers.get(i).atacar();
            brawlers.get(i).superAtaque();
            System.out.println();
        }
    }
}