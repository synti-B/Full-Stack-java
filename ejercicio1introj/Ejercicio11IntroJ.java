package introj.ejercicio1introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class Ejercicio11IntroJ {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = leer.nextInt();
        int opcion = 0;

        do {
            System.out.println("Menu");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opcion");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                }
                case 2 -> {
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                }
                case 3 -> {
                    System.out.println("La multiplicacion es: " + (num1 * num2));
                    break;
                }
                case 4 -> {
                    if (num1 != 0) {
                        System.out.println(" La division es: " + (num1 / num2));
                    } else {
                        System.out.println("Ingrese un numero mayor que 0");
                    }
                    break;
                }
                case 5 -> {
                    System.out.println("Estas seguro de salir? S/N");
                    String opc2 = leer.next().toUpperCase();
                    if (opc2.equals("N")) {
                        opcion=0;
                       break;
                    } else {
                         opcion = 5;
                        
                    }
                }
            }
        } while (opcion != 5);
        System.out.println("Chauuuuu");
    }

}
