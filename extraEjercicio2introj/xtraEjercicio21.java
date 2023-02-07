package introj.extraEjercicio2introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class xtraEjercicio21 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        double arreglo[] = new double[10];
        double suma = 0;
        for (int i = 1; i < 10; i++) {
            System.out.println("Carga de nota de alumno " + i);
            arreglo[i] = CargaDatos(arreglo, suma);//promedio
            //System.out.println(arreglo[i] + " ");
        }
        for (int i = 1; i < 10; i++) {
            if (arreglo[i] >= 7) {
                System.out.println("Alumno: " + i + " Aprobo");
            } else {
                System.out.println("Alumno: " + i + " NO Aprobo");
            }
        }

    }

    public static double CargaDatos(double arreglo[], double suma) {

        System.out.println("Ingrese nota Primer trabajo práctico evaluativo 10%");
        int nota1 = leer.nextInt();
        System.out.println("Ingrese nota Segundo trabajo práctico evaluativo 15%");
        int nota2 = leer.nextInt();
        System.out.println("Ingrese nota Primer Integrador 25%");
        int nota3 = leer.nextInt();
        System.out.println("Ingrese nota Segundo integrador 50%");
        int nota4 = leer.nextInt();
        suma = (nota1 * 0.10) + (nota2 * 0.15) + (nota3 * 0.25) + (nota4 * 0.50);

        return suma;

    }
}
