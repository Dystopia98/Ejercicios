
import java.util.Scanner;

/*
Escriba un programa que valide si una nota está entre 0 y 10,
sino está entre 0 y 10 la nota se pedirá de nuevo
hasta que la nota sea correcta.
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int Nota;
        System.out.println("Ingresar nota.");
        Nota = leer.nextInt();
        if (Nota >= 0 && Nota <= 10) {
            System.out.println("La nota es correcta.");
        } else {
            while (Nota < 0 || Nota > 10) {
                System.out.println("Ingresar nota otra vez.");
                Nota = leer.nextInt();
                if (Nota >= 0 && Nota <= 10) {
                    System.out.println("La nota es correcta.");
                }
            }
        }
    }
}
