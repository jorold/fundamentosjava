package fundamentos;

import java.util.Scanner;

public class Class08Dni {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir los números del DNI: ");
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);
        int letra = (numero - ((numero / 23) * 23));
        if (letra == 0) {
            System.out.println("Número de DNI " + numero + "T");
        } else if (letra == 1) {
            System.out.println("Número de DNI " + numero + "R");
        } else if (letra == 2) {
            System.out.println("Número de DNI " + numero + "W");
        } else if (letra == 3) {
            System.out.println("Número de DNI " + numero + "A");
        } else if (letra == 4) {
            System.out.println("Número de DNI " + numero + "G");
        } else if (letra == 5) {
            System.out.println("Número de DNI " + numero + "M");
        } else if (letra == 6) {
            System.out.println("Número de DNI " + numero + "Y");
        } else if (letra == 7) {
            System.out.println("Número de DNI " + numero + "F");
        } else if (letra == 8) {
            System.out.println("Número de DNI " + numero + "P");
        } else if (letra == 9) {
            System.out.println("Número de DNI " + numero + "D");
        } else if (letra == 10) {
            System.out.println("Número de DNI " + numero + "X");
        } else if (letra == 11) {
            System.out.println("Número de DNI " + numero + "B");
        } else if (letra == 12) {
            System.out.println("Número de DNI " + numero + "N");
        } else if (letra == 13) {
            System.out.println("Número de DNI " + numero + "J");
        } else if (letra == 14) {
            System.out.println("Número de DNI " + numero + "Z");
        } else if (letra == 15) {
            System.out.println("Número de DNI " + numero + "S");
        } else if (letra == 16) {
            System.out.println("Número de DNI " + numero + "Q");
        } else if (letra == 17) {
            System.out.println("Número de DNI " + numero + "V");
        } else if (letra == 18) {
            System.out.println("Número de DNI " + numero + "H");
        } else if (letra == 19) {
            System.out.println("Número de DNI " + numero + "L");
        } else if (letra == 20) {
            System.out.println("Número de DNI " + numero + "C");
        } else if (letra == 21) {
            System.out.println("Número de DNI " + numero + "K");
        } else if (letra == 22) {
            System.out.println("Número de DNI " + numero + "E");
        } else if (letra == 23) {
            System.out.println("Número de DNI " + numero + "T");
        }
    }

}
