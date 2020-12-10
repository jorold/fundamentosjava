package fundamentos;

import java.util.Scanner;

public class Fundamentos {

    public static void main(String[] args) {
        /*evaluar si un número es de la primera decena 1-10
     o es de la segunda decena 11-20 o en adelante*/
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducca un número: ");
        String dato = teclado.nextLine();
        int num = Integer.parseInt(dato);
        if (num > 0 && num < 10) {
            System.out.println("Primera decena");
        } else if (num >= 10 && num < 20) {
            System.out.println("Segunda decena");
        }
    }

}
