package com.actividad.herencia;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal de demostración para el sistema de empleados con herencia.
 * Permite probar el comportamiento de las clases derivadas y el polimorfismo.
 * 
 * @author Actividad
 * @version 1.0
 */
public class Main {
    /**
     * Método principal para ejecutar las pruebas de la jerarquía de empleados.
     * 
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        // Creación de departamentos base
        Departamento tecnologia = new Departamento("Tecnología", "TEC-01", 15);
        Departamento ventas = new Departamento("Ventas", "VEN-02", 10);
        Departamento administracion = new Departamento("Administración", "ADM-03", 8);

        // Instanciación de empleados especializados
        Gerente gerente = new Gerente("Laura Méndez", 1001, 8500.00, administracion, 15000.00, 12);
        Desarrollador desarrollador = new Desarrollador("Carlos Pérez", 1002, 6500.00, tecnologia, "Java", 7);
        Vendedor vendedor = new Vendedor("Ana Gómez", 1003, 4000.00, ventas, 0.08, 50000.00);

        // Pruebas de métodos únicos
        gerente.setNumeroSubordinados(15);
        desarrollador.completarProyecto();
        vendedor.registrarVenta(10000.00);

        // Patrones de experiencia y gestión
        System.out.println("=== Resultados Específicos ===");
        System.out.println(gerente.gestionarEquipo());
        System.out.println(desarrollador.obtenerExperiencia());
        System.out.println("Nuevo total de ventas mensuales: $" + vendedor.getVentasMensuales());

        // Prueba de métodos heredados y sobrescritos
        System.out.println("\n=== Salarios Anuales ===");
        System.out.printf("Gerente: $%.2f%n", gerente.calcularSalarioAnual());
        System.out.printf("Desarrollador: $%.2f%n", desarrollador.calcularSalarioAnual());
        System.out.printf("Vendedor: $%.2f%n", vendedor.calcularSalarioAnual());

        // Polimorfismo: lista de empleados genéricos
        List<Empleado> plantilla = new ArrayList<>();
        plantilla.add(gerente);
        plantilla.add(desarrollador);
        plantilla.add(vendedor);

        System.out.println("\n=== Información General de Empleados (Polimorfismo) ===");
        for (Empleado empleado : plantilla) {
            System.out.println(empleado.obtenerInformacion());
        }

        // Cambio de departamento utilizando método heredado
        System.out.println("\n=== Cambio de Departamento ===");
        desarrollador.cambiarDepartamento(administracion);
        System.out.println("Desarrollador reasignado a: " + desarrollador.getDepartamento().getNombre());
    }
}
