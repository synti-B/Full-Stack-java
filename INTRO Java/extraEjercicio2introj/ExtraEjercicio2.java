package introj.extraEjercicio2introj;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio2 {
    public static void main(String[] args) {
        int aux =0;
        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;
       
        System.out.println("Los Valores de A=  " + A + ", B = " + B + ", C= " + C + "y D=  "+ D );

        aux = B;
        B=C;        
        C = A;         
        A = D;        
        D= aux;        
        System.out.println("Los Valores de A=  " + A + ", B = " + B + ", C= " + C + "y D=  "+ D );
 
    }
    
}
