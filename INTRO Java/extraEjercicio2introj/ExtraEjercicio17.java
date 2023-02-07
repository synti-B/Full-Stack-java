package introj.extraEjercicio2introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = leer.nextInt();

        if (numeroPrimo(num)) {
            System.out.println("El numero: " + num + " es primo");
        } else {
            System.out.println("El numero: " + num + " no es primo");
        }
    }

    public static boolean numeroPrimo(int num) {
        if (num == 0 || num == 1 || num == 4) {
            return false;
        }
        for (int x = 2; x < num ; x++) {
            
            if (num % x == 0) {
                return false;
            }
        }
       
        return true;
    }

}
