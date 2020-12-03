/*pedir a usuario cuantos números almacenar
almacenarlos y mostrar todos los números, la suma
 y la media*/
package fundamentos;

import java.util.Scanner;

public class Class25NumerosArrys {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //pregunto a usuario cuantos números quiere almacenar
        System.out.println("Indique cuantos números quiere almacenar: ");
        //capturo el dato
        String tecleo = teclado.nextLine();
        //creo la variable con el dato y lo convierto a entero
        int cuantos = Integer.parseInt(tecleo);
        //creo el array
        int[] numeros = new int[cuantos];
        //bucle para pedir tantos números como cantidad ha pedido usuario
        for (int i = 0; i < numeros.length; i++) {
            //pedir al usuario los números
            System.out.println("Introzca número: " + (i + 1));
            //capturar numero introducido
            String nro = teclado.nextLine();
            int nume = Integer.parseInt(nro);
            //introducir datos capturados en array
            numeros[i] = nume;
        }
        System.out.println("Números introducidos correctamente");
        //mostrar los números introducidos
        //declaro la variable para efectuar la suma
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            //recuperar numero de cada posición
            int nume = numeros[i];
            //sumo los números
            suma += nume;
            System.out.println(nume);

        }
        //declaro y opero para calcular la media
        int media = suma / numeros.length;
        //muestro los resultados
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La media de los números es " + media);
        System.out.println("Fin del programa");
    }
}
