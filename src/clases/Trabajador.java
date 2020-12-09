package clases;

public class Trabajador extends Persona {

    @Override
    public String toString() {
        return this.getNombreCompleto();
    }
    //constructores
    //campos
    //getter y setter
    //metodos

    public int getVacaciones() {
        return 22;
    }

    protected int salarioMinimo;

    public int getSalarioMinimo() {
        return salarioMinimo;
    }

    public Trabajador() {//la primera línea que hace java es esta
        //aunque no la leamos
        super();
        salarioMinimo = 1500;
        System.out.println("Constructor trabajador");
    }

    public Trabajador(String nombre, int edad) {
        //podemos hacer que un constructor lea
        //otro constructor de la clase super
        //indicando los parámetros del consttrutor
        super(nombre, edad);
        System.out.println("Constructor con parámetros trabajador");
    }

    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
