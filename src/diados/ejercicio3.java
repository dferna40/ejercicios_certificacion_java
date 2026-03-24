package diados;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean valido = false;
        int numero1 = 0;

        while (!valido) {
            System.out.println("Introduce el numero para saber si es par o impar:");
            try {
                numero1 = sc.nextInt();
                valido = true; // ← ahora sí cambia la condición
            } catch (InputMismatchException ime) {
                System.out.println("Error: introduce un número válido.");
                sc.next(); // ← Limpia el buffer
            }
        }

        if(esPar(numero1)){
            System.out.println("El numero : " + numero1 + " es par.");
        }else {
            System.out.println("El numero : " + numero1 + " es impar.");
        }


    }

    private static boolean esPar(int numero1) {

        if((numero1 % 2) == 0){
            return true;
        } else {
            return false;
        }
    }
}