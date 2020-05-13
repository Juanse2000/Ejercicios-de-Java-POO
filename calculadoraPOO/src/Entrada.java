//Ejercicio calculadora sencilla utilizando POO
import java.util.Scanner;

public class Entrada {
    public void entrada(){//Creamos el metodo que va a mostrar por pantalla el programa
        Scanner entrada = new Scanner(System.in);//Creamos metodo Scanner
        
        Metodos op = new Metodos();//Creamos el objeto op(operacion)
        
        int valor1, valor2;//Creamos variables
        int operacion;//Creamos variable operacion
        
        System.out.println("Esta es una calculadora muy genial!");
        System.out.println("Eliga que operacion quiere ejecutar");
        System.out.println("1 (suma) | 2 (resta) | 3 (multiplicacion) | 4 (division)");
        operacion = entrada.nextInt();//Guardamos la variable para elegir una opcion de operacion
        switch(operacion){//Iniciamos el switch
            case 1:System.out.println("Eligio SUMA");
                System.out.println("Ahora ingrese los 2 valores que desea sumar");
                valor1 = entrada.nextInt();//Guardamos valores para la suma
                valor2 = entrada.nextInt();
                System.out.println("El resultado es: " + op.suma(valor1, valor2));//Imprimimos el resultado
                break;
            case 2:System.out.println("Eligio RESTA");
                System.out.println("Ahora ingrese los 2 valores que desea restar");
                valor1 = entrada.nextInt();//Guardamos valores para la resta
                valor2 = entrada.nextInt();
                System.out.println("El resultado es: " + op.resta(valor1, valor2));//Imprimimos resultado
                break;
            case 3:System.out.println("Eligio MULTIPLICACION");
                System.out.println("Ahora ingrese los 2 valores que desea multiplicar");
                valor1 = entrada.nextInt();//Guardamos valores de multiplicacion
                valor2 = entrada.nextInt();
                System.out.println("El resultado es: " + op.multiplicacion(valor1, valor2));//Imprimimos resultados
                break;
            case 4:System.out.println("Eligio DIVISION");
                System.out.println("Ahora ingrese los 2 valores que desea dividir");
                valor1 = entrada.nextInt();//Guardamos valores de division
                valor2 = entrada.nextInt();
                System.out.println("El resultado es: " + op.division(valor1, valor2));//Imprimimos resultados
                break;
                            
        }
    }
    
}
