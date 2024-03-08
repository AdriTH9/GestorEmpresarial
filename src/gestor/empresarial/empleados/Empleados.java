package gestor.empresarial.empleados;
import gestor.empresarial.contrato.*;
import gestor.errores.*;

public abstract class Empleados implements iEmpleados{//Se cambio a Abstract para que pudiera heredar,
    // con el final no era posible
    //Atributos:
    private int i;
    public GestionErrores error;

    public Empleados(){//Constructor

    }
    //Funciones:
    public void addDatosPersonales(String n, String ap, String am){

    }
    public int addContrato(int a,int b, String c, Cargos d){
        return 1;//retorna un numero entero
    }

    private int findEmpleado(int a){
        return a;
    }
    private int findEmpleado(String b){
        return 1;
    }

    public void setWhatsapp(int a, String b){

    }
    private String datosPersonales(int a){
        return null;
    }
    public String getInfoEmpleado(int empleado){
        return null;
    }
    public String getInfoEmpleado(String empleado){
        return null;
    }
    public void setAdquisicion(int a, String b){

    }
    public void setTelefonoExtension(int a, String b){

    }
    public void setPuesto(int a, String b){

    }
    public void showDatosEmpleado(){

    }
    public void showContratadosEmpleados(int a){
        System.out.println("Mostrando Empleados Contatados");
    }

    public int getAntiguedad(int a){
        return a;
    }
    public void setCargo(Cargos a){

    }

}
