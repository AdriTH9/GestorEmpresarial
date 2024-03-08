package gestor.empresarial.contrato;

public final class Contrato {
    private int id;
    private int noContrato;
    private int annio;
    private String horario;
    private Cargos tipoCargo;

    public Contrato(int id){
        tipoCargo= Cargos.confianza;
        tipoCargo= Cargos.sindicalizado;
        tipoCargo= Cargos.temporal;
    }

    public void setNoContrato(int noContr){
        this.noContrato=noContrato;
    }
    public int getNoContrato(){
        return noContrato;
    }
    public void setAnnio(int annio){
        this.annio=annio;
    }
    public int getAnnio(){
        return annio;
    }
}
