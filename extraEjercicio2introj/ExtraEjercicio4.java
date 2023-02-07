package introj.extraEjercicio2introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10 y convertiremos en romano");
        int numero = sc.nextInt();

        if (numero > 0 && numero < 11) {

            switch (numero) {
                case 1:
                    System.out.println("el equivalente del " + numero + " en romanos es I");
                    break;
                case 2:
                    System.out.println("el equivalente del " + numero + " en romanos es II");
                    break;
                case 3:
                    System.out.println("el equivalente del " + numero + " en romanos es III");
                    break;
                case 4:
                    System.out.println("el equivalente del " + numero + " en romanos es IV");
                    break;
                case 5:
                    System.out.println("el equivalente del " + numero + " en romanos es V");
                    break;
                case 6:
                    System.out.println("el equivalente del " + numero + " en romanos es VI");
                    break;
                case 7:
                    System.out.println("el equivalente del " + numero + " en romanos es VII");
                    break;
                case 8:
                    System.out.println("el equivalente del " + numero + " en romanos es VIII");
            }

        }

    }
}

