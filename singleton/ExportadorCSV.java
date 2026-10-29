public class ExportadorCSV {
    private ConfiguracionNomina config = ConfiguracionNomina.getInstancia();

    public String exportarLinea(Empleado e) {
        double salario = e.calcularSalario();
        double salud = salario * config.getPorcentajeSalud();
        return e.getNombre() + ";" + String.format("%.0f", salario) + ";" + String.format("%.0f", salud);
    }

    public void imprimirSalud() {
        System.out.println("Salud en ExportadorCSV: " + config.getPorcentajeSalud() * 100 + " %");
    }
}
