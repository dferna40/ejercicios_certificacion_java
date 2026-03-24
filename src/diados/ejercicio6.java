package diados;

public class ejercicio6 {
    public static void main(String[] args) {

        int[] numerosEnteros = {1,2,3,4,5};

        System.out.println("La suma de los numeros es: " + sumarArray(numerosEnteros));

    }

    private static int sumarArray(int[] listaNumeros) {

        int suma = 0;

        for(int i = 0; i <= listaNumeros.length -1; i++) {
            suma += listaNumeros[i];
        }

        return suma;
    }
}