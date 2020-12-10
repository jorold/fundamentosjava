package fundamentos;

import java.util.ArrayList;
import vehiculos.Deportivo;
import vehiculos.Coche;

public class Class33Abstraccion {

    public static void main(String[] args) {
        ArrayList<Coche> coches = new ArrayList();
        coches.add(new Deportivo("Ferrari", "Testarrossa"));
        coches.add(new Coche("Fiat", "Multipla"));
        //podemos manejar los objetos como coches
        //cualquiera de los dos puede acelerar
        coches.get(0).acelerar(); //deportivo
        coches.get(1).acelerar(); //coche
        //no podemos manejar un objeto con su forma
        //si no lo convertimos. Aplicar sus métodos
        //necesitamos hacer un casting
        ((Deportivo) coches.get(0)).turbo();
        //coches.get(0).turbo();
        System.out.println(coches.get(0).getClass());
        System.out.println(coches.get(1).getClass());

    }
}
