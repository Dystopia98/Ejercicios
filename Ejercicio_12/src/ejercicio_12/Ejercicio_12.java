package ejercicio_12;
import java.util.Scanner;
/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por 
el usuario,validando que el primer número múltiplo del segundo e imprima 
si el primer número es múltiplo del segundo, sino informe que no lo son.
*/
public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar 2 números.");
        int N1 = leer.nextInt() , N2 = leer.nextInt() ;
        EsMultiplo(N1,N2) ;
    }
    public static void EsMultiplo(int A, int B){
        switch( A % B){
            case 0 :
                System.out.println(A +" es multiplo de "+ B);
                break;
            default :
                System.out.println(A +" no es multiplo de "+ B);
                break;
        }
    }
}
