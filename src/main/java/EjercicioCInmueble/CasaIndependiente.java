package EjercicioCInmueble;

public class CasaIndependiente extends Casa{
    public CasaIndependiente(int identificadorInmobiliario, String direccion, int numeroDeHabitaciones,
                             int numeroDebanos, int cantidadDePisos) {
        super(identificadorInmobiliario, direccion, numeroDeHabitaciones, numeroDebanos, cantidadDePisos);
    }
    @Override
    public long valorDeCompra(int areaMetrosCuadrados){
        this.valorMetroCuadrado = 3000000;
        this.areaMetrosCuadrados = areaMetrosCuadrados;
        long valorCompra = this.valorMetroCuadrado*this.areaMetrosCuadrados;
        return valorCompra;

    }

    public String imprimir(){
        return "Identificador Inmobiliario: " + this.identificadorInmobiliario +
                ", Dirección: " + this.direccion + ", número de habitaciones: " +
                this.numeroDeHabitaciones + ", número de baños " + this.numeroDebanos +
                ", cantidad de pisos: " + this.cantidadDePisos;

    }
}
