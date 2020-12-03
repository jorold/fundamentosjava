/*pedir cuantos nombres se desean almacenar
 pedir nombres al usuario
cuando se termine mostrar los nombres al usuario
 */
package fundamentos;

import java.util.Scanner;
import java.util.ArrayList;

public class Class27NombresArrayList {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir cuantos nombres desea almacenar: ");
        String dato = teclado.nextLine();
        int cuantos = Integer.parseInt(dato);
        ArrayList<String> listado = new ArrayList();
        for (int i = 0; i <= cuantos; i++) {
            System.out.println("Introduzca nombre: " + (i + 1));
            String nombre = teclado.nextLine();
            listado.add(nombre);
        }
        System.out.println("Nombres introducidos correctamente");
        for (String nombre : listado) {
            int posicion = listado.indexOf(nombre);
            System.out.println("Nombre " + posicion + ": " + nombre);
        }
        System.out.println("Fin de programa");
    }

}
