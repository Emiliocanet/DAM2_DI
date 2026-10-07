public class Vehiculo {
}
public abstract class Vehiculo {
    private final String marca;
    private final int kilometros;

    public vehiculos(String marca, int kilometros) {
        this.marca = marca;
        this.kilometros = kilometros;
    }

    public String getMarca() {
        return marca;
    }

    public int getKilometros() {
        return kilometros;
    }

    public abstract void conducir();

    @Override
    public String toString(){
        return marca + "." + kilometros + "km";
    }
}