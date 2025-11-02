package com.actividad.herencia;

/**
 * Clase derivada que modela a un desarrollador dentro de la empresa.
 * Hereda la información general de los empleados y añade características
 * específicas como el lenguaje de programación principal y la cantidad de proyectos.
 * 
 * Hereda de Empleado:
 * - Atributos: nombre, id, salarioMensual, departamento
 * - Métodos: cambiarDepartamento(), calcularSalarioAnual(), getters y setters
 * 
 * Añade:
 * - Atributos: lenguajePrincipal, proyectosCompletados
 * - Métodos: completarProyecto(), obtenerExperiencia()
 * - Sobrescribe: obtenerInformacion()
 * 
 * @author Sistema de Gestión de Empleados
 * @version 1.0
 */
public class Desarrollador extends Empleado {
    private String lenguajePrincipal;
    private int proyectosCompletados;

    /**
     * Constructor de la clase Desarrollador.
     * Utiliza super() para inicializar los atributos heredados de Empleado.
     * 
     * @param nombre Nombre completo del desarrollador
     * @param id Identificador único del desarrollador
     * @param salarioMensual Salario mensual base del desarrollador
     * @param departamento Departamento en el que trabaja
     * @param lenguajePrincipal Lenguaje de programación principal del desarrollador
     * @param proyectosCompletados Cantidad de proyectos completados
     */
    public Desarrollador(String nombre, int id, double salarioMensual, Departamento departamento,
                         String lenguajePrincipal, int proyectosCompletados) {
        super(nombre, id, salarioMensual, departamento);
        this.lenguajePrincipal = lenguajePrincipal;
        this.proyectosCompletados = proyectosCompletados;
    }

    /**
     * Incrementa el número de proyectos completados.
     */
    public void completarProyecto() {
        proyectosCompletados++;
    }

    /**
     * Obtiene una descripción del nivel de experiencia del desarrollador.
     * 
     * @return Mensaje que describe el nivel de experiencia
     */
    public String obtenerExperiencia() {
        if (proyectosCompletados < 5) {
            return "Experiencia: Junior";
        } else if (proyectosCompletados <= 10) {
            return "Experiencia: Semi Senior";
        } else {
            return "Experiencia: Senior";
        }
    }

    /**
     * Obtiene la información completa del desarrollador.
     * Sobrescribe el método base para incluir el lenguaje y proyectos.
     * 
     * @return String con la información detallada del desarrollador
     */
    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + String.format(" | Lenguaje Principal: %s | Proyectos: %d",
                lenguajePrincipal, proyectosCompletados);
    }

    /**
     * Obtiene el lenguaje principal del desarrollador.
     * 
     * @return Lenguaje de programación principal
     */
    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    /**
     * Establece el lenguaje principal del desarrollador.
     * 
     * @param lenguajePrincipal Nuevo lenguaje principal
     */
    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

    /**
     * Obtiene la cantidad de proyectos completados.
     * 
     * @return Número de proyectos completados
     */
    public int getProyectosCompletados() {
        return proyectosCompletados;
    }

    /**
     * Establece la cantidad de proyectos completados.
     * 
     * @param proyectosCompletados Nuevo número de proyectos completados
     */
    public void setProyectosCompletados(int proyectosCompletados) {
        this.proyectosCompletados = proyectosCompletados;
    }
}
