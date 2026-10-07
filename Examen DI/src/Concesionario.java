import java.util.ArrayList;

public class Concesionario {
    private ArrayList<Vehiculo> vehiculos;

    public Concesionario(){
        vehiculos = new ArrayList<>();
    }

    public void anadirVehiculo(Vehiuclo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void verVechiculos(){
        if (vechiculos.isEmpty()){
            System.out.println("No hay ningun vehiculo en el concesionario");
        } else {
            for (Vechiculo v: vehiculos){
                System.out.println(v);
            }
        }
    }

    public voic conducirPorMarca(String marca){
        boolean encontrado = false;

        for (Vehiculo v: vehiculos){
            if (v.getMarca().equalsIgnoreCase(marca)){
                v.conducir();
                encontrado = true;
            }

        }
        if(!encontrado){
            System.out.println("No hay ningun vehiculo de la marca" + marca);
        }
    }
}
