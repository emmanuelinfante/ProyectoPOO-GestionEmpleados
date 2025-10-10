/**
 * Clase Empleado
 * Representa un empleado de la organización con sus datos básicos y funcionalidades.
 * Demuestra el uso de atributos, constructores y métodos en POO.
 */
class Empleado {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private String id;
    private double salarioMensual;
    private Departamento departamento;

    /**
     * Constructor con parámetros para inicializar un empleado completo.
     * @param nombre Nombre completo del empleado
     * @param id Identificador único del empleado
     * @param salarioMensual Salario mensual del empleado
     * @param departamento Departamento al que pertenece el empleado
     */
    public Empleado(String nombre, String id, double salarioMensual, Departamento departamento) {
        this.nombre = nombre;
        this.id = id;
        this.salarioMensual = salarioMensual;
        this.departamento = departamento;
    }

    /**
     * Calcula el salario anual del empleado.
     * @return Salario anual (salario mensual * 12)
     */
    public double calcularSalarioAnual() {
        return salarioMensual * 12;
    }

    /**
     * Cambia el departamento del empleado.
     * @param nuevoDepartamento El nuevo departamento asignado
     */
    public void cambiarDepartamento(Departamento nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    /**
     * Obtiene la información completa del empleado.
     * @return String con todos los datos del empleado
     */
    public String obtenerInformacion() {
        return "ID: " + id + " | Nombre: " + nombre + 
               " | Salario Mensual: $" + salarioMensual + 
               " | Departamento: " + departamento.getNombre();
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
}

/**
 * Clase Departamento
 * Representa un departamento de la organización con su información y empleados asociados.
 * Demuestra relaciones entre clases y gestión de colecciones.
 */
class Departamento {
    // Atributos privados
    private String nombre;
    private String codigo;
    private int numeroEmpleados;

    /**
     * Constructor con parámetros para inicializar un departamento.
     * @param nombre Nombre del departamento
     * @param codigo Código identificador del departamento
     */
    public Departamento(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.numeroEmpleados = 0;
    }

    /**
     * Registra un nuevo empleado en el departamento.
     * Incrementa el contador de empleados del departamento.
     */
    public void agregarEmpleado() {
        numeroEmpleados++;
    }

    /**
     * Obtiene la información completa del departamento.
     * @return String con los datos del departamento
     */
    public String obtenerInformacion() {
        return "Departamento: " + nombre + 
               " | Código: " + codigo + 
               " | Empleados: " + numeroEmpleados;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }
}

/**
 * Clase Main
 * Punto de entrada de la aplicación. Instancia objetos y prueba la funcionalidad
 * de las clases Empleado y Departamento.
 */
public class Main {
    public static void main(String[] args) {
        // Creación de objetos Departamento
        Departamento ventas = new Departamento("Ventas", "DEPT-001");
        Departamento tecnologia = new Departamento("Tecnología", "DEPT-002");
        
        // Creación de objetos Empleado
        Empleado emp1 = new Empleado("Carlos Mendoza", "EMP-101", 3500.00, ventas);
        Empleado emp2 = new Empleado("Ana López", "EMP-102", 4200.00, tecnologia);
        Empleado emp3 = new Empleado("Luis Rodríguez", "EMP-103", 3800.00, ventas);
        
        // Registrar empleados en sus departamentos
        ventas.agregarEmpleado();
        tecnologia.agregarEmpleado();
        ventas.agregarEmpleado();
        
        // Prueba de métodos: Mostrar información de empleados
        System.out.println("=== INFORMACIÓN DE EMPLEADOS ===");
        System.out.println(emp1.obtenerInformacion());
        System.out.println(emp2.obtenerInformacion());
        System.out.println(emp3.obtenerInformacion());
        
        // Prueba de método: Calcular salario anual
        System.out.println("\n=== SALARIOS ANUALES ===");
        System.out.println(emp1.getNombre() + ": $" + emp1.calcularSalarioAnual());
        System.out.println(emp2.getNombre() + ": $" + emp2.calcularSalarioAnual());
        
        // Prueba de método: Cambiar departamento
        System.out.println("\n=== CAMBIO DE DEPARTAMENTO ===");
        System.out.println("Antes: " + emp1.obtenerInformacion());
        emp1.cambiarDepartamento(tecnologia);
        ventas.numeroEmpleados--;
        tecnologia.agregarEmpleado();
        System.out.println("Después: " + emp1.obtenerInformacion());
        
        // Mostrar información de departamentos
        System.out.println("\n=== INFORMACIÓN DE DEPARTAMENTOS ===");
        System.out.println(ventas.obtenerInformacion());
        System.out.println(tecnologia.obtenerInformacion());
    }
}
