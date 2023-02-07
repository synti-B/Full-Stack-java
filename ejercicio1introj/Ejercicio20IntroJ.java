package introj.ejercicio1introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class Ejercicio20IntroJ {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.println("Ingrese numeros de la matriz 3X3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                int num = leer.nextInt();
                if (num >= 1 && num <= 9) {
                    matriz[i][j] = num;

                } else {
                    System.out.println("Ingrese de nuevo, numero entre 1 y 9");
                    --j;
                }

            }
        }

        System.out.println("matriz");
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");

            }
        }
        System.out.println(" ");
        suma(matriz);
    }

    public static void suma(int matriz[][]) {
        int suma=0;
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        int sumaFila = 0;
        int sumaCol = 0;
            for (int j = 0; j <= 2; j++) {
            suma = suma + matriz[0][j];
        }
        for (int i = 0; i < 3; i++) {
            sumaCol = 0;
            sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila = sumaFila + matriz[i][j];
                sumaCol = sumaCol + matriz[j][i];

            }

            sumaDiagonal1 = sumaDiagonal1 + matriz[i][i];
            sumaDiagonal2 = sumaDiagonal2 + matriz[3 - 1 - i][3 - 1 - i];
        }
        if (sumaFila != suma || sumaCol != suma || sumaDiagonal1!= suma || sumaDiagonal2!=suma) {
            System.out.println("La matriz no es cuadrado magico " + sumaDiagonal1 + " " + sumaDiagonal2 + " " + sumaCol + " " + sumaFila);
        } else {
            System.out.println(" ");
            System.out.print("suma de la Columna: " + sumaCol);
            System.out.println(" ");
            System.out.print("suma de la fila: " + sumaFila);
            System.out.println(" ");
            System.out.print("suma de la diagonal primera: " + sumaDiagonal1);
            System.out.println(" ");
            System.out.print("suma de la diagonal segunda: " + sumaDiagonal2);
            System.out.println(" "+suma);
            System.out.println("La matriz es cuadrado magico");
        }
    }
}
