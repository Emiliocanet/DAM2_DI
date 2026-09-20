import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        int opcion = 0;

        while (opcion != 5) {
            System.out.print("OPCIÓN: ");
            opcion = Integer.parseInt(scanner.nextLine());

            if (opcion >= 1 && opcion <= 4) {
                System.out.println();
                System.out.print("NÚMERO 1: ");
                int numero1 = Integer.parseInt(scanner.nextLine());
                System.out.print("NÚMERO 2: ");
                int numero2 = Integer.parseInt(scanner.nextLine());

                if (opcion == 1) {

                    System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));

                } else if (opcion == 2) {

                    System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));

                } else if (opcion == 3) {
                    int resultado = 0;
                    int repeticiones = numero2;


                    if (repeticiones < 0) {
                        repeticiones = -repeticiones;
                    }

                    int contador = 0;
                    while (contador < repeticiones) {
                        resultado = resultado + numero1;
                        contador++;
                    }


                    if (numero2 < 0) {
                        resultado = -resultado;
                    }

                    System.out.println(numero1 + " * " + numero2 + " = " + resultado);

                } else {

                    if (numero2 == 0) {
                        System.out.println("No se puede dividir entre 0");
                    } else {
                        System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                    }
                }

                System.out.println();

            } else if (opcion != 5) {
                System.out.println("Opción no válida");
                System.out.println();
            }
        }

        scanner.close();
    }
}
