package diados;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean valido = false;
        int numero1 = 0;
        int numero2 = 0;

        while (!valido) {
            System.out.println("Introduce los numeros a sumar:");
            try {
                numero1 = sc.nextInt();
                numero2 = sc.nextInt();
                valido = true; // ← ahora sí cambia la condición
            } catch (InputMismatchException ime) {
                System.out.println("Error: introduce un número válido.");
                sc.next(); // ← Limpia el buffer
            }
        }


        System.out.println("La suma de los numeros es: " + sumar(numero1,numero2));

    }

    private static int sumar(int numero1, int numero2) {

        return numero1 + numero2;
    }
}