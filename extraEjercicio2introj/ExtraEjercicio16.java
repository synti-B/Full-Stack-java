
package introj.extraEjercicio2introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio16 {

static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        String opcion = " "; 
        do{   
        
        
            
        pedirNombres();
        
        System.out.println("Desea ingresar Datos Si/No ");
        opcion= sc.next().toUpperCase();
        }while(!"NO".equals(opcion));
      
    }
    
    public static void pedirNombres(){
        
        System.out.println("Ingresa el nombre de la persona");
        String nombre = sc.next();
        
        System.out.println("Ingresa la edad de la persona");
        int edad =sc.nextInt();
        
        
        if (edad>=18){
            
            System.out.println(nombre + " es mayor de edad tiene : " + edad + " años");
            
        } else{
            
            System.out.println(nombre + " es menor de edad tiene : " + edad + " años");
            
        }
        
    }
}
    
