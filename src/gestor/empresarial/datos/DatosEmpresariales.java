package gestor.empresarial.datos;

//La clase DatosEmpresariales obtiene herencia de DatosPersonales
public final class DatosEmpresariales extends DatosPersonales {
    //declaracion de atributos
    private String adscripcion;
    private String telefonoExterior;
    private String puesto;

    //se declara un constructor con firmas
    public DatosEmpresariales(int a, String b, String c){

    }

    //se realiza el equeleto de la clase, con los gets y sets
    String getAdscripcion(){//en este método es un DEFAULT

        return adscripcion;
    }
    void setAdquisiscion(String adquisicion){//en este método es un DEFAULT
        this.adscripcion=adscripcion;
    }

    String getTelefonoExterior(){//en este método es un DEFAULT

        return telefonoExterior;
    }
    void setTelefonoExterior(String telefonoex){//en este método es de tipo DEFAULT
        this.telefonoExterior=telefonoExterior;
    }

    String getPuesto(){//en este método es un DEFAULT

        return puesto;
    }
    void setPuesto(String puesto){//en este método es de tipo DEFAULT
        this.puesto=puesto;
    }
}
