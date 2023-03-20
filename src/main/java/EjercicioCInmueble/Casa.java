package EjercicioCInmueble;

public class Casa extends Vivienda{
    protected int cantidadDePisos;

    public Casa(int identificadorInmobiliario, String direccion, int numeroDeHabitaciones,
                int numeroDebanos, int cantidadDePisos) {
        super(identificadorInmobiliario, direccion, numeroDeHabitaciones, numeroDebanos);
        this.cantidadDePisos = cantidadDePisos;
    }
}
