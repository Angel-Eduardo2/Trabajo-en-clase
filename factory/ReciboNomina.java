public class ReciboNomina {
    private Empleado empleado;
    private double horasExtra;
    private double bonificacion;
    private double auxilioTransporte;
    private double descuentoLibranza;

    public ReciboNomina(Empleado empleado, double horasExtra,
            double bonificacion, double auxilioTransporte,
            double descuentoLibranza) {
        this.empleado = empleado;
        this.horasExtra = horasExtra;
        this.bonificacion = bonificacion;
        this.auxilioTransporte = auxilioTransporte;
        this.descuentoLibranza = descuentoLibranza;
    }

    public double totalPagar() {
        return empleado.calcularSalario() + horasExtra + bonificacion
                + auxilioTransporte - descuentoLibranza;
    }

    public String getNombreEmpleado() {
        return empleado.getNombre();
    }
}
