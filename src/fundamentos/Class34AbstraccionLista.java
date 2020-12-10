package fundamentos;

import java.util.ArrayList;
import java.util.Scanner;
import vehiculos.Coche;
import vehiculos.Deportivo;

public class Class34AbstraccionLista {

    public static void main(String[] args) {
        ArrayList<Coche> coches = new ArrayList();
        coches.add(new Coche("Ford", "k"));
        coches.add(new Deportivo("Lamborghini", "SC18"));
        coches.add(new Coche("Renault", "Megane"));
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué vehículo desea conducir?");
        System.out.println("1.- Ford k ");
        System.out.println("2.- Lamborghini SC18");
        System.out.println("3.- Renault Megane");
        String dato = teclado.nextLine();
        int modelo = Integer.parseInt(dato);
        if (modelo == 1) {
            coches.get(0).arrancar();
            coches.get(0).acelerar();
            coches.get(0).frenar();
        } else if (modelo == 2) {
            coches.get(1).arrancar();
            coches.get(1).acelerar();
            coches.get(1).frenar();
            ((Deportivo) coches.get(1)).turbo();
        } else if (modelo == 3) {
            coches.get(2).arrancar();
            coches.get(2).acelerar();
            coches.get(2).frenar();
        }
    }
}
