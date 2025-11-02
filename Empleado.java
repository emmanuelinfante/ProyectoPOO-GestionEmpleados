package com.actividad.herencia;

/**
 * Clase base que representa un empleado genérico en la empresa.
 * Esta clase sirve como base para la jerarquía de empleados especializados.
 * 
 * @author Sistema de Gestión de Empleados
 * @version 1.0
 */
public class Empleado {
    private String nombre;
    private int id;
    private double salarioMensual;
    private Departamento departamento;

    /**
     * Constructor de la clase Empleado.
     * 
     * @param nombre Nombre completo del empleado
     * @param id Identificador único del empleado
     * @param salarioMensual Salario mensual base del empleado
     * @param departamento Departamento al que pertenece el empleado
     */
    public Empleado(String nombre, int id, double salarioMensual, Departamento departamento) {
        this.nombre = nombre;
        this.id = id;
        this.salarioMensual = salarioMensual;
        this.departamento = departamento;
    }

    /**
     * Calcula el salario anual del empleado.
     * 
     * @return Salario anual (salario mensual * 12)
     */
    public double calcularSalarioAnual() {
        return salarioMensual * 12;
    }

    /**
     * Cambia el departamento del empleado.
     * 
     * @param nuevoDepartamento El nuevo departamento al que se asignará el empleado
     */
    public void cambiarDepartamento(Departamento nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    /**
     * Obtiene la información completa del empleado.
     * 
     * @return String con la información del empleado
     */
    public String obtenerInformacion() {
        return String.format("ID: %d | Nombre: %s | Salario Mensual: $%.2f | Departamento: %s",
                id, nombre, salarioMensual, departamento.getNombre());
    }

    /**
     * Obtiene el nombre del empleado.
     * 
     * @return Nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     * 
     * @param nombre Nuevo nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el ID del empleado.
     * 
     * @return ID del empleado
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID del empleado.
     * 
     * @param id Nuevo ID del empleado
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el salario mensual del empleado.
     * 
     * @return Salario mensual
     */
    public double getSalarioMensual() {
        return salarioMensual;
    }

    /**
     * Establece el salario mensual del empleado.
     * 
     * @param salarioMensual Nuevo salario mensual
     */
    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    /**
     * Obtiene el departamento del empleado.
     * 
     * @return Departamento del empleado
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Establece el departamento del empleado.
     * 
     * @param departamento Nuevo departamento
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
