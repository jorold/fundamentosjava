package fundamentos;

import clases.Direccion;
import clases.Persona;

public class Class30UsoPersona {

    public static void main(String[] args) {
        try {
            //creamos un objeto persona
            Persona persona = new Persona();
            //asignamos valores a sus propiedades
            persona.setNombre("Ana");
            persona.setApellidos("Ramos");
            /* Sabemos que puede dar un error
        si da error y utilizamos throws la app se detine
        si tratamos la excepción, la ejecución continúa*/
            persona.setEdad(25);
            //queremos guardar una dirección para la persona
            //que deseamos guardar?? un objeto dirección
            //si queremos utilizar una dirección debemos crear una dirección
            Direccion direccioncasa = new Direccion("Calle Pez", "Madrid", 14);
            //almacenamos los datos de la dirección
            //direccioncasa.setCalle("Calle Pez");
            //direccioncasa.setCiudad("Madrid");
            //direccioncasa.setNumero(14);
            persona.setDomicilio(direccioncasa);
            System.out.println("Nombre " + persona.getNombre());
            System.out.println("Apellidos " + persona.getApellidos());
            System.out.println("Edad " + persona.getEdad());
            System.out.println(persona.getNombreCompleto());
            System.out.println(persona.getDomicilio().getCalle());
        } catch (Exception ex) {
            System.out.println("Tratando la excepción con try/catch");
            System.out.println("Error: " + ex.getMessage());
        }
    }

}
