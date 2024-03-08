package gestor.empresarial.empresa;
import gestor.empresarial.empleados.*;
import gestor.errores.*;

public final class Empresa {
    //Atributos:
    private String nombreEmpresa;
    private String representanteLegal;
    private String telefono;
    private String rfc;
    public Empleados datosRH;
    public GestionErrores error;

    public Empresa(String a, String b){//constructor

    }
    //Metodos:
    public void setRepresentanteLegal(String representante){

    }
    public String getRepresentanteLegal(){

        return representanteLegal;
    }
    public void setTelefono(String telefono){

    }
    public String getInfo(){

        return "info";
    }

}



