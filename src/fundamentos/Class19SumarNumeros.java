/*
Pedir texto numerico
recorrer todo el texto y sumar
todos sus caracteres
 */
package fundamentos;

import java.util.Scanner;

public class Class19SumarNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un dato numérico");
        String datonumero = teclado.nextLine();
        int suma = 0;
        for (int i = 0; i < datonumero.length(); i++) {
            char letra = datonumero.charAt(i);
            String caracter = String.valueOf(letra);
            int numero = Integer.parseInt(caracter);
            suma += numero;
        }
        System.out.println("La suma de " + datonumero + " es " + suma);
    }
}
