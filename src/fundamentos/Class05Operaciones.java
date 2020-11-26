/* Pedir dos números al usuario
    Mostrar la suma, resta, división y multiplicación de los números.
    La suma de 5 + 6 es 11
    La multiplicación de 5 * 6 es 30
*/
package fundamentos;

import java.util.Scanner;

public class Class05Operaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Introducir números: ");        
        String dato1 = teclado.nextLine();
        System.out.println("Otro más, no seas vago: ");
        String dato2 = teclado.nextLine();        
        int numero1 = Integer.parseInt(dato1);
        int numero2 = Integer.parseInt(dato2);        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multip = numero1 * numero2;
        float div = numero1 / numero2;        
        System.out.println(numero1 + " + " + numero2 +" = " + suma);
        System.out.println(numero1 + " - " + numero2 +" = " + resta); 
        System.out.println(numero1 + " * " + numero2 +" = " + multip); 
        System.out.println(numero1 + " / " + numero2 +" = " + div); 
    }
    }
    