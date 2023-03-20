package EjercicioCInmueble;

public class Inmueble {
    protected int identificadorInmobiliario;
    protected int areaMetrosCuadrados;
    protected String direccion;
    protected long valorMetroCuadrado;

    public Inmueble(int identificadorInmobiliario, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.direccion = direccion;
    }

    public long valorDeCompra(int areaMetrosCuadrados){
        this.areaMetrosCuadrados = areaMetrosCuadrados;
        long valorCompra = this.valorMetroCuadrado*this.areaMetrosCuadrados;
        return valorCompra;
    }

}
