package gestor.empresarial.datos;

//solo puede heredar porque tiene "abstact"
public abstract class DatosPersonales {
    //declaracion de atributos
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String whatsapp;


    protected int getId(){

        return this.id;
    }
    protected void setId(){
        this.id=id;
    }

    protected String getNombre(){

        return this.nombre;
    }
    protected void setNombre(String nombre){

        this.nombre=nombre;
    }

    protected String getApellido(){

        return this.apellido;
    }
    protected void setApellido(String apelllido){

        this.apellido=apellido;
    }

    protected String getCorreo(){

        return this.correo;
    }
    protected void setCorreo(String correo){

        this.correo=correo;
    }

    protected String getWhatsApp(){

        return this.whatsapp;
    }
    protected void setWhatsApp(String whatsapp){

        this.whatsapp=whatsapp;
    }

}
