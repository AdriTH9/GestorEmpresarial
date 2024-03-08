package gestor.errores;
import java.util.*;//biblioteca para poder utilizar la clase ya definida Map
public final class GestionErrores {
    //declaracion de atributos
    private boolean existeError;
    private int noError;
    private String descripcionTecnica;

    private Map<Integer,String>errores;//declaramos, Map funciona como interfaz para declarar, el String funciona com clase

    public GestionErrores(){//constructor

        errores=new HashMap<Integer,String>();//instanciamos
    }
    //metodos:
    private void cargarErrores(){

    }
    public void setNoError(int a, String b){

    }
    public String getError(){

        return "error";
    }
    public String getErrorTecnico(){

        return "errorTecnico";
    }
    public boolean existeError(){
        return true;
    }
}
