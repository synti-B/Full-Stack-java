package introj.extraEjercicio2introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean ban = false;
        int contT = 0;
        int par = 0;
        int impar = 0;
        do {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            if (num > 0 && num % 5 != 0) {
                contT++;

                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }

            } else {
                ban = true;
                System.out.println("Debe ser mayor a 0");
            }

        } while (ban != true);
        System.out.println("Cantidad de impares: " + impar);
        System.out.println("Cantidad de pares: " + par);
        System.out.println("Cantidad Total: " + contT);
    }

}
