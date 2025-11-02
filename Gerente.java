package com.actividad.herencia;

/**
 * Clase derivada que representa un Gerente en la empresa.
 * Hereda de Empleado y añade atributos y funcionalidades específicas
 * para la gestión de equipos y bonos anuales.
 * 
 * Hereda de Empleado:
 * - Atributos: nombre, id, salarioMensual, departamento
 * - Métodos: cambiarDepartamento(), getters y setters
 * 
 * Añade:
 * - Atributos: bono, numeroSubordinados
 * - Métodos: gestionarEquipo()
 * - Sobrescribe: calcularSalarioAnual(), obtenerInformacion()
 * 
 * @author Sistema de Gestión de Empleados
 * @version 1.0
 */
public class Gerente extends Empleado {
    private double bono;
    private int numeroSubordinados;

    /**
     * Constructor de la clase Gerente.
     * Llama al constructor de la clase base Empleado mediante super().
     * 
     * @param nombre Nombre completo del gerente
     * @param id Identificador único del gerente
     * @param salarioMensual Salario mensual base del gerente
     * @param departamento Departamento al que pertenece el gerente
     * @param bono Bono anual que recibe el gerente
     * @param numeroSubordinados Cantidad de empleados bajo su supervisión
     */
    public Gerente(String nombre, int id, double salarioMensual, Departamento departamento, 
                   double bono, int numeroSubordinados) {
        super(nombre, id, salarioMensual, departamento);
        this.bono = bono;
        this.numeroSubordinados = numeroSubordinados;
    }

    /**
     * Calcula el salario anual del gerente incluyendo el bono.
     * Sobrescribe el método de la clase base para incluir el bono anual.
     * 
     * @return Salario anual (salario mensual * 12 + bono)
     */
    @Override
    public double calcularSalarioAnual() {
        return super.calcularSalarioAnual() + bono;
    }

    /**
     * Proporciona información sobre la gestión del equipo del gerente.
     * 
     * @return Información sobre el número de subordinados y capacidad de gestión
     */
    public String gestionarEquipo() {
        if (numeroSubordinados == 0) {
            return "Este gerente no tiene subordinados asignados.";
        } else if (numeroSubordinados <= 5) {
            return String.format("Gestiona un equipo pequeño de %d personas.", numeroSubordinados);
        } else if (numeroSubordinados <= 15) {
            return String.format("Gestiona un equipo mediano de %d personas.", numeroSubordinados);
        } else {
            return String.format("Gestiona un equipo grande de %d personas.", numeroSubordinados);
        }
    }

    /**
     * Obtiene la información completa del gerente.
     * Sobrescribe el método base para incluir información sobre bono y subordinados.
     * 
     * @return String con la información detallada del gerente
     */
    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + 
               String.format(" | Bono Anual: $%.2f | Subordinados: %d", bono, numeroSubordinados);
    }

    /**
     * Obtiene el bono anual del gerente.
     * 
     * @return Bono anual
     */
    public double getBono() {
        return bono;
    }

    /**
     * Establece el bono anual del gerente.
     * 
     * @param bono Nuevo bono anual
     */
    public void setBono(double bono) {
        this.bono = bono;
    }

    /**
     * Obtiene el número de subordinados del gerente.
     * 
     * @return Número de subordinados
     */
    public int getNumeroSubordinados() {
        return numeroSubordinados;
    }

    /**
     * Establece el número de subordinados del gerente.
     * 
     * @param numeroSubordinados Nuevo número de subordinados
     */
    public void setNumeroSubordinados(int numeroSubordinados) {
        this.numeroSubordinados = numeroSubordinados;
    }
}
