package fundamentos;

public class Class17String {

    public static void main(String[] args) {
        //declaramos un string para trabajar
        String texto = "Curso de Apps Java";
        System.out.println("Longitud: " + texto.length());
        System.out.println("toUpperCase(): " + texto.toUpperCase());
        System.out.println("toLowerCase(): " + texto.toLowerCase());
        System.out.println("IndexOf('a'): " + texto.indexOf("a"));
        System.out.println("indexOf('a', 16): " + texto.indexOf("a", 16));
        System.out.println("lastIndexOf('a'): " + texto.lastIndexOf("a"));
        System.out.println("lastIndexOf('a', 16): " + texto.lastIndexOf("a", 16));
        System.out.println("indexOf('z'): " + texto.indexOf("z"));
        System.out.println("startsWith('Cur'): " + texto.startsWith("Cur"));
        System.out.println("endsWith('java'): " + texto.endsWith("java"));
        System.out.println("substring(2,4): " + texto.substring(2, 4));
        System.out.println("substring(10): " + texto.substring(10));
        System.out.println("contains('de'): " + texto.contains("de"));
        //los metodos no modifican el objeto
        texto.toUpperCase();
        //la unica forma de modificar el objeto es con igual
        texto = texto.toUpperCase();
        System.out.println(texto);
        System.out.println("charAt(9): " + texto.charAt(9));
        System.out.println("equals('curso de apps java'): " + texto.equals("curso de apps java"));
        System.out.println("equalsIgnoreCase('curso de apps java'): " + texto.equalsIgnoreCase("curso de apps java"));
        String dato = "curso";
        //queremos saber si el texto comienza on curso
        //pero el texto está en mayúsculas
        if (texto.toLowerCase().startsWith(dato) == true) {
            System.out.println("El texto comienza con curso");
        }
        /*recorrer todos los elementos de un string
        mostramos letra a letra cada caracter donde
        comienza la cadena (posicion)? 0
        donde termina la cadena (indice): length() -1
         */
        for (int i = 0; i < texto.length(); i++) {
            //COMO RECUPERO UNA LETRA DEL TEXTO POR SU INDICE??
            //charAt(indice)
            char letra = texto.charAt(i);
            System.out.println("Posicion: " + i + ", Letra: " + letra);
        }
    }
}
