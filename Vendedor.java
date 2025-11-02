package com.actividad.herencia;

/**
 * Clase derivada que representa a un vendedor en la empresa.
 * Hereda de Empleado y añade funcionalidad para calcular comisiones
 * basadas en las ventas mensuales.
 * 
 * Hereda de Empleado:
 * - Atributos: nombre, id, salarioMensual, departamento
 * - Métodos: cambiarDepartamento(), getters y setters
 * 
 * Añade:
 * - Atributos: comisionPorcentaje, ventasMensuales
 * - Métodos: registrarVenta()
 * - Sobrescribe: calcularSalarioAnual(), obtenerInformacion()
 * 
 * @author Sistema de Gestión de Empleados
 * @version 1.0
 */
public class Vendedor extends Empleado {
    private double comisionPorcentaje;
    private double ventasMensuales;

    /**
     * Constructor de la clase Vendedor.
     * Inicializa los atributos heredados mediante super() y los atributos propios.
     * 
     * @param nombre Nombre completo del vendedor
     * @param id Identificador único del vendedor
     * @param salarioMensual Salario mensual base del vendedor
     * @param departamento Departamento al que pertenece
     * @param comisionPorcentaje Porcentaje de comisión sobre ventas (ej: 0.05 para 5%)
     * @param ventasMensuales Monto total de ventas mensuales
     */
    public Vendedor(String nombre, int id, double salarioMensual, Departamento departamento,
                    double comisionPorcentaje, double ventasMensuales) {
        super(nombre, id, salarioMensual, departamento);
        this.comisionPorcentaje = comisionPorcentaje;
        this.ventasMensuales = ventasMensuales;
    }

    /**
     * Calcula el salario anual del vendedor incluyendo las comisiones.
     * Sobrescribe el método de la clase base para añadir comisiones anuales.
     * 
     * @return Salario anual (salario mensual * 12 + comisiones anuales)
     */
    @Override
    public double calcularSalarioAnual() {
        double comisionesAnuales = ventasMensuales * 12 * comisionPorcentaje;
        return super.calcularSalarioAnual() + comisionesAnuales;
    }

    /**
     * Registra una venta agregándola al total de ventas mensuales.
     * 
     * @param monto Monto de la venta realizada
     */
    public void registrarVenta(double monto) {
        this.ventasMensuales += monto;
    }

    /**
     * Obtiene la información completa del vendedor.
     * Sobrescribe el método base para incluir comisión y ventas.
     * 
     * @return String con la información detallada del vendedor
     */
    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + 
               String.format(" | Comisión: %.1f%% | Ventas Mensuales: $%.2f", 
                           comisionPorcentaje * 100, ventasMensuales);
    }

    /**
     * Obtiene el porcentaje de comisión del vendedor.
     * 
     * @return Porcentaje de comisión
     */
    public double getComisionPorcentaje() {
        return comisionPorcentaje;
    }

    /**
     * Establece el porcentaje de comisión del vendedor.
     * 
     * @param comisionPorcentaje Nuevo porcentaje de comisión
     */
    public void setComisionPorcentaje(double comisionPorcentaje) {
        this.comisionPorcentaje = comisionPorcentaje;
    }

    /**
     * Obtiene las ventas mensuales del vendedor.
     * 
     * @return Monto total de ventas mensuales
     */
    public double getVentasMensuales() {
        return ventasMensuales;
    }

    /**
     * Establece las ventas mensuales del vendedor.
     * 
     * @param ventasMensuales Nuevo monto de ventas mensuales
     */
    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }
}
