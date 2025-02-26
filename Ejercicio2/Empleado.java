package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

// Clase base Empleado
public class Empleado {
    private String nombre;
    private double salario;
    
    // Constructor
    public Empleado (String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    
    // Metodo para calcular la bonificacion al usuario
    public double CalcularBonificacion (){
        return salario * 0.10;
    }
    
    // Metodo para mostrar los detalles del usuario
    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre + " - Salario: $" + salario + " - Bonificacion: $" + CalcularBonificacion());
    }
}

// Subclase EmpleadoFijo
class EmpleadoFijo extends Empleado{
    private int Experiencia;
    
    // Constructor
    public EmpleadoFijo(String nombre, double salario, int Experiencia){
        super(nombre, salario);
        this.Experiencia = Experiencia;
    }
    
    // Sobreescribir "CalcularBonificacion()"
    @Override
    public double CalcularBonificacion(){
        return super.CalcularBonificacion() * 2; // 20% del salario
    }
    
    // Sobreescribir "Experiencia()"
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Experiencia laboral: " + Experiencia + " years");
    }
}

// Subclase EmpleadoTrabajo
class EmpleadoTrabajo extends Empleado{
    private int HorasTrabajadas; 
    private double CobroHora;
    
    // Construtor
    public EmpleadoTrabajo(String nombre, double salario, int HorasTrabajadas, double CobroHora){
        super(nombre, salario);
        this.HorasTrabajadas = HorasTrabajadas;
        this.CobroHora = CobroHora;
    }
    
    // Sobreescribir "CalcularBonificacion()"
    @Override
    public double CalcularBonificacion(){
        if (HorasTrabajadas > 160) {
            return super.CalcularBonificacion() + (HorasTrabajadas - 160) * CobroHora * 0.05;
        } else {
            return super.CalcularBonificacion();
        }
    }
    
    // Sobreescribri "mostrarDetalles()"
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Horas que trabajo: " + HorasTrabajadas + " - Tarifa por hora: $" + CobroHora);
    }
}