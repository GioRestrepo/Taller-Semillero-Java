package EjercicioCInmueble;

public class CasaRural extends Casa {
    private float distanciaALaCabeceraMunicipal;
    private float altitudSobreNivelDelMar;

    public CasaRural(int identificadorInmobiliario, String direccion, int numeroDeHabitaciones,
                     int numeroDebanos, int cantidadDePisos, float distanciaALaCabeceraMunicipal,
                     float altitudSobreNivelDelMar) {
        super(identificadorInmobiliario, direccion, numeroDeHabitaciones, numeroDebanos, cantidadDePisos);
        this.distanciaALaCabeceraMunicipal = distanciaALaCabeceraMunicipal;
        this.altitudSobreNivelDelMar = altitudSobreNivelDelMar;
    }

    @Override
    public long valorDeCompra(int areaMetrosCuadrados){
        this.valorMetroCuadrado = 1500000;
        this.areaMetrosCuadrados = areaMetrosCuadrados;
        long valorCompra = this.valorMetroCuadrado*this.areaMetrosCuadrados;
        return valorCompra;

    }

    public String imprimir(){
        return "Identificador Inmobiliario: " + this.identificadorInmobiliario +
                ", Dirección: " + this.direccion + ", número de habitaciones: " +
                this.numeroDeHabitaciones + ", número de baños " + this.numeroDebanos +
                ", cantidad de pisos: " + this.cantidadDePisos + ", Distancia a la cabecera municipal"
                + this.distanciaALaCabeceraMunicipal + ", altitud sobre el nivel del mar: " +
                this.altitudSobreNivelDelMar;

    }
}
