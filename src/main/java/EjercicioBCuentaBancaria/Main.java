package EjercicioBCuentaBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaDeAhorros cuentaDeAhorros = new CuentaDeAhorros(20000, 24, 100);

        cuentaDeAhorros.consignarDinero(40000);
        cuentaDeAhorros.retirarDinero(10000);

        System.out.println(cuentaDeAhorros.saldo);

        String imprimir = cuentaDeAhorros.imprimir();


    }
}
