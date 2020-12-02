package fundamentos;

import java.util.Scanner;

public class Class21Isbn {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir nº ISBN");
        String dato = teclado.nextLine();
        int suma = 0;
        if (dato.length() != 10) {
            System.out.println("El número debe tener 10 dígitos");
        } else {
            for (int i = 0; i < dato.length(); i++) {
                char letra = dato.charAt(i);
                String digitos = String.valueOf(letra);
                int numero = Integer.parseInt(digitos);
                suma = suma + numero * (i + 1);
            }
        }
        if (suma % 11 == 0) {
            System.out.println("ISBN correcto");
        } else {
            System.out.println("ISBN incorrecto");
        }
    }
}
