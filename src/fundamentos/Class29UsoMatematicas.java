package fundamentos;

import clases.Matematicas;
import java.util.Scanner;

public class Class29UsoMatematicas {

    //¿qué deseamos hacer aquí? Provar la suma de números
    //como queremos ejecutar necesitamos un main()
    public static void main(String[] args) {
        //.toUpperCase(): Objeto String
        //.sumarNumeros(): Objeto Matemáticas
        //mostrar un menu al usuario y que seleccione
        //entre las opciones
        Scanner teclado = new Scanner(System.in);
        Matematicas mates = new Matematicas();
        //mates.sumarNumeros()?????
        mates.menuMatematicas();
        String dato = teclado.nextLine();
        int opcion = Integer.parseInt(dato);
        if (opcion == 1) {
            int suma = mates.sumarNumeros(15, 23);
            System.out.println("Suma = " + suma);
        } else if (opcion == 2) {
            int doble = mates.getDoble(88);
            System.out.println("Doble: " + doble);
        } else if (opcion == 3) {
            double potencia = mates.getPotencia(4, 3);
            System.out.println("Potencia: " + potencia);
        }
        System.out.println("Fin de programa");

        //buscar en google documentar con javadoc
    }
}
