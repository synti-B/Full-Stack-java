
package introj.ejercicio1introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class Ejercicio6IntroJ {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        if(num % 2==0){
        System.out.println("El numero ingresado es PAR");
        }else{
            System.out.println("El numero es IMPAR");
        }
    } 
    
}
