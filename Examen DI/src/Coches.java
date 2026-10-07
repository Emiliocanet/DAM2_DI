public class Coches extends Vehiculo {
    private final String color;

    public Coches (String marca, int kilometros, String color){
        super(marca, kilometros);
        this.color = color;
    }

    public String getColor{
        return color;
    }

    @Override
    public void conducir(){
        System.out.println("Coche" + getMarca(), + "de color" + color + "con" + getKilometros + "Kilometros - Viajando");
    }
}
