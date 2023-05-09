import java.util.Scanner;
/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el 
carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas)
se mantienen sin cambios.
          a     e     i     o     u
          @     #     $     %     *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente.
Utilice la estructura “según” para la transformación. 
     Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
     La salida del programa debería ser:     @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
*/
public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Palabra o frase(termine con punto(.) por favor.).");
        String F = leer.nextLine();
        System.out.println(""+ frase(F));
    }
    public static String frase(String F){
        Scanner leer = new Scanner(System.in);
        String Aux = "" ;
                for (int i = 0; i < F.length(); i++) {
            switch (F.substring(i,i+1).toLowerCase()){
                case "a" :
                    Aux = Aux + "@" ;
                    break;
                case "e" :
                    Aux = Aux + "#" ;
                    break;
                case "i" :
                    Aux = Aux + "$" ;
                    break;
                case "o" :
                    Aux = Aux + "%" ;
                    break;
                case "u" :
                    Aux = Aux + "*" ;
                    break;
                default :
                    Aux = Aux + F.substring(i,i+1) ;
                    break;
            }
        }
        return Aux ;
    }
}
