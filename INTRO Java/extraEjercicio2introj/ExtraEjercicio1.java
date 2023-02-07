package introj.extraEjercicio2introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio1 {

    
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        
        System.out.println("INGRESA LA CANTIDAD DE MINUTOS");
        
        int minutos = sc.nextInt();
        
        int dias=0;
        int horas=0;
        
        horas= minutos % (60*24)/60 ; 
        
        dias = minutos /1440;
        
        System.out.println(dias + " dias "+ horas + " horas.");
    }
    
}

