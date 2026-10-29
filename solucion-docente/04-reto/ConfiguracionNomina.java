public class ConfiguracionNomina {
    // Paso 1: la clase guarda su única instancia
    private static ConfiguracionNomina instancia;
    private double porcentajeSalud = 0.04;

    // Paso 1: constructor privado, nadie fuera de la clase puede hacer new
    private ConfiguracionNomina() { }

    // Paso 1: único punto de acceso
    public static ConfiguracionNomina getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionNomina();
        }
        return instancia;
    }

    public double getPorcentajeSalud() {
        return porcentajeSalud;
    }

    public void setPorcentajeSalud(double porcentajeSalud) {
        this.porcentajeSalud = porcentajeSalud;
    }
}
