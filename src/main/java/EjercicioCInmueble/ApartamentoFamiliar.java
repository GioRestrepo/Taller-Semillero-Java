package EjercicioCInmueble;

public class ApartamentoFamiliar extends Apartamento {

    public ApartamentoFamiliar(int identificadorInmobiliario, String direccion, int numeroDeHabitaciones,
                               int numeroDebanos, float valorAdministracion) {

        super(identificadorInmobiliario, direccion, numeroDeHabitaciones, numeroDebanos, valorAdministracion);
    }
    @Override
    public long valorDeCompra(int areaMetrosCuadrados){
        this.valorMetroCuadrado = 2000000;
        this.areaMetrosCuadrados = areaMetrosCuadrados;
        long valorCompra = this.valorMetroCuadrado*this.areaMetrosCuadrados;
        return valorCompra;

    }

    public String imprimir(){
        return "Identificador Inmobiliario: " + this.identificadorInmobiliario +
                ", Dirección: " + this.direccion + ", número de habitaciones: " +
                this.numeroDeHabitaciones + ", número de baños " + this.numeroDebanos;

    }
}
