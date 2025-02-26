package Ejercicio1;

// Clase base Vehiculo
public class Vehiculo {
    private String marca;
    private String modelo;

    // Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Metodo "mostrarDetalles()" que sera sobrescrito en las subclases
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}

// Subclase Coche
class Coche extends Vehiculo {
    private int numeroPuertas;

    // Constructor
    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    // Sobrescritura del metodo "mostrarDetalles()"
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Numero de Puertas: " + numeroPuertas);
    }
}

// Subclase Motocicleta
class Motocicleta extends Vehiculo {
    private String tipoManubrio;

    // Constructor
    public Motocicleta(String marca, String modelo, String tipoManubrio) {
        super(marca, modelo);
        this.tipoManubrio = tipoManubrio;
    }

    // Sobrescritura del metodo "mostrarDetalles()"
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de Manubrio: " + tipoManubrio);
    }
}
