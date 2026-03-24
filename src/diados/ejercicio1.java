package diados;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean valido = false;
        String nombre = "";

        while (!valido) {
            System.out.println("Introduce tu nombre:");
            try {
                nombre = sc.nextLine();
                valido = true; // ← ahora sí cambia la condición
            } catch (NoSuchElementException nse) {
                System.out.println("Error: introduce un número válido.");
                sc.next(); // ← Limpia el buffer
            }
        }

        mostrarNombre(nombre);

    }

    private static void mostrarNombre(String nombre) {
        System.out.println("Tu nombre es: ".concat(nombre) );
    }
}