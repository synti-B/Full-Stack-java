package introj.ejercicio1introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class Ejercicio5IntroJ {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
   int num= leer.nextInt();
        System.out.println("El numero ingresado es: "+num+" el doble es : "+(num*2)+"el tribles es : "+(num*3)+" y su raiz cuadrada es : "+ (Math.sqrt(num)));
    }

}
