package introj.extraEjercicio2introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class extraEjercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa un numero ");

        int numero = sc.nextInt();

        String x = Integer.toString(numero);

        long digitos = x.length();

        System.out.println("la cantidad de digitos de tu numero ingresado es " + digitos);
    }
    
}
