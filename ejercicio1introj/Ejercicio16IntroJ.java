package introj.ejercicio1introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class Ejercicio16IntroJ {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int repetido = 0;
        int encontrado = 0;
        int valor = 0;
        boolean band = false;
        System.out.println("Ingrese el tamaño del vector");
        int tamanio = leer.nextInt();
        int arreglo[] = relleno(tamanio);
        System.out.println(" ");
        System.out.println("Ingrese el numero que desea buscar");
        int nBuscar = leer.nextInt();

        buscar(arreglo,nBuscar, tamanio, repetido, band, encontrado);

    }

    public static int[] relleno(int tamanio) {
        int arreglo[] = new int[tamanio];
        for (int i = 0; i <= tamanio - 1; i++) {
            arreglo[i] = (int) (Math.random() * tamanio) + 1;
            System.out.print(arreglo[i] + " ");
        }
        return arreglo;
    }

    public static void buscar(int arreglo[],int nBuscar, int tamanio, int repetido, boolean band, int encontrado) {
        
        for (int i = 0; i <= tamanio - 1; i++) {
            if (nBuscar == arreglo[i]) {
                band = true;
                encontrado = i;
                repetido++;

            }
        }
        if (band = true) {
            System.out.println(" El numero es " + nBuscar + " su posicion es: " + encontrado + " se repite: " + repetido);
        } else {
            System.out.println("No se encontro el numero");
        }
    }

}
