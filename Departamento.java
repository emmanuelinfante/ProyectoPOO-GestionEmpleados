package com.actividad.herencia;

/**
 * Clase que representa un departamento dentro de la organización.
 * Contiene información administrativa y de personal relacionado con los empleados.
 * 
 * @author Sistema de Gestión
 * @version 1.0
 */
public class Departamento {
    private String nombre;
    private String codigo;
    private int numeroEmpleados;

    /**
     * Constructor del departamento.
     * 
     * @param nombre Nombre del departamento
     * @param codigo Código identificador del departamento
     * @param numeroEmpleados Cantidad de empleados asignados al departamento
     */
    public Departamento(String nombre, String codigo, int numeroEmpleados) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.numeroEmpleados = numeroEmpleados;
    }

    /**
     * Incrementa en una unidad el número de empleados.
     */
    public void incrementarNumeroEmpleados() {
        numeroEmpleados++;
    }

    /**
     * Decrementa en una unidad el número de empleados, evitando valores negativos.
     */
    public void decrementarNumeroEmpleados() {
        if (numeroEmpleados > 0) {
            numeroEmpleados--;
        }
    }

    /**
     * Obtiene el nombre del departamento.
     * 
     * @return Nombre del departamento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del departamento.
     * 
     * @param nombre Nuevo nombre del departamento
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el código del departamento.
     * 
     * @return Código del departamento
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del departamento.
     * 
     * @param codigo Nuevo código del departamento
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el número de empleados del departamento.
     * 
     * @return Número de empleados asignados
     */
    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    /**
     * Establece la cantidad de empleados del departamento.
     * 
     * @param numeroEmpleados Nuevo número de empleados
     */
    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }
}
