package vehiculos;

public class Coche {
// <editor-fold defaultstate="collapsed" desc="Campos de la clase y Constructor">
    //características de la clase

    private String marca;
    private String modelo;
    protected int velocidad;
    protected int velocidadMaxima;
    protected boolean estadoVehiculo;

    //Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
        this.velocidadMaxima = 160;
        this.estadoVehiculo = false;
    }
// </editor-fold>

//<editor-fold defaultstate="collapsed" desc="Getter y Setter">
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Acciones">
    public void arrancar() {
        if (estadoVehiculo == true) {
            System.out.println("El vehículo ya está arrancado!!!");
        } else {
            this.estadoVehiculo = true;
            System.out.println("Vehículo arrancado");
        }
    }

    public void acelerar() {
        if (estadoVehiculo == false) {
            System.out.println("Primero hay que arrancar el vehículo");
        } else {
            this.velocidad += 20;
            if (this.velocidad >= this.velocidadMaxima) {
                System.out.println("Velocidad máxima alcanzada " + this.velocidadMaxima + " Km/h");
                this.velocidad = this.velocidadMaxima;
            } else {
                System.out.println("Acelerando... " + this.velocidad + " Km/h");
            }
        }
    }

    public void frenar() {
        this.velocidad = this.velocidad - 20;
        if (this.velocidad <= 0) {
            this.velocidad = 0;
            System.out.println("Ya estás parado, velocidad " + this.velocidad + " Km/h");
        } else {
            System.out.println("Frenando..." + this.velocidad + " Km/h");
        }
    }

    public void frenar(int potencia) {
        this.velocidad = this.velocidad - potencia;
        if (this.velocidad <= 0) {
            this.velocidad = 0;
            System.out.println("Ya estás parado, velocidad " + this.velocidad + " Km/h");
        } else {
            System.out.println("Frenando..." + this.velocidad + " Km/h");
        }
    }

    //Menú para ejecutar las acciones
    public void menuConducir() {
        System.out.println("Elija acción: ");
        System.out.println("0.- Salir");
        System.out.println("1.- Arrancar");
        System.out.println("2.- Acelerar");
        System.out.println("3.- Frenar");
        System.out.println("4.- Frenar con potencia");
        System.out.println("5.- Ver descripción");
    }

//</editor-fold>
}
