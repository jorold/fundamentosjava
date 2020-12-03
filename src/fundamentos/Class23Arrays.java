package fundamentos;

public class Class23Arrays {

    public static void main(String[] args) {
        //vamos a crear un array de nombres
        //y almacenamos datos en su interior
        String[] nombres = new String[3];
        nombres[0] = "Melisa";
        nombres[1] = "Isabel";
        nombres[2] = "María";
        //antes de guardar, vamos a recorrer el array
        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i];
            System.out.println(nombre);
        }
        /*también podemos iniciar y crear los elementos del
        array a la vez */
        int[] numeros = new int[]{99, 88, 44, 55, 2, 3, 8};
        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i];
            System.out.println("Número: " + num);
        }
    }

}
