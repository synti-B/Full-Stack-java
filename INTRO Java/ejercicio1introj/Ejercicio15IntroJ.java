package introj.ejercicio1introj;

/**
 *
 * @author Synti
 */
public class Ejercicio15IntroJ {

    public static void main(String[] args) {
        int arregloV[] = calculo();
        imprimir(arregloV);
    }

    public static int[] calculo() {
        int[] arregloV = new int[100];
        for (int i = 0; i <= 99; i++) {
            arregloV[i] = i + 1;

        }
        return arregloV;
    }

    public static void imprimir(int arregloV[]) {
        System.out.println(" ");
        System.out.println("Matriz Original");
        System.out.println(" ");
        for (int i = 0; i <= 99; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println(" ");
        System.out.println(" Matriz Descendente ");
        System.out.println(" ");
        for (int i = (arregloV.length - 1); i >= 0; i--) {
            System.out.print(" " + i + " ");
        }
    }
}
