package gestor.archivos;

public interface iFileText {//interfaz
    //declaracion de metodos, no se programan.
    public void AbrirModoLectura();
    public String Leer();
    public void AbrirModoEscritura();
    public void Escribir(String esc);//paso de parametros o firma
    public void Cerrar();
}
