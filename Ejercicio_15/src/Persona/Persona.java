package Persona;

public class Persona {
    private String nombre;
    private int edad;
    private double altura;
    private String ColorPelo;

    public Persona() {
    }

    public Persona(String nombre, int edad, double altura, String ColorPelo) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.ColorPelo = ColorPelo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setColorPelo(String ColorPelo) {
        this.ColorPelo = ColorPelo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public String getColorPelo() {
        return ColorPelo;
    }
    
}
