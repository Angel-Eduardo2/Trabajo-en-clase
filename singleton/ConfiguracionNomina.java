public class ConfiguracionNomina {
    private double porcentajeSalud = 0.04;
    private static ConfiguracionNomina instancia;

    private ConfiguracionNomina() {
    }

    public static ConfiguracionNomina getInstancia(){
        if(instancia==null){
            instancia=new ConfiguracionNomina();
        }
        return instancia
    }

    public double getPorcentajeSalud() {
        return porcentajeSalud;
    }

    public void setPorcentajeSalud(double porcentajeSalud) {
        this.porcentajeSalud = porcentajeSalud;
    }
}
