package EjercicioCInmueble;

public class CasaConjuntoCerrado extends Casa {
   private boolean tienePiscina;
   private boolean tieneCampoDeportivo;
   private float valorAdministración;

   public CasaConjuntoCerrado(int identificadorInmobiliario, String direccion,
                              int numeroDeHabitaciones, int numeroDebanos, int cantidadDePisos,
                              boolean tienePiscina, boolean tieneCampoDeportivo,
                              float valorAdministración) {
      super(identificadorInmobiliario, direccion, numeroDeHabitaciones, numeroDebanos, cantidadDePisos);
      this.tienePiscina = tienePiscina;
      this.tieneCampoDeportivo = tieneCampoDeportivo;
      this.valorAdministración = valorAdministración;
   }

   @Override
   public long valorDeCompra(int areaMetrosCuadrados){
      this.valorMetroCuadrado = 2500000;
      this.areaMetrosCuadrados = areaMetrosCuadrados;
      long valorCompra = this.valorMetroCuadrado*this.areaMetrosCuadrados;
      return valorCompra;

   }

   public String imprimir(){
      return "Identificador Inmobiliario: " + this.identificadorInmobiliario +
              ", Dirección: " + this.direccion + ", número de habitaciones: " +
              this.numeroDeHabitaciones + ", número de baños " + this.numeroDebanos +
              ", cantidad de pisos: " + this.cantidadDePisos + ", tiene piscina: " +
              this.tienePiscina + ", tiene campo deportivo: " + this.tieneCampoDeportivo +
              this.valorAdministración;

   }
}
