package diauno;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean valido = false;
        int numero = 0;

        while (!valido) {
            System.out.println("Introduce un numero:");
            try {
                numero = sc.nextInt();
                valido = true; // ← ahora sí cambia la condición
            } catch (InputMismatchException ime) {
                System.out.println("Error: introduce un número válido.");
                sc.next(); // ← Limpia el buffer


            }
        }

        if (numero > 0){
            System.out.println("Listado de numeros:");
            System.out.println("");
            for(int i = 1; i <= numero; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("El numero que introduzcas debe ser mayor a cero");
        }
    }
}