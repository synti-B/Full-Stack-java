
package introj.extraEjercicio2introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio14introj {

 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de familias");

        int cantidadFamilia = sc.nextInt();

        int edad = 0;
        float sumaEdades = 0;
        int cantidadTotalHijos = 0;
        int hijosXFamilia = 0;

        for (int i = 1; i <= cantidadFamilia; i++) {
            System.out.println("Ingrese Cantidad de hijos de la Familia: " + i);
            hijosXFamilia = sc.nextInt();
            for (int j = 1; j <= hijosXFamilia; j++) {
                System.out.println("Ingrese la edad del hijo: " + j + " de la familia : " + i);
                edad = sc.nextInt();

                sumaEdades = sumaEdades + edad;
                cantidadTotalHijos++;
            }
        }
        System.out.println("El promerdio de edades de todos los hijos es " + sumaEdades / cantidadTotalHijos);

    }

}