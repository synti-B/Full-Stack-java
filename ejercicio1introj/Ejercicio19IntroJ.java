package introj.ejercicio1introj;

import java.util.Arrays;

/**
 *
 * @author Synti
 */
public class Ejercicio19IntroJ {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int matriztranspuesta[][] = new int[4][4];
        boolean band = true;

        System.out.println("Matriz Origen");
               for (int i = 0; i < 4; i++) {
            System.out.println("");
            System.out.println("");

            for (int j = 0; j < 4; j++) {

                matriz[i][j] = (int) (Math.random() * 1)+2;
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println(" ");
        transpuesta(matriz, matriztranspuesta);
        antisimetrica(matriz, matriztranspuesta, band);

    }

    public static void transpuesta(int matriz[][], int matriztranspuesta[][]) {

        System.out.println(" ");
        System.out.println("matriz transpuesta");
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                matriztranspuesta[j][i] = matriz[i][j];
                System.out.print(matriztranspuesta[j][i] + " ");

            }
        }
    }

    public static void antisimetrica(int matriz[][], int matriztranspuesta[][], boolean band) {
        System.out.println(" ");
        System.out.println("Matriz Negativa");
        System.out.println(" ");
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                  System.out.print(((-1) *matriztranspuesta[i][j]) + " ");
                if (matriztranspuesta[i][j] != matriz[i][j]) {
                    band = false;
               
                }
            }
        }
        if (band) {
            System.out.println(" ");
            System.out.println("Es una Matriz Antisimétrica");
        } else {
            System.out.println(" ");
            System.out.println(" No es antisimetrico");
        }

    }
}
