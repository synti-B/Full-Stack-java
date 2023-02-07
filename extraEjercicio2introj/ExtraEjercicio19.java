package introj.extraEjercicio2introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        int arreglo1[] = new int[tam];
        int arreglo2[] = new int[tam];
        boolean ban = false;
        for (int i = 0; i < tam; i++) {
            arreglo1[i] = (int) (Math.random() * 1);
            arreglo2[i] = (int) (Math.random() * 1);
        }
        for (int i = 0; i < tam; i++) {
            if (arreglo1[i] == arreglo2[i]) {
                ban = true;
            } else {
                break;
            }
        }
        if (ban) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("no son iguales");
        }
    }

}
