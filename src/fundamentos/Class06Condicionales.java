
package fundamentos;

import java.util.Scanner;


public class Class06Condicionales {
    public static void main(String[] args) {
                //CREAR SCANNER PARA PEDIR DATO AL USUARIO
        Scanner teclado = new Scanner(System.in);
            System.out.println("Introducir número: ");
        String dato = teclado.nextLine();
                //EVALUAR SI UN NÚMERO ES POSITIVO O NEGATIVO
        int numero = Integer.parseInt(dato);
        if(numero > 0){
                //ESTE CÓDIGO ES POSITIVO
            System.out.println("Positivo");
        }else {
            System.out.println("Negativo");
        }
                //LO MISMO PERO AHORA SI ES POSITIVO
                //NEGATIVO O ZERO
        if(numero > 0){
            System.out.println("Positivo");
        }else if (numero == 0){
            System.out.println("Zero");
        }else {
            System.out.println("Negativo");
        }
    }
    
}
//switch como un if pero sólo puede evaluar condiciones de igualdad
/*int numero = 3;
switch(numero);{
case 1:
        //acciones para 1
        break;
case 2:
case 3:
        //acciones para 2
        break;
default:*/
        //default es como el else, es opcional
//}