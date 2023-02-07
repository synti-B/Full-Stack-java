package introj.extraEjercicio2introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio18 {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Ingrese el tamaño del vector");
         int tam=leer.nextInt();
         int arreglo []= new int[tam];
         int suma=0;
         for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese numeros");
            int num=leer.nextInt();
            arreglo[i]=num;
            suma=suma+ arreglo[i];
        }
         System.out.println("vector --> ");
         for (int i = 0; i < tam; i++) {
             System.out.print(arreglo[i]+" "); 
        }
         System.out.println(" ");
         System.out.println("La suma del vector es: "+suma);
         
    }
    
}
