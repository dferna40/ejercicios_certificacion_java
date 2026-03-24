package diados;

public class ejercicio7 {
    public static void main(String[] args) {

        String nombreCompleto = "Pepe Fernandez Ramirez";

        System.out.println("La longitud del nombre es: " + nombreCompleto.length());

        String[] partes = nombreCompleto.split(" ");

        if(partes[0].contains("David")){
            System.out.println("El nombre es: " + partes[0]);
        } else {
            System.out.println("El nombre no es David");
        }

        System.out.println("Solo el nombre: " + partes[0]);

    }


}