public class ReciboNomina {
    private final Empleado empleado;
    private final double horasExtra;
    private final double bonificacion;
    private final double auxilioTransporte;
    private final double descuentoLibranza;

    // Paso 3: constructor privado, solo el Builder puede crear el recibo
    private ReciboNomina(Builder b) {
        this.empleado = b.empleado;
        this.horasExtra = b.horasExtra;
        this.bonificacion = b.bonificacion;
        this.auxilioTransporte = b.auxilioTransporte;
        this.descuentoLibranza = b.descuentoLibranza;
    }

    public double totalPagar() {
        return empleado.calcularSalario() + horasExtra + bonificacion
                + auxilioTransporte - descuentoLibranza;
    }

    public String getNombreEmpleado() {
        return empleado.getNombre();
    }

    // Paso 3: el recibo se arma paso a paso
    public static class Builder {
        private final Empleado empleado;
        private double horasExtra, bonificacion,
                auxilioTransporte, descuentoLibranza;

        public Builder(Empleado e) { this.empleado = e; }

        public Builder bonificacion(double v) {
            this.bonificacion = v;
            return this;
        }

        public Builder horasExtra(double v) {
            this.horasExtra = v;
            return this;
        }

        public Builder auxilioTransporte(double v) {
            this.auxilioTransporte = v;
            return this;
        }

        public Builder descuentoLibranza(double v) {
            this.descuentoLibranza = v;
            return this;
        }

        public ReciboNomina build() {
            return new ReciboNomina(this);
        }
    }
}
