
import Persona.Persona;
import Servicios.ServicioPersona;
import java.util.Scanner;


public class Ejercicio_15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioPersona PersServ = new ServicioPersona();
        Persona P = PersServ.MostrarAtributos();
    }
    
}
