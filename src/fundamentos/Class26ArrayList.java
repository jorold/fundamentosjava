package fundamentos;

import java.util.ArrayList;

public class Class26ArrayList {

    public static void main(String[] args) {
        //declaramos y creamos la coleccion
        ArrayList<String> lista = new ArrayList();
        System.out.println("Número de elementos " + lista.size());
        //añadir elementos
        lista.add("Primero");
        lista.add("Segundo");
        lista.add("Tercero");
        lista.add("Primero");
        //insertar un elemento en la colección
        //la posición a insertar debe existir
        lista.add(1, "Cuarto");
        //modificar un elemento de la colección
        lista.set(1, "Modificado");
        //eliminar un elemento
        lista.remove(1);
        //buscar un elemento
        //lista.contains()
        int posicion = lista.indexOf("Primero");
        System.out.println("La posición de indexOf Primero es " + posicion);
        int pos = lista.lastIndexOf("Primero");
        System.out.println("La posición de lastIndexOf Primero es " + pos);
        System.out.println("Número de elementos " + lista.size());
        //recorrer los elementos de una colección
        for (int i = 0; i < lista.size(); i++) {
            //recuperar un elemento de la colección
            String dato = lista.get(i);
            System.out.println(i + ": " + dato);
        }
        //recorrer conjuntos con bucles de referencia
        //una referencia es una variable que apunta a un objero
        //en lugar de declarar una variable contador (no existe)
        //se recorre con un objeto y finaliza
        //cuando no hay más objetos a recorrer
        //sintaxis:
        //for ( TIPO variable: conjunto) { la variable es la referencia}
        for (String dato : lista) {
            System.out.println(dato);
        }
        //eliminar todos los elementos de la colección
        lista.clear();
        System.out.println("Número de elementos " + lista.size());
    }
}
