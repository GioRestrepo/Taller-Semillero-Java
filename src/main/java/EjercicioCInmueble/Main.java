package EjercicioCInmueble;

public class Main {
    public static void main(String[] args) {

        LocalComercial centroComercial = new LocalComercial(250, "CR17 # 14", true,
                "Las Palmas");
        Long valorCentroComercial = centroComercial.valorDeCompra(42);
        System.out.print("centro comercial: " + centroComercial.imprimir() + ", precio: " + valorCentroComercial +"\n");

        Oficina oficina = new Oficina(240, "AV54 # 12", true,
                false);
        Long valorOficina = oficina.valorDeCompra(42);
        System.out.print("Oficina: " + oficina.imprimir() + ", precio: " + valorOficina+"\n");

    }


}
