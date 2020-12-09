package clases;

public class Matematicas {

    //esta clase la vamos a utilizar no va a arrancar
    //será una herramienta para otras clases
    //no lleva método main()
    //crear un método para sumar números
    //que recibirá los números y devolverá la suma
    public int sumarNumeros(int num1, int num2) {
        //acciones
        int suma = num1 + num2;
        return suma;
    }

    public int getDoble(int num) {
        return num * 2;
    }

    public double getPotencia(int num, int potencia) {
        double resultado = Math.pow(num, potencia);
        return resultado;
    }

    //el menú no devuelve nada sólo muestra opciones
    //por lo que es un void
    public void menuMatematicas() {
        System.out.println("1.- Sumar números");
        System.out.println("2.- Doble del número");
        System.out.println("3.- Potencia de número");
        System.out.println("Seleccione una opción: ");
    }
}
