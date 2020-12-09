package clases;

public class Persona {
// <editor-fold defaultstate="collapsed" desc="Campos de la clase">
    //los campos de propiedad son privados

    public Persona() {
        System.out.println("Constructor persona");
    }

    public Persona(String nombre, int edad) {
        System.out.println("Constructor con parámetros persona");
    }

    private String nombre;
    private String apellidos;
    private int edad;
    //queremos que una persona tenga una dirección
    private Direccion domicilio;//esto es el constructor(Direccion)
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Getter y Setter">
    public Direccion getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            //varias opciones
            //1-error silencioso cambio el valor a otro
            //this.edad = 0;
            //2-lanzar una excepción, throw new Exception("mensaje")
            throw new Exception("La edad no puede ser negativa");
        } else {
            this.edad = edad;
        }
    }

// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Sobrecarga de métodos">
    //los campos de propiedad son privados
    public String getNombreCompleto() {
        return this.nombre + " " + this.apellidos;
    }

    //queremos dar la posibilidad al programador de devolver
    //nombre completo pero a la inversa
    public String getNombreCompletoInversa() {
        return this.apellidos + " " + this.nombre;
    }

    //metodo que nos devuelva el nombre completo en mayúsculas
    public String getNombreCompletoMayusculas() {
        return this.nombre.toUpperCase() + " " + this.apellidos.toUpperCase();
    }
    // </editor-fold>
}
