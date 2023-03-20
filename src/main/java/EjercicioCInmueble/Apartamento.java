package EjercicioCInmueble;

public class Apartamento extends Vivienda {
    protected float valorAdministracion;

    public Apartamento(int identificadorInmobiliario, String direccion, int numeroDeHabitaciones,
                       int numeroDebanos, float valorAdministracion) {
        super(identificadorInmobiliario, direccion, numeroDeHabitaciones, numeroDebanos);
        this.valorAdministracion = valorAdministracion;
    }
}
