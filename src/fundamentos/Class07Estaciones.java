/*   Pedir un número al usuario (1-4).
    1 - OTOÑO
    2 - INVIERNO
    3 - PRIMAVERA
    4 - VERANO
    Otro valor: OPCION INCORRECTA
*/
package fundamentos;

import java.util.Scanner;

public class Class07Estaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            System.out.println("Introducir número de 1 al 4: ");
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);
    if(numero == 1){
            System.out.println("Otoño");
    }else if(numero == 2){
            System.out.println("Invierno");
    }else if(numero == 3){
            System.out.println("Primavera");
    }else if(numero == 4){
            System.out.println("Verano");
    }else{
            System.out.println("¿Qué no has entendido? De 1 al 4");
    }
 }
    
}
