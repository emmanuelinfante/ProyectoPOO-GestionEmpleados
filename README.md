# Sistema de Gestión de Empleados con Herencia

Este proyecto implementa un sistema de gestión de empleados utilizando conceptos de herencia en Java, demostrando la reutilización de código, sobrescritura de métodos y polimorfismo.

## Estructura del Proyecto

```
Herencia/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── actividad/
│                   └── herencia/
│                       ├── Empleado.java       (Clase base)
│                       ├── Departamento.java   (Clase auxiliar)
│                       ├── Gerente.java        (Clase derivada)
│                       ├── Desarrollador.java  (Clase derivada)
│                       ├── Vendedor.java       (Clase derivada)
│                       └── Main.java           (Programa principal)
├── INFORME_HERENCIA.md
└── README.md
```

## Jerarquía de Clases

```
Empleado (Clase Base)
    ├── Gerente
    ├── Desarrollador
    └── Vendedor
```

## Requisitos

- Java JDK 8 o superior
- Sistema operativo: Windows, Linux o macOS

## Compilación

### Desde línea de comandos (Terminal/CMD)

```bash
# Navegar al directorio del proyecto
cd Herencia

# Compilar todos los archivos Java
javac -d bin src/main/java/com/actividad/herencia/*.java

# O compilar directamente desde el directorio src
javac src/main/java/com/actividad/herencia/*.java
```

### Compilación simplificada

```bash
cd Herencia/src/main/java
javac com/actividad/herencia/*.java
```

## Ejecución

### Desde la línea de comandos

```bash
# Si compiló usando -d bin
cd bin
java com.actividad.herencia.Main

# Si compiló sin -d
cd Herencia/src/main/java
java com.actividad.herencia.Main
```

## Salida Esperada

```
=== Resultados Específicos ===
Gestiona un equipo grande de 15 personas.
Experiencia: Semi Senior
Nuevo total de ventas mensuales: $60000.00

=== Salarios Anuales ===
Gerente: $117000.00
Desarrollador: $78000.00
Vendedor: $105600.00

=== Información General de Empleados (Polimorfismo) ===
ID: 1001 | Nombre: Laura Méndez | Salario Mensual: $8500.00 | Departamento: Administración | Bono Anual: $15000.00 | Subordinados: 15
ID: 1002 | Nombre: Carlos Pérez | Salario Mensual: $6500.00 | Departamento: Administración | Lenguaje Principal: Java | Proyectos: 8
ID: 1003 | Nombre: Ana Gómez | Salario Mensual: $4000.00 | Departamento: Ventas | Comisión: 8.0% | Ventas Mensuales: $60000.00

=== Cambio de Departamento ===
Desarrollador reasignado a: Administración
```

## Características Implementadas

### Clase Empleado (Base)
- Atributos: nombre, id, salarioMensual, departamento
- Métodos: calcularSalarioAnual(), cambiarDepartamento(), obtenerInformacion()

### Clase Gerente (Derivada)
- **Atributos adicionales:** bono, numeroSubordinados
- **Métodos sobrescritos:** calcularSalarioAnual(), obtenerInformacion()
- **Métodos únicos:** gestionarEquipo()

### Clase Desarrollador (Derivada)
- **Atributos adicionales:** lenguajePrincipal, proyectosCompletados
- **Métodos sobrescritos:** obtenerInformacion()
- **Métodos únicos:** completarProyecto(), obtenerExperiencia()

### Clase Vendedor (Derivada)
- **Atributos adicionales:** comisionPorcentaje, ventasMensuales
- **Métodos sobrescritos:** calcularSalarioAnual(), obtenerInformacion()
- **Métodos únicos:** registrarVenta()

## Conceptos de POO Demostrados

1. **Herencia:** Uso de `extends` para heredar de la clase Empleado
2. **Encapsulamiento:** Atributos privados con getters y setters
3. **Sobrescritura:** Uso de `@Override` para modificar comportamiento heredado
4. **Polimorfismo:** Tratamiento uniforme de diferentes tipos de empleados
5. **Reutilización de código:** Uso de `super()` para invocar constructores y métodos de la clase base

## Documentación

Para información detallada sobre el diseño, implementación y conceptos aplicados, consulte el archivo `INFORME_HERENCIA.md`.

## Autor

Actividad Formativa 3 - Herencia en Java

## Licencia

Proyecto educativo para demostración de conceptos de Programación Orientada a Objetos.
