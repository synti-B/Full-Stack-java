package introj.extraEjercicio2introj;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio22 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][3];
        RellenarMatriz(matriz);
        Imprimir(matriz);
    }

    public static void RellenarMatriz(int matriz[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }

        }
    }

    public static void Imprimir(int matriz[][]) {
        int suma = 0;
        System.out.println("Matriz");
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");

                suma = suma + matriz[i][j];
            }
            
        }
        System.out.println(" ");
        System.out.println("La suma de la matriz es: " + suma);
    }
}
