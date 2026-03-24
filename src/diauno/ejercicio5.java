package diauno;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ejercicio5 {
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

            System.out.println("Nombre del mes:");
            System.out.println("");
           switch (numero) {
               case 1:
                   System.out.println("Enero");
                   break;
               case 2:
                   System.out.println("Febrero");
                   break;
               case 3:
                   System.out.println("Marzo");
                   break;

               default:
                   System.out.println("No has introducido un numero de mes valido");
           }
        } else {
            System.out.println("El numero que introduzcas debe ser mayor a cero");
        }
    }
}