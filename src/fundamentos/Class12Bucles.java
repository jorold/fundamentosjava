package fundamentos;

import java.util.Scanner;

public class Class12Bucles {

    public static void main(String[] args) {
        //bucles
//bucles contador(For): se realizan un nº de veces determinado
//bucles condición (While): se realizan mientras la condición se cumpla
//bucles de referencia

        /*for (inicio; mientras condicion; incremento)
{
 instrucciones
         */
//declaramos un bucle de 1 a 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contador:" + i);
        }
        /*podemos realizar el bucle para que
tenga otro incremento si lo deseamos
 i + numero*/
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Contador: " + i);
        }
        /* sintaxis while
        while(condicion == true){
        acciones
        }
        el bucle puede ser infinito para salir

        la variable se declara fuera del bucle
         */
        int numero = 1;
        while (numero <= 5) {
            //ahora hay que hacer código para salir del bucle
            numero += 1;
        }
        //pedir textos hasta que se escriba la palabra stop
        //para comparar con String debemos usar el método equals
        Scanner teclado = new Scanner(System.in);
        String respuesta = "";
        System.out.println("Escribir stop para salir");
        /*también se puede poner así
        while (!respuesta.equals("stop")) */
        while (respuesta.equals("stop") == false) {
            //indicamos que escriba algo
            System.out.println("Introduzca una palabra: ");
            //almacenamos lo que ha escrito
            respuesta = teclado.nextLine();
            System.out.println("Su respuesta es: " + respuesta);
        }
        System.out.println("Fin de programa");

    }
}
