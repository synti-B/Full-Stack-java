package introj.extraEjercicio2introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que va a ingresar");
        int total = leer.nextInt();
        int max = 0;
        int min = 999;
        double promedio = 0.0;
        int aux = 0;
        double suma=0.0;
        int cont=0;
        do {

            System.out.println("Ingrese un numero mayor a 0");
            int num = leer.nextInt();
            if (total > 0) {
                cont++;
                suma=suma+num;
                if (num > max) {
                    aux = max;
                    max = num;
                    aux = 0;
                } if (num < min) {
                    aux = min;
                    min = num;
                    aux = 0;
                }
                
            } else {

                System.out.println("Debe ser mayor a 0");
            }

        } while (cont != total);
        System.out.println("El maximo valor es: "+max);
        System.out.println("El minimo valor es: "+min);
        System.out.println("el promedio es: "+(suma/total));
    }

}
/*public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros a ingresar");
        int cantidad = sc.nextInt();

        int maximo = 0;
        int minimo = 99;
        double suma = 0;
        int contador = 0;
        double promedio = 0;

        while (cantidad != contador) {

            System.out.println("ingresa un numero ");
            int numero = sc.nextInt();

            suma = suma + numero;
            contador = contador + 1;
            
            if (numero > 0) {
                if (numero > maximo) {

                    maximo = numero;

                }
                if (numero < minimo) {

                    minimo = numero;
                }
            }
        }
        promedio = suma / contador;
        System.out.println("El numero maximo es: " + maximo);
        System.out.println("El numero minimo es: " + minimo);
        System.out.println("el promedio es: " + promedio);
    }

}*/