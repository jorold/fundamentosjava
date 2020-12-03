/*Realizar una aplicación dónde pediremos una cantidad de números a introducir.
Almacenaremos todos los números dentro de un Array.  Cada número que nos dará
el usuario. Al final, debemos mostrar cada número, la suma total y la media.
Opción 2:
Mientras que el usuario no ponga -1, pediremos números
   Has introducido 10 números
   La suma es 99
   La media es 9.9 */
package fundamentos;

import java.util.ArrayList;
import java.util.Scanner;

public class Class28NumerosArraysList {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*System.out.println("¿Cuántos números desea introducir?");
        String cantidad = teclado.nextLine();
        int cuantosNumeros = Integer.parseInt(cantidad);
        ArrayList<Integer> listado = new ArrayList();
        for (int i = 1; i <= cuantosNumeros; i++) {
            System.out.println("Introduzca número: " + i);
            String numero = teclado.nextLine();
            int numerointroducido = Integer.parseInt(numero);
            listado.add(numerointroducido);
        }
        System.out.println("Números introducidos correctamente");
       int suma = 0;
        for (int numerointroducido : listado) {
            suma += numerointroducido;
            System.out.println(+numerointroducido);
        }
        int media = suma / cuantosNumeros;
        System.out.println("La suma de los números introducidos es: " + suma);
        System.out.println("La media de los números introducidos es: " + media);
        System.out.println("Fin de programa");*/

        System.out.println("Para finalizar programa introduzca -1");
        ArrayList<Double> numeros = new ArrayList();
        double num;
        System.out.println("Introduca número");
        String n = teclado.nextLine();
        num = Integer.parseInt(n);
        while (num != -1) {
            numeros.add(num);
            System.out.println("Introduca número");
            n = teclado.nextLine();
            num = Integer.parseInt(n);
        }
        System.out.println("Numeros introducidos: " + numeros.size());
        double suma = 0;
        double media;
        for (double nro : numeros) {
            suma += nro;
            System.out.println(nro);
        }
        media = suma / numeros.size();
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La media de los números es: " + media);
    }

}
