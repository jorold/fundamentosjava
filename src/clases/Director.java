package clases;

public class Director extends Trabajador {

    public Director() {
        this.salarioMinimo += 200;
    }

    @Override
    public int getVacaciones() {
        int vacastrabajador = super.getVacaciones();
        return vacastrabajador + 8;
    }

    @Override
    public String toString() {
        return "No me entero de na";
    }

}
