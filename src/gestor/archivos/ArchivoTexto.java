package gestor.archivos;

import java.io.*;
public final class ArchivoTexto extends ControlArchivos implements iFileText{
    //Atributos:
    private File file;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private BufferedWriter bw;
    private boolean archivoExistente;
    private boolean modoLectura;
    private boolean modoEscritura;

    //Métodos:
    public ArchivoTexto(String tituloArchivo){//constructor
        super (tituloArchivo);
    }
    public ArchivoTexto(String b, boolean c){//constructor
        super (b);
    }
    public void AbrirModoLectura(){
        System.out.println("Abiendo modo Lectura");
    }
    public String Leer(){

        return "leyendo";
    }
    public void AbrirModoEscritura(){
        System.out.println("Abiendo modo Escritura");
    }
    public void Escribir(String texto){
        System.out.println("Escribiendo");
    }
    public void Cerrar(){
        System.out.println("CERRANDO");
    }
}
