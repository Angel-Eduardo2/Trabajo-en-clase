// Paso 2: el único lugar del sistema que conoce las subclases de Empleado
public class FabricaEmpleados {
    public static Empleado crear(String linea) {
        String[] d = linea.split(";");
        double a = Double.parseDouble(d[2]);
        double b = d.length > 3 ? Double.parseDouble(d[3]) : 0;
        switch (d[0]) {
        case "FIJO": return new EmpleadoFijo(d[1], a);
        case "HORAS": return new EmpleadoPorHoras(d[1], a, b);
        case "COMISION": return new EmpleadoPorComision(d[1], a, b);
        case "CONTRATISTA": return new Contratista(d[1], a);
        // Reto: un tipo nuevo es un case más
        case "PRACTICANTE": return new Practicante(d[1], a);
        default: throw new IllegalArgumentException(d[0]);
        }
    }
}
