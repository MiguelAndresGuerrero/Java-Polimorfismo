package Ejercicio1;

public class main {
    public static void main(String[] args) {
        // Instanciar objetos de Coche y Motocicleta
        Coche coche1 = new Coche("Toyota", "Supra MK4", 2);
        Motocicleta moto1 = new Motocicleta("Yamaha", "R5", "Deportivo");

        // Invocar el metodo "mostrarDetalles()" en cada objeto
        System.out.println("Detalles del carro: ");
        coche1.mostrarDetalles();

        System.out.println("Detalles de la moto: ");
        moto1.mostrarDetalles();
    }
}

