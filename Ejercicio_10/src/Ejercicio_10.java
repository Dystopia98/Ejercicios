
import java.util.Scanner;

public class Ejercicio_10 {

    /*
    Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
    e imprima el número ingresado seguido de 
    tantos asteriscos como indique su valor. 
       Por ejemplo:
                   5 *****
                   3 ***
                   11 ***********
                   2 **

     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 números comprendidos entre el 1 y 20.");
        int Numero[] = new int[4];
        for (int i = 0; i < 4; i++) {
            Numero[i] = leer.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(Numero[i]+" :");
            for (int j = 0; j < Numero[i]; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
