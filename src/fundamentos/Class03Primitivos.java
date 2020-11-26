
package fundamentos;

import java.util.Scanner;

public class Class03Primitivos {
    
    public static void main(String[] args) {
        int numero = 30;
        //LOS TIPOS CHAR SE IGUALAN CON COMILLA SIMPLE
        char letra = 'A';
        //STRING ES UNA CLASE, NO ES UN PRIMITIVO
        //PERO ES UN WRAPPER, CON IGUALAR A UN VALOR
        //YA SE CREA/INSTANCIA EL OBJETO
        //SABEMOS QUE ES UNA CLASE PORQUE LA PRIMERA LETRA
        //ES MAYÚSCULA
        String texto = "Hoy es Lunes";
        //BOOLEAN SE ESTABLECE CON TRUE O CON FALSE
        boolean respuesta = true;
        /*EL COMPILADOR DETECTA SI NOS HEMOS PASADO
        EN LA CAPACIDAD DE LA VARIABLE
        */
        byte bite = 50;
        //OBJECT ES LA BASE DE JAVA
        //TODAS LAS CLASES EN JAVA HEREDAN DE ALGO
        //LA HERENCIA QUIERE DECIR QUE UN OBJETO NO COMIENZA
        //DE CERO SI NO QUE YA TIENE UNOS MÉTODOS Y PROPIEDADES
        //LA CLASE BASE ES LA CLASE DE DONDE HEREDA UN OBJETO
        //DIRECTAMENTE
        //UN OBJECT PUEDE ALMACENAR CUALQUIER DATO
        //Y ES UN WRAPPER
        Object obj = "Esto es un texto";
        Object obj2 = 78899;
        //CONVERSION IMPLÍCITA
        // POR EJEMPLO UN DOUBLE TIENE MÁS CAPACIDAD QUE UN INT
        //NO NOS FIJAMOS EN EL VALOR, SI NO EN LA CAPACIDAD
        //DEL TIPO
        double mayor;
        int menor = 19;
        //si almacenamos un tipo menor en mayor
        //la conversión es automática
        mayor = menor;
        //conversión casting
        //se realiza entre primitivos
        byte bytemenor;
        int intmayor = 99;
        //guardar un tipo de mayor capacidad
        //la conversión siempre al tipo de la izquierda
        bytemenor = (byte) intmayor;
        // conversión de string a primitivo
        //se utilizan los métodos parse
        //por cada primitivo tenemos una clase
        //de su tipo: double--> Double int-->Integer
        String dato = "78";
        int num;
        //queremos guardar el texto numero en int
        num = Integer.parseInt(dato);
        // conversión de objetos a string
        String cadena;
        int num1 = 99;
        //cadena = num1.toString();
        /*para convertir a string los
        primitivos se utiliza el método
        valueOf de la clase String
        */
        cadena = String.valueOf(num1);
        /*otra opción son las conversiones
        implícitas de primitivos
        */
        System.out.println("Número " + num1);
        /*para utilizar scanner tenemoso dos opciones
        1) toda la ruta java.util.Scanner
        2) hacer un import arrbia del todo poniendo
        una línea debajo de en este caso package fundamentos
        import java.util.Scanner;
        */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su nombre:");
        //scanner siempre devuelve String
        String nombre = teclado.nextLine();
        System.out.println("Su nombre es: " + nombre);
        
 
                
 }   
}
