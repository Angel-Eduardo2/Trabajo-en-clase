public class Main {
    public static void main(String[] args) {
        // --- Configuración ---
        // Paso 1: todos usan la misma configuración
        ConfiguracionNomina.getInstancia()
            .setPorcentajeSalud(0.05);
        new GestorNomina().imprimirSalud();
        new ExportadorCSV().imprimirSalud();

        // --- Carga desde texto ---
        GestorNomina gestor = new GestorNomina();
        String[] lineas = {
            "FIJO;Ana Ruiz;3500000",
            "HORAS;Luis Gómez;120;18000",
            "CONTRATISTA;Marta Díaz;4200000"
        };
        gestor.cargar(lineas);
        System.out.println();
        gestor.imprimirNomina();

        // --- Recibos ---
        Empleado ana = new EmpleadoFijo("Ana Ruiz", 3500000);
        Empleado luis = new EmpleadoPorHoras("Luis Gómez", 120, 18000);
        // Paso 3: cada dato del recibo tiene nombre
        ReciboNomina r1 =
          new ReciboNomina.Builder(ana)
            .bonificacion(250000)
            .build();

        ReciboNomina r2 =
          new ReciboNomina.Builder(luis)
            .horasExtra(180000)
            .descuentoLibranza(120000)
            .build();
        System.out.println();
        System.out.println("Recibo " + r1.getNombreEmpleado() + ": " + String.format("%.0f", r1.totalPagar()));
        System.out.println("Recibo " + r2.getNombreEmpleado() + ": " + String.format("%.0f", r2.totalPagar()));

        // --- Reto: practicante cargado por la fábrica y recibo armado con el Builder ---
        Empleado juan = FabricaEmpleados.crear("PRACTICANTE;Juan Mora;1300000");
        ReciboNomina r3 =
          new ReciboNomina.Builder(juan)
            .auxilioTransporte(200000)
            .build();
        System.out.println("Recibo " + r3.getNombreEmpleado() + ": " + String.format("%.0f", r3.totalPagar()));
    }
}
