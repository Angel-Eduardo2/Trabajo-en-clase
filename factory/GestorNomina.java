import java.util.ArrayList;

public class GestorNomina {
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private ConfiguracionNomina config = new ConfiguracionNomina();

    public ConfiguracionNomina getConfig() {
        return config;
    }

    public void cargar(String[] lineas) {
        for (String linea : lineas) {
            String[] d = linea.split(";");
            double a = Double.parseDouble(d[2]);
            if (d[0].equals("FIJO")) {
                empleados.add(new EmpleadoFijo(d[1], a));
            } else if (d[0].equals("HORAS")) {
                empleados.add(new EmpleadoPorHoras(d[1], a, Double.parseDouble(d[3])));
            } else if (d[0].equals("COMISION")) {
                empleados.add(new EmpleadoPorComision(d[1], a, Double.parseDouble(d[3])));
            }
        }
    }

    public void imprimirSalud() {
        System.out.println("Salud en GestorNomina:  " + config.getPorcentajeSalud() * 100 + " %");
    }

    public void imprimirNomina() {
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + ": " + String.format("%.0f", e.calcularSalario()));
        }
    }
}
