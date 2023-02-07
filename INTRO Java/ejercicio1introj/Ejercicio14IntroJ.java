package introj.ejercicio1introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class Ejercicio14IntroJ {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la moneda que desea convertir en Euro");
        System.out.println("L= libras, D=dolar, Y=yenes.");
        String moneda = leer.next().toUpperCase();
        System.out.println("Ingrese el monto que desea convertir");
        double monto = leer.nextDouble();
        double calculo = conversion(moneda, monto);
        imprimir(moneda, monto, calculo);
    }

    public static double conversion(String moneda, double monto) {
        double calculo = 0.0;
        switch (moneda) {

            case "L":
                calculo = monto * 0.86;
                break;
            case "D":
                calculo = monto * 1.28611;
                break;
            case "Y":
                calculo = monto * 129.852;
                break;

        }

        return calculo;
    }

    public static void imprimir(String moneda, double monto, double calculo) {
        System.out.println("El monto a convertir: " + monto + " de " + moneda + " en Euros es de: " + calculo);
    }

}
