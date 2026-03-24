package diatres.ejercicio1;

public class Coche {

    private String marca;

    private String modelo;

    private int velocidad;

    public Coche(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int acelerar() {
        return this.velocidad + 10;
    }

    public int frenar(){
        return this.velocidad - 10;
    }
}
