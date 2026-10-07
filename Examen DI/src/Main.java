public class Main {
    public static void Main(String[] args){
        Concesionario concesionario = new Concesionario();

        concesionario.anadirVehiculo(new Furgoneta("Ford" 430000));
        concesionario.anadirVehiculo(new Coche("Opel" 100000, "gris"));
        concesionario.anadirVehiculo(new Coche("BMW" 345005, "negro"));

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("1. Ver vehiculos");
            System.out.println("2. Crear un coche");
            System.out.println("3. Conducir vehiculo por marca);
            System.out.println("4. Salir");
            System.out.println();
            opcion = Utilidades.leerEntero("OPCION: ")
            System.out.println();

            if (opcion == 1){
                concesionario.verVehiculos();
        }
    }
}
