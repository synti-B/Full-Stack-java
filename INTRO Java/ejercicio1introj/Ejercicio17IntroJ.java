
package introj.ejercicio1introj;

/**
 *
 * @author Synti
 */
public class Ejercicio17IntroJ {

    public static void main(String[] args) {
        int cont1=0,cont2=0,cont3=0, cont4=0,cont5=0;
        int arreglo[] = contador();
        
        cuenta(arreglo, cont1, cont2, cont3, cont4, cont5);
        
    }
    public static int[] contador(){
    int arreglo []= new int [25];
        System.out.println("Matriz Resultado");
    for(int i=0; i<=25-1; i++){
    arreglo[i] = (int) (Math.random() * 15000) + 1;
        System.out.println(arreglo[i]+" ");
    }
    return arreglo;
    }
    public static void cuenta(int arreglo[],int cont1,int cont2,int cont3, int cont4, int cont5){
      for(int i=0; i<=25-1; i++){
          int digitos= (int)(Math.log10(arreglo[i])+1);
        switch (digitos) {
             case 1:
                cont1++;
                break;
            case 2:
                cont2++;
                break;
            case 3:
                cont3++;
                break;
            case 4:
                cont4++;
                break;
            case 5:
                cont5++;
                break;
        }
        }
        System.out.println("los numeros que tienen 1 digito son = "+cont1+" los de 2 digitos son: "+cont2+" los de 3 digitos son: "+cont3+" los de 4 digitos son: "+cont4+" los de 5 digitos son: "+cont5);
      }
    }

