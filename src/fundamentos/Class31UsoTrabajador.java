package fundamentos;

import clases.Director;
import clases.Trabajador;

public class Class31UsoTrabajador {

    public static void main(String[] args) {
        Trabajador tra = new Trabajador();
        tra.setNombre("Pepe");
        tra.setApellidos("Botella");
        tra.setSalario(1000);
        System.out.println("Trabajador " + tra.getNombreCompleto());
        System.out.println("Salario: " + tra.getSalario());
        System.out.println("SMI trabajador: " + tra.getSalarioMinimo());
        Director dire = new Director();
        System.out.println("SMI director: " + dire.getSalarioMinimo());
        System.out.println("Vacaciones trabajador: " + tra.getVacaciones());
        System.out.println("Vacaciones director: " + dire.getVacaciones());
        System.out.println("Trabajador " + tra.toString());
    }
}
