package diatres.ejercicio1;

public class CuentaBancaria {

    private String titular;

    private double saldo;

    public CuentaBancaria() {
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public double ingresar(double cantidad) {

        return this.saldo + cantidad;
    }

    public double retirar(double cantidad) {

        double saldoResultante = 0d;

        if(saldo >= cantidad) {
            saldoResultante = this.saldo - cantidad;
        }

        return saldoResultante;
    }

}
