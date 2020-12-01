package fundamentos;

import java.util.Scanner;

public class Class13TablaMultiplicar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, resultado;
        System.out.println("Introduzca un número: ");
        String dato = teclado.nextLine();
        numero = Integer.parseInt(dato);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (i * numero));
        }
        //con while
        int contador = 0;
        while (contador <= 9) {
            contador += 1;
            resultado = numero * contador;
            System.out.println(numero + " X " + contador + " = " + resultado);
        }

    }

}
