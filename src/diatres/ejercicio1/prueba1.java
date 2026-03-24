package diatres.ejercicio1;

public class prueba1 {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setNombre("David");
        persona.setEdad(39);

        System.out.println("El nombre de la persona es: " + persona.getNombre());

        System.out.println("La edad de la persona es: " + persona.getEdad());

        System.out.println("Prueba añadiendo un objeto de tipo Persona con la edad negativa");
        Persona persona2 = new Persona();
        persona2.setNombre("Ana");
        persona2.setEdad(-2);

        System.out.println(persona2.getEdad());

        Coche coche = new Coche("MG", "HS", 180);

        System.out.println("La marca del coche es :" + coche.getMarca());
        System.out.println("El modelo del coche es :" + coche.getModelo());
        System.out.println("La velocidad del coche es :" + coche.getVelocidad());

        System.out.println("Acelero el coche");
        System.out.println(coche.acelerar());
        System.out.println("Freno el coche");
        System.out.println(coche.frenar());

        System.out.println("Prueba con cuenta bancaria");
        CuentaBancaria cuentaBancaria = new CuentaBancaria();

        cuentaBancaria.setSaldo(10000);
        cuentaBancaria.setTitular("David");

        System.out.println("Titular: " + cuentaBancaria.getTitular());
        System.out.println("Saldo inicial: " + cuentaBancaria.getSaldo());

        cuentaBancaria.setSaldo(cuentaBancaria.ingresar(500d));
        System.out.println("Ingresar cantidad: " + 500 + " saldo resultante tras ingresar: " + cuentaBancaria.getSaldo());
        System.out.println("Saldo tras ingresar: " + cuentaBancaria.getSaldo());
        cuentaBancaria.setSaldo(cuentaBancaria.retirar(300d));
        System.out.println("Retiro cantidad: " + 300 + " saldo resultante tras retirar: " + cuentaBancaria.getSaldo());
        System.out.println("Saldo tras retirar: " + cuentaBancaria.getSaldo());
    }




}
