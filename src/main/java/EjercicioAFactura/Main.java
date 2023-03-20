package ejercicioUno;

public class Main {
    public static void main(String[] args) {

        ejercicioUno.Factura factura = new ejercicioUno.Factura(35000,1000, "Fabrica Campo Alto",
                "Juan Perez");

        String imprimirFactura = factura.imprimirFactura();
        System.out.println(imprimirFactura);
    }
}
