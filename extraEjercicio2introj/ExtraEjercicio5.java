package introj.extraEjercicio2introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio5 {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL TIPO DE SOCIO 'A' , 'B','C'");

        String socio = sc.next().toUpperCase();

        System.out.println("Ingrese el valor Real del tratamiento");

        double coste = sc.nextDouble();

        switch (socio) {
            case "A":
                System.out.println("el costo a pagar por el tratamiento es: " + coste * 0.5);
                break;
            case "B":
                System.out.println("el costo a pagar por el tratamiento es: " + coste * 0.35);
                break;
            case "C":
                System.out.println("el costo a pagar por el tratamiento es: " + coste);
                break;
            default: 
                System.out.println("error la el tipo de socio ingresado no exite");
        }

    }

}