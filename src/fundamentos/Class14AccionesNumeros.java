/*Pediremos números al usuario hasta que nos indique el número -1.
   Le daremos la opción al usuario si desea sumar o multiplicar.
   Iremos mostrando la suma o la multiplicación de los números introducidos.
Ejemplo:
   Introduzca un número:
       5
   Accion (sumar o multiplicar)
       sumar
   Suma: 5
   Introduzca un número:
       2
   Accion (sumar o multiplicar)
       sumar
   Suma: 7
   Introduzca un número:
       2
   Accion (sumar o multiplicar)
       multiplicar
   Multiplicar: 14*/
package fundamentos;

import java.util.Scanner;

public class Class14AccionesNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Para finalizar introducir -1");
        System.out.println("Introduzca un número: ");
        String dato = teclado.nextLine();
        numero = Integer.parseInt(dato);
        System.out.println("Introduzca una acción sumar o multiplicar (s/m): ");
        String accion = teclado.nextLine();
        int valor = 0;
        while (numero != -1) {
            System.out.println("Ha introducido el número: " + numero);
            if (accion.equals("s") == true) {
                valor += numero;
                System.out.println("La suma es: " + valor);
            } else if (accion.equals("m") == true) {
                valor = valor * numero;
                System.out.println("La multiplicación es: " + valor);
            }
            System.out.println("Introduzca un número: ");
            dato = teclado.nextLine();
            numero = Integer.parseInt(dato);
            System.out.println("Introduzca una acción sumar o multiplicar (s/m): ");
            accion = teclado.nextLine();
        }
        System.out.println("Fin de programa");
    }

}
