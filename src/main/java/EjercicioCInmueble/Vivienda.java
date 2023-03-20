package EjercicioCInmueble;

public class Vivienda extends Inmueble{
    protected int numeroDeHabitaciones;
    protected int numeroDebanos;


    public Vivienda(int identificadorInmobiliario, String direccion,
                    int numeroDeHabitaciones, int numeroDebanos) {
        super(identificadorInmobiliario, direccion);
        this.numeroDeHabitaciones = numeroDeHabitaciones;
        this.numeroDebanos = numeroDebanos;
    }
}

