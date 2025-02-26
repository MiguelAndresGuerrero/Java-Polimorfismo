package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

// Clase base llamada main donde se ejecutara el codigo
public class Main {
    
    // Lista de empleados
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        
        // Datos de la lista de empledos
        empleados.add(new EmpleadoFijo("Juan Perez", 3000, 5));
        empleados.add(new EmpleadoFijo("Pedro Gomez", 5000, 10));
        empleados.add(new EmpleadoTrabajo("Laura Rodriguez", 2000, 170, 15));
        empleados.add(new EmpleadoTrabajo("Carlos Lopez", 1800, 100, 10));
        
        // Bucle para mostrar la lista y mostrar la bonificacion de los empledaos
        for (Empleado empleado : empleados) {
            empleado.mostrarDetalles();
            System.out.println("================================================");
        }
    }
}