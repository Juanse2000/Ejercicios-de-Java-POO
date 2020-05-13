
public class Encapsulamiento {
    //Declarar atributos tipo privados
    private String nombre;
    private String padre;
    private int edad;
    private boolean estado; //True vive o false fallecio
    //Clase metodo constructor
    public Encapsulamiento(String nombre, String padre, int edad, boolean estado){
        this.nombre = nombre;
        this.padre = padre;
        this.edad = edad;
        this.estado = estado;
    }
    //Declarar metodos Get: Acceder y Set: Modificar
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;        
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    

    
}
