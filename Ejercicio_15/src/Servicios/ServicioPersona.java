package Servicios;

import Persona.Persona;
import java.util.Scanner;

public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
    public Persona MostrarAtributos(){
        Persona Objeto = new Persona();
        System.out.print("Nombre : ");
        Objeto.setNombre(leer.nextLine());
        System.out.print("Edad : ");
        Objeto.setEdad(leer.nextInt());
        System.out.print("Altura : ");
        Objeto.setAltura(leer.nextInt());
        System.out.print("Color de pelo : ");
        Objeto.setColorPelo(leer.next());
        return new Persona(Objeto.getNombre(),Objeto.getEdad(),Objeto.getAltura(),Objeto.getColorPelo());
    }
}
