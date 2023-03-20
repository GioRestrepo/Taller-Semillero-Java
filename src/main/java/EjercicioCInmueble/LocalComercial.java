package EjercicioCInmueble;

public class LocalComercial extends Local {
    private String nombreCentroComercial;


    public LocalComercial(int identificadorInmobiliario, String direccion,
                          boolean localizacionExterna, String nombreCentroComercial) {
        super(identificadorInmobiliario, direccion, localizacionExterna);
        this.nombreCentroComercial = nombreCentroComercial;
    }

    public long valorDeCompra(int areaMetrosCuadrados) {
        this.valorMetroCuadrado = 3000000;
        this.areaMetrosCuadrados = areaMetrosCuadrados;
        long valorCompra = this.valorMetroCuadrado * this.areaMetrosCuadrados;
        return valorCompra;
    }

    public String imprimir() {
        return "Identificador Inmobiliario: " + this.identificadorInmobiliario +
                ", Dirección: " + this.direccion + ", Localización externa: " +
                this.localizacionExterna + ", nombre del centro comercial: " + this.nombreCentroComercial;
    }
}