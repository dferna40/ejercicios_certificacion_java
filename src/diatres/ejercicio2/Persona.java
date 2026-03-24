package diatres.ejercicio2;

public class Persona {

    private String nombre;

    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void saludar(String nombre, int edad) {
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años");
    }
}
