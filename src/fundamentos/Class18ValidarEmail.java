/*pedir mail al usuario
comprobar que el mail contenga @
que no comienza ni finaliza con @
solo tiene una @
que contiene un punto
que existe un punto despues de @
dominio debe ser de 2 a 4 caracteres
 */
package fundamentos;

import java.util.Scanner;

public class Class18ValidarEmail {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca su email: ");
        String mail = teclado.nextLine();
        if (mail.contains("@") == false) {
            System.out.println("Falta @");
        } else if (mail.startsWith("@")) {
            System.out.println("No puede empezar con @");
        } else if (mail.endsWith("@")) {
            System.out.println("No puede acabar con @");
        } else if (mail.indexOf("@") != mail.lastIndexOf("@")) {
            System.out.println("Sólo una @");
        } else if (mail.contains(".") == false) {
            System.out.println("Necesario contener un .");
        } else if (mail.lastIndexOf(".") < mail.indexOf("@")) {
            System.out.println("El . debe ir depués de @");
        } else {
            //buscamos el último punto
            int ultimopunto = mail.lastIndexOf(".");
            String dominio = mail.substring(ultimopunto + 1);
            int longitud = dominio.length();
            if (longitud >= 2 && longitud <= 4) {
                System.out.println("Mail correcto");
            } else {
                System.out.println("El dominio debe tener entre dos y cuatro caracteres");
            }
        }
    }
}
