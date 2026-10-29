import java.util.ArrayList;

public class GestorNomina {
    private ArrayList<Empleado> empleados = new ArrayList<>();
    // Paso 1: ya no crea su propia configuración, pide la única que existe
    private ConfiguracionNomina config = ConfiguracionNomina.getInstancia();

    public void cargar(String[] lineas) {
        for (String linea : lineas) {
            // Paso 2: GestorNomina ya no sabe construir empleados
            empleados.add(FabricaEmpleados.crear(linea));
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
