package fundamentos;

import java.util.Scanner;

public class Class11MayorTresNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3, mayor, menor, intermedio;
        System.out.println("Introducir primer número: ");
        String daton1 = teclado.nextLine();
        System.out.println("Introducir segundo número: ");
        String daton2 = teclado.nextLine();
        System.out.println("Introducir tercer número: ");
        String daton3 = teclado.nextLine();
        n1 = Integer.parseInt(daton1);
        n2 = Integer.parseInt(daton2);
        n3 = Integer.parseInt(daton3);
        mayor = n1;
        menor = n1;
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        intermedio = ((n1 + n2 + n3) - mayor) - menor;
        System.out.println("Menor: " + menor);
        System.out.println("Intermedio: " + intermedio);
        System.out.println("Mayor: " + mayor);
    }

}
