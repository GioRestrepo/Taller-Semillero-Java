package EjercicioBCuentaBancaria;

public class CuentaCorriente extends CuentaBancaria {

    private int sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual, float comisionMensual) {
        super(saldo, tasaAnual, comisionMensual);

    }

    @Override
    public void consignarDinero(float dinero) {
        if (this.sobregiro > 0) {
            if (this.sobregiro < dinero) {
                this.saldo += Math.abs(this.sobregiro-this.saldo);
                this.sobregiro = 0;
            } else {
                this.sobregiro -= this.saldo;
            }
            this.numeroDeConsignaciones++;
        } else {
            super.consignarDinero(dinero);
        }
    }

    @Override
    public void retirarDinero(float dinero) {
        if (dinero <= this.saldo) {
            super.retirarDinero(dinero);
        } else {
            this.sobregiro += Math.abs(this.saldo - saldo);
            this.saldo = 0;
        }
    }

    @Override
    public void extractoMensual() {

        super.extractoMensual();
    }

    @Override
    public String imprimir() {
        return "Saldo: " + this.saldo + ", comisión mensual: " + this.comisionMensual +
                ", número de transacciones: " + (this.numeroDeConsignaciones + this.numeroDeRetiros) +
                ", sobregiro: " + this.sobregiro;
    }
}

