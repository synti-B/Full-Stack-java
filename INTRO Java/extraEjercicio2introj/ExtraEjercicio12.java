package introj.extraEjercicio2introj;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio12 {

    public static void main(String[] args) {
        String arreglo[] = new String[10];

        for (int i = 0; i < 10; i++) {
            arreglo[i] = Integer.toString(i);

            if (arreglo[i].equals("3")) {
                arreglo[i] = "E";
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(arreglo[i] + "-" + arreglo[j] + "-" + arreglo[k]);

                }

            }

        }

    }
}
