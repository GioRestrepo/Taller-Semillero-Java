package EjercicioBCuentaBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria1 = new CuentaDeAhorros(1000,0.26f, 100);
        //float interesMensual = cuentaBancaria1.calcularInteresMensual();
        //System.out.println(interesMensual);
        cuentaBancaria1.consignarDinero(90);
        cuentaBancaria1.consignarDinero(90);
        cuentaBancaria1.consignarDinero(90);
        cuentaBancaria1.consignarDinero(200000);
        cuentaBancaria1.consignarDinero(200000);
        //System.out.println(cuentaBancaria1.cuentaActiva);
        System.out.println(cuentaBancaria1.saldo);
        cuentaBancaria1.retirarDinero(100000);
        System.out.println(cuentaBancaria1.saldo);
        cuentaBancaria1.retirarDinero(100000);
        System.out.println(cuentaBancaria1.saldo);
        cuentaBancaria1.retirarDinero(100000);
        System.out.println(cuentaBancaria1.saldo);
        cuentaBancaria1.retirarDinero(100000);
        System.out.println(cuentaBancaria1.saldo);
        cuentaBancaria1.consignarDinero(100);
        System.out.println(cuentaBancaria1.saldo);
        cuentaBancaria1.consignarDinero(1000000);
        System.out.println(cuentaBancaria1.saldo);
        //cuentaBancaria1.retirarDinero(1000);
        //cuentaBancaria1.retirarDinero(1000);
        //String extratoMensual = cuentaBancaria1.extractoMensual(0.04f);
        //System.out.println(extratoMensual);
        //cuentaBancaria1.extractoMensual(100);
        //String imprimir = cuentaBancaria1.imprimir();
        //System.out.println(imprimir);

    }
}
