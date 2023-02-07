package introj.extraEjercicio2introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio15 {

 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-------Calculadora--------");

        System.out.println("Ingrese el 1er Numero");

        float numero1 = sc.nextFloat();

        System.out.println("Ingrese el 2do Numero");

        float numero2 = sc.nextFloat();

        System.out.println("Seleccione operacion a realizar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                suma(numero1, numero2);
                break;
            case 2:
                resta(numero1, numero2);
                break;
            case 3:
                multipli(numero1, numero2);
                break;
            case 4:
                division(numero1, numero2);
                break;
            case 5: 
                System.out.println("Adiosito");
                break; 
        }

    }

    public static void suma(float numero1, float numero2) {
        System.out.println("la suma de los numeros es: " + (numero1 + numero2));

    }

    public static void resta(float numero1, float numero2) {
        System.out.println("la resta de los numeros es: " + (numero1 - numero2));

    }

    public static void multipli(float numero1, float numero2) {
        System.out.println("la multiplicacion de los numeros es: " + (numero1 * numero2));

    }

    public static void division(float numero1, float numero2) {
        System.out.println("la division de los numeros es: " + (numero1 / numero2));

    }

}