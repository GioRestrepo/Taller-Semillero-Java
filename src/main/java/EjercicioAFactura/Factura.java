package ejercicioUno;

public class Factura extends ejercicioUno.Precio {
    private String emisor;
    private String cliente;

    public Factura(float valorDelProducto, float descuentoDelProducto,  String emisor, String cliente) {
        super(valorDelProducto, descuentoDelProducto);
        this.emisor = emisor;
        this.cliente = cliente;
    }

    public String imprimirFactura(){
        return "Factura: valor del producto: " + this.valorDelProducto + ", descuento del producto: "+
                this.descuentoDelProducto + ", emisor: " + this.emisor + ", cliente: " + this.cliente;
    }
}
