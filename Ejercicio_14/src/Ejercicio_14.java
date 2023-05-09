import java.util.Scanner;
/*
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
*/
public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] Equipo;
        Equipo = new String[8];
        for (int i = 0; i < 7; i++) {
            Equipo[i] = leer.nextLine();
        }
    }
    
}
