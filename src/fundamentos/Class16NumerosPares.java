/*
pedir a usuario inicio y final
debemos mostrar lo núemros pares entre
dicho inicio y final
2-comprobaremos que el valor inicial es menor al valor final
pedir al ususario si desea ver pares o impares
 */
package fundamentos;

import java.util.Scanner;

public class Class16NumerosPares {

    public static void main(String[] args) {
        //activar scanner para capturar datos que introduce el usuario
        Scanner teclado = new Scanner(System.in);
        //declaro variables
        int n1, n2;
        //pido al usuario primer número
        System.out.println("Introduzca primer número: ");
        //capturo el dato introducido
        String dato1 = teclado.nextLine();
        //pido al usuario segundo número
        System.out.println("Introduzca segundo número: ");
        //capturo el dato
        String dato2 = teclado.nextLine();
        //convierto los datos a números
        n1 = Integer.parseInt(dato1);
        n2 = Integer.parseInt(dato2);
        //pongo condición el primer número debe ser el menor
        if (n1 < n2) {
            //pregunto si quiere pares o impares
            System.out.println("¿Desea ver pares (p) o impares (i)?");
            //capturo la respuesta
            String respuesta = teclado.nextLine();
            //como sabemos inicio y final usamos un bucle contador (for)
            for (int i = n1; i <= n2; i++) {
                //si elige pares
                if (respuesta.equals("p") == true) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                } else {
                    if (i % 2 == 1) {
                        System.out.println(i);
                    }
                }
            }
        } else {
            System.out.println("El primer número debe ser menor al segundo");
        }
        System.out.println("Fin de programa");
    }
}
