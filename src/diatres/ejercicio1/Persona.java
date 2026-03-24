package diatres.ejercicio1;

public class Persona {

    private String nombre;

    private int edad;

    public Persona() {
    }

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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if(edad > 0) {
            this.edad = edad;
        }
    }

    public void saludar() {
        System.out.println("Hola, me llamo " + this.nombre + " y tengo " + this.edad + " años");
    }
}
