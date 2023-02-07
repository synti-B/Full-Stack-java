package introj.extraEjercicio2introj;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio20 {

    public static void main(String[] args) {
         int arreglo1[] = new int[10];
         Relleno(arreglo1);
         Imprimir(arreglo1);
    }
      public static void Relleno(int arreglo1[]){
        for (int i = 0; i < 10; i++) {
            arreglo1[i] = (int) (Math.random() * 10);
           
        }  
    }
      public static void Imprimir(int arreglo1[]){
          System.out.println("Vector");
          for (int i = 0; i < 10; i++) {
              System.out.print(arreglo1[i]+" ");
          }
      }
    
}
