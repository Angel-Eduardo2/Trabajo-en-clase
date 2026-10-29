public class Contratista extends Empleado {
    private double valorContrato;

    public Contratista(String nombre, double valorContrato) {
        super(nombre);
        this.valorContrato = valorContrato;
    }

    @Override
    public double calcularSalario() {
        return valorContrato;
    }
}
