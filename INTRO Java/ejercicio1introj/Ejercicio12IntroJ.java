package introj.ejercicio1introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class Ejercicio12IntroJ {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int contI = 0;
        int contC = 0;
        do {
            System.out.println("Ingrese cadena de caracteres");
            cadena = leer.next();
            if (cadena.length() == 5) {
                if (cadena.substring(0, 1).equals("X") && cadena.substring(4,5).equals("O")) {
                    contC = contC + 1;
                } else {
                    contI = contI + 1;
                }
            } else {
                System.out.println("NO DEBE SUPERER LOS 5 DIGITOS");
            }

        } while (!"&&&&&".equals(cadena));
        System.out.println("Cantidad de candenas Correctas: " + contC);
        System.out.println("Cantidad de cadenas Incorrectas: " + contI);
        System.out.println("FIN");
    }

}
