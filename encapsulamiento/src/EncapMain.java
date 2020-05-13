
import java.util.Scanner;

public class EncapMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        
        Encapsulamiento obMascota = new Encapsulamiento("Sandy","Juana",2,true);
        
        System.out.println("nombre: "+ obMascota.getNombre());
        System.out.println("padre: "+ obMascota.getPadre());
        System.out.println("edad: "+ obMascota.getEdad());
        System.out.println("estado: "+ obMascota.isEstado());
        
        System.out.println("-------------------------------------------------------");
        System.out.println("Vamos a cambiar el nombre");
        System.out.println("¿Que nombre tendra la mascota ahora?");
        obMascota.setNombre(entrada.next());
        obMascota.setPadre("Pepe");
        obMascota.setEdad(5);
        obMascota.setEstado(false);
        
        System.out.println("______________________________________________________");
        System.out.println("nombre: "+ obMascota.getNombre());
        System.out.println("padre: "+ obMascota.getPadre());
        System.out.println("edad: "+ obMascota.getEdad());
        System.out.println("estado: "+ obMascota.isEstado());
    }
    
}
