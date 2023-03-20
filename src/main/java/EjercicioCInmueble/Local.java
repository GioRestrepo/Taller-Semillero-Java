package EjercicioCInmueble;

public class Local extends Inmueble {
    protected boolean localizacionExterna;


    public Local(int identificadorInmobiliario, String direccion,
                 boolean localizacionExterna) {
        super(identificadorInmobiliario, direccion);
        this.localizacionExterna = localizacionExterna;
    }

}

