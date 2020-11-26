package fundamentos;

import java.util.Scanner;

public class Class09Nacimiento {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, anyo;
        int op1, op2, op3, op4, op5, op6, resultado;
        System.out.println("Introducir día de nacimiento: ");
        String dato = teclado.nextLine();
        System.out.println("Introducir mes de nacimiento: ");
        String dato1 = teclado.nextLine();
        System.out.println("Introducir año de nacimiento: ");
        String dato2 = teclado.nextLine();
        dia = Integer.parseInt(dato);
        mes = Integer.parseInt(dato1);
        anyo = Integer.parseInt(dato2);
        if (mes == 1) {
            mes = 13;
            //anyo = anyo - 1;
            anyo--;
        } else if (mes == 2) {
            mes = 14;
            //anyo = anyo - 1;
            anyo -= 1;
        }
        op1 = ((mes + 1) * 3) / 5;
        op2 = anyo / 4;
        op3 = anyo / 100;
        op4 = anyo / 400;
        op5 = dia + (mes * 2) + anyo + op1 + op2 - op3 + op4 + 2;
        op6 = op5 / 7;
        resultado = op5 - (op6 * 7);
        if (resultado == 0) {
            System.out.println("Su día de nacimiento fue Sábado");
        } else if (resultado == 1) {
            System.out.println("Su día de nacimiento fue Domingo");
        } else if (resultado == 2) {
            System.out.println("Su día de nacimiento fue Lunes");
        } else if (resultado == 3) {
            System.out.println("Su día de nacimiento fue Martes");
        } else if (resultado == 4) {
            System.out.println("Su día de nacimiento fue Miércoles");
        } else if (resultado == 5) {
            System.out.println("Su día de nacimiento fue Jueves");
        } else if (resultado == 6) {
            System.out.println("Su día de nacimiento fue Viernes");
        }

    }
}
