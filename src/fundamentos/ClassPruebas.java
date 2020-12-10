/*Class14AccionesNumeros
   Pediremos números al usuario hasta que nos indique el número -1.
   Mostraremos la suma de cada número escrito.
Ejemplo:
   Introduzca un número:
       5
   Suma: 5
-------------------
   Introduzca un número:
       2
   Suma: 7*/
package fundamentos;

import java.util.Scanner;

public class ClassPruebas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, valor;
        System.out.println("Para finalizar introducir -1");
        System.out.println("Introduzca un número: ");
        String dato = teclado.nextLine();
        numero = Integer.parseInt(dato);
        valor = 0;
        while (numero != -1) {
            valor += numero;
            System.out.println("La suma es: " + valor);
            System.out.println("Introduzca un número: ");
            dato = teclado.nextLine();
            numero = Integer.parseInt(dato);
            System.out.println("La suma es: " + valor);
        }
        System.out.println("Fin de programa");
    }
}
