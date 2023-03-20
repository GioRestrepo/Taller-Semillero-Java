package EjercicioBCuentaBancaria;

public class CuentaDeAhorros extends CuentaBancaria {

    private boolean cuentaActiva;

    public CuentaDeAhorros(float saldo, float tasaAnual, float comisionMensual) {
        super(saldo, tasaAnual, comisionMensual);
        this.cuentaActiva = estadoCuenta();
    }


    public boolean estadoCuenta() {

        if (this.saldo > 10000) {
            this.cuentaActiva = true;
        } else {
            this.cuentaActiva = false;
        }
        return this.cuentaActiva;
    }

    @Override
    public void consignarDinero(float dinero) {
        estadoCuenta();
        if (this.cuentaActiva) {
            super.consignarDinero(dinero);
            System.out.println("cuenta activa");
        } else {
            float saldoTemp = this.saldo + dinero;
            if (saldoTemp > 10000) {
                super.consignarDinero(dinero);

                estadoCuenta();
                System.out.println("cuenta activa x2");
            }
        }


    }

    @Override
    public void retirarDinero(float dinero) {
        if (this.cuentaActiva) {
            super.retirarDinero(dinero);
        } else {
            System.out.println("cuenta inactiva");
        }
    }

    @Override
    public void extractoMensual() {
        if (this.numeroDeRetiros > 4) {
            this.saldo = (this.saldo - this.comisionMensual - 1000) + calcularInteresMensual();
        } else {
            super.extractoMensual();
        }
        estadoCuenta();
    }

    @Override
    public String imprimir() {
        return "Saldo: " + this.saldo + ", comisión mensual: " + this.comisionMensual +
                ", número de transacciones: " + (this.numeroDeConsignaciones + this.numeroDeRetiros);
    }
}
