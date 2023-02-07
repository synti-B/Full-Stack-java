package introj.extraEjercicio2introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("INGRESA UNA LETRA");

        String letra = sc.next().toUpperCase();

        if (letra.equals("A") || letra.equals("E")
        || letra.equals("I") || letra.equals("O") || letra.equals("U")) {

            System.out.println("correcto es una Vocal");
        } else {
            System.out.println("la letra no es una Vocal");
        }
    }
}