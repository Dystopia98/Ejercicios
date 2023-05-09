
import java.util.Scanner;

public class Ejercicio_9 {

    /*
    Escriba un programa que lea 20 números. 
    Si el número leído es igual a cero se debe salir del bucle y 
    mostrar el mensaje "Se capturó el numero cero".  
    El programa deberá calcular y 
    mostrar el resultado de la suma de los números leídos, 
    pero si el número es negativo no debe sumarse. 
         Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int Numero, intentos = 0, Aux = 0;
        System.out.println("Ingresar 20 números (escribir 0 para terminar en cualquier momento)");
        do {
            intentos = intentos+1;
            Numero = leer.nextInt();
            if (Numero > 0) {
                Aux = Aux + Numero;
            } else if (Numero < 0) {
                Aux = Aux;
            } else {
                System.out.println("Se capturo el número 0.");
            }
        } while (Numero != 0 && intentos < 20);
        System.out.println("La suma de esos números positivos es " + Aux);
    }
}
