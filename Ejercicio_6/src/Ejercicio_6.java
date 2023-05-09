import java.util.Scanner;
/*
 Implementar un programa que le pida 2 números enteros al usuario
y determine si ambos o alguno de ellos es mayor a 25.
*/
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N1 , N2 ;
        System.out.println("Favor de ingresar 2 números enteros.");
        N1 = leer.nextInt();
        N2 = leer.nextInt();
        if (N1 < 25 && N2 < 25){
            System.out.println("Ambos números son menores a 25.");
        } else if ((N1 < 25 && N2 >= 25) ||(N1 >= 25 && N2 < 25) ){
            System.out.println("Al menos 1 número es menor a 25.");
        } else
            System.out.println("Ninguno es menor a 25.");
    }
    
}
