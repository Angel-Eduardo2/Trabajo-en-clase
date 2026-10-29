public class EmpleadoPorComision extends Empleado {
    private static final double PORCENTAJE_COMISION = 0.05;
    private double salarioBase;
    private double ventas;

    public EmpleadoPorComision(String nombre, double salarioBase, double ventas) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.ventas = ventas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + ventas * PORCENTAJE_COMISION;
    }
}
