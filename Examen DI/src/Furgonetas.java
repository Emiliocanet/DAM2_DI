public class Furgonetas extends Vehiculo {
    public Furgonetas (String marca, int kilometros){
        super(marca, kilometros);
    }

    @Override
    public void Conducir(){
        System.out.println("Furgoneta" + getMarca() + "con" + getKilometros + "kilometros - Transporta comida" );

    }
}
