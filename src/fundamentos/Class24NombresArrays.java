package fundamentos;

import java.util.Scanner;

public class Class24NombresArrays {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //vamos a pedir la dimensión del array
        System.out.println("¿Cuantos nombres desea guardar?");
        String dato = teclado.nextLine();
        int dimension = Integer.parseInt(dato);
        //creamos el array con el número de elementos indicados
        String[] nombres = new String[dimension];
        //vamos a pedir tantos nombres como dimension nos han dicho
        for (int i = 0; i < nombres.length; i++) {
            //pedimos al usuario cada nombre
            System.out.println("Introduzca el nombre " + (i + 1));
            String nom = teclado.nextLine();
            //guardamos cada nombre en cada posición i del array
            nombres[i] = nom;
        }
        System.out.println("Nombres introducidos correctamente");
        //mostramos todos los nombres
        for (int i = 0; i < nombres.length; i++) {
            //recuperamos cada nombre de cada posición i
            String nom = nombres[i];
            System.out.println(nom);
        }
        System.out.println("Fin del programa");
    }
}
