package introj.extraEjercicio2introj;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio24 {

    public static void main(String[] args) {
        int arreglo[] = new int[10];
        arreglo[0]=1;
        arreglo[1]=1;
        for (int i = 2; i <10; i++) {
            arreglo[i] = arreglo[i-1]+arreglo[i-2];

        }
        System.out.println("Arreglo Fibonacci");
        for (int i = 0; i <10; i++) {
            System.out.println(arreglo[i] + "");
        }
    }
}
