
package introj.ejercicio1introj;

/**
 *
 * @author Synti
 */
public class Ejercicio18IntroJ {
public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int matriztranspuesta[][] = new int[4][4];

        System.out.println("Matriz Origen");
        System.out.println();

        for (int i = 0; i < 4; i++) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            for (int j = 0; j < 4 ; j++) {
                
                matriz[i][j] = (int) (Math.random() * 99) + 1;
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println("");
        transpuesta(matriz, matriztranspuesta);
        
    }

    public static void transpuesta(int matriz[][], int matriztranspuesta[][]) {
        
        System.out.println("");        
        System.out.println("matriz transpuesta");
        System.out.println("");
        
        for (int j = 0; j < 4 ; j++) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            for (int i = 0; i < 4; i++) {
                matriztranspuesta[j][i]=matriz[i][j];
                System.out.print(matriztranspuesta[j][i] + " ");
               

            }
        }
    }
}