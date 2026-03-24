package diauno;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ejercicio2 {
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

        switch (compruebaNumero(numero)) {
            case 1:
                System.out.println("El numero es positivo");
                break;
            case -1:
                System.out.println("El numero es negativo");
                break;
            case 0:
                System.out.println("El numero es cero");
                break;
            default:
                System.out.println("Valor inesperado");

        }


    }
    public static int compruebaNumero(int numero){

        if(numero > 0) {
            return 1;
        };
        if(numero < 0) {
          return -1;
        };

        return 0;
    }
}