package fundamentos;

import java.util.Scanner;

public class Class10SalarioTrabajadores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int htrabajadas, hprecio, km;
        int hextra, salario, salarioextra, dietas, total;
        System.out.println("Introducir horas trabajadas esta semana: ");
        String dato = teclado.nextLine();
        System.out.println("Introducir precio hora: ");
        String dato1 = teclado.nextLine();
        System.out.println("Introducir km recorridos: ");
        String dato2 = teclado.nextLine();
        htrabajadas = Integer.parseInt(dato);
        hprecio = Integer.parseInt(dato1);
        km = Integer.parseInt(dato2);
        hextra = 0;
        dietas = 0;
        salario = 0;
        salarioextra = 0;
        total = 0;
    if(htrabajadas > 36){
        hextra = htrabajadas - 36;
        htrabajadas = 36;
        System.out.println("Tiene horas extras: " + hextra);
    } else{
        hextra = 0;
        System.out.println("No tiene horas extras: " + hextra);
    } if(km < 100){
        dietas = 0;
        System.out.println("No tiene dietas a cobrar");
    } else if(km >= 100 && km < 250){
        dietas = 200;
        System.out.println("Dietas regionales, a cobrar: " + dietas);
    } else if(km >= 250 && km < 500){
        dietas = 400;
        System.out.println("Dietas provinciales, a cobrar: " + dietas);
    } else{
        dietas = 600;
        System.out.println("Dietas internacionales, a cobrar: " + dietas);
    }
        salario = htrabajadas*hprecio;
        salarioextra = (hextra * (hprecio+2));
        total = salario + salarioextra + dietas;
        System.out.println("Total a cobrar: " + salario + " + " + salarioextra + " + " + dietas + " = " + total + " Euros");
}
}
