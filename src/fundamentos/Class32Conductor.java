package fundamentos;

import java.util.Scanner;
import vehiculos.Coche;
import vehiculos.Deportivo;

public class Class32Conductor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Coche car = new Coche("Seat", "131");
        Deportivo sport = new Deportivo("Seat", "Leon");
        int opcion = -1;
        while (opcion != 0) {
            car.menuConducir();
            System.out.println("6.- Turbo");
            String dato = teclado.nextLine();
            opcion = Integer.parseInt(dato);
            if (opcion == 1) {
                sport.arrancar();
            } else if (opcion == 2) {
                sport.acelerar();
            } else if (opcion == 3) {
                sport.frenar();
            } else if (opcion == 4) {
                System.out.println("¿Cuánta presión desea ejercer?");
                dato = teclado.nextLine();
                int presion = Integer.parseInt(dato);
                sport.frenar(presion);
            } else if (opcion == 5) {
                System.out.println("Modelo " + sport.getMarca() + " Marca " + sport.getModelo());
            } else if (opcion == 6) {
                sport.turbo();
            }
        }
        System.out.println("Fin de Programa");
    }

}
