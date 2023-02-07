package introj.extraEjercicio2introj;

/**
 *
 * @author Synti
 */
import java.util.Scanner;

public class ExtraEjercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura, y para terminer el 0");
        double altura = sc.nextDouble();
        int cont1 = 0;
        int cont2 = 0;
        double alturabaja = 0;
        double promedio1 = 0;
        double promedio2 = 0;
        double alturaalta = 0;

        while (altura != 0) {

            if (altura < 1.60) {

                cont1 = cont1 + 1;

                alturabaja = alturabaja + altura;

            }
            cont2 = cont2 + 1;
            alturaalta = alturaalta + altura;
            altura = sc.nextDouble();
        }

        System.out.println("la cantida de personas por debajo de 1.60 metros es "
                + cont1 + " y el promedio de altura  es:  " + (promedio1 = (alturabaja / cont1)));

        System.out.println("la cantida de personas  es "
                + cont2 + " y el promedio de altura  es:  " + (promedio2 = alturaalta / cont2));

    }
}
