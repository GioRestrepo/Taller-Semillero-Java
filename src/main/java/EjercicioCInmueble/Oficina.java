package EjercicioCInmueble;

public class Oficina extends Local {
    private boolean esDelGobierno;

    public Oficina(int identificadorInmobiliario, String direccion,
                   boolean localizacionExterna, boolean esDelGobierno) {
        super(identificadorInmobiliario, direccion, localizacionExterna);
        this.esDelGobierno = esDelGobierno;
    }

    @Override
    public long valorDeCompra(int areaMetrosCuadrados){
        this.valorMetroCuadrado = 3500000;
        this.areaMetrosCuadrados = areaMetrosCuadrados;
        long valorCompra = this.valorMetroCuadrado*this.areaMetrosCuadrados;
        return valorCompra;

    }

    public String imprimir(){
          return "Identificador Inmobiliario: " + this.identificadorInmobiliario +
                ", Dirección: " + this.direccion + ", Localización externa: " +
                this.localizacionExterna + ", Pertenece al gobierno: " + this.esDelGobierno;

    }
}
