package fundamentos;

import java.util.Scanner;


public class Class04NumeroDoble {
    //metodo main
    public static void main(String[] args) {
        //pediremos un número al usuario
        //mostraremos su doble
        //si hay que pedir un número al usuario clase Scanner
        Scanner teclado = new Scanner (System.in);
        //escribimos el mensaje de lo que necesitamos
        System.out.println("Introducca un número:");
        //capturamos el dato que nos ha dado el usuario
        String dato = teclado.nextLine();
        //que tipo de dato queremos???
        //convertimos el String dato a int
        int numero = Integer.parseInt(dato);
        //declaramos una variable para hacer la operación
        int doble = numero * 2;
        //mostramos el resultado
        System.out.println("El doble de " + numero + " es " + doble);
        
    }
    
    
}
