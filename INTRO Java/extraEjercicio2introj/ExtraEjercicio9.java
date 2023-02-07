package introj.extraEjercicio2introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el  primer numero");
        int numero1 = sc.nextInt();
        System.out.println("ingrese el 2do numero");
        int numero2 = sc.nextInt();
        int cociente = 0;
        int aux = 0;

        int residuo = 9999;

        if (numero1 > numero2) {
            while (residuo >= numero2) {

                residuo = numero1 - numero2;
                aux = numero1;
                numero1 = residuo;
                cociente++;
            }

        } else {
            System.out.println("el primer numero debe ser mayor");
        }
        System.out.println("el residuo es: " + residuo);
        System.out.println("el cociente es : " + cociente);
    }

}
