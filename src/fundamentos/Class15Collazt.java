package fundamentos;

import java.util.Scanner;

public class Class15Collazt {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Introduzca un número positivo: ");
        String dato = teclado.nextLine();
        numero = Integer.parseInt(dato);
        if (numero > 0) {
            while (numero != 1) {
                if (numero % 2 == 0) {
                    numero = numero / 2;
                } else {
                    numero = numero * 3 + 1;
                }
                System.out.println(numero);
            }
        } else {
            System.out.println("El número debe ser positivo");
        }
        System.out.println("Fin de programa");
    }
}
