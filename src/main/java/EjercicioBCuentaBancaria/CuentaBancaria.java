package EjercicioBCuentaBancaria;


public class CuentaBancaria {

    protected float saldo;
    protected int numeroDeConsignaciones = 0;
    protected int numeroDeRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public CuentaBancaria(float saldo, float tasaAnual, float comisionMensual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
        this.comisionMensual = comisionMensual;
    }

    public void consignarDinero(float dinero) {
        if (dinero > 0) {
            this.saldo += dinero;
            this.numeroDeConsignaciones++;
        }
    }

    public void retirarDinero(float dinero) {
        if (dinero <= this.saldo) {
            this.saldo -= dinero;
            this.numeroDeRetiros++;
        }

    }

    public float calcularInteresMensual() {
        float interesMensual = this.tasaAnual / 12;
        return interesMensual * this.saldo;
    }

    public void extractoMensual() { //Por constructor
        if (this.saldo > 0) {
            //Actualiza el saldo
            this.saldo = (this.saldo - this.comisionMensual) + calcularInteresMensual();
        }
    }

    public String imprimir() {
        return "Saldo: " + this.saldo + ", número de consignaciones: " + this.numeroDeConsignaciones +
                ", número de retiros: " + this.numeroDeRetiros + ", tasa anual: " + this.tasaAnual +
                ", comisión mensual: " + this.comisionMensual;
    }
}
