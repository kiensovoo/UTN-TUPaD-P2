package interfaces;

public class MainInterfaces {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Lisandro");

        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Mouse", 5000));
        pedido.agregarProducto(new Producto("Teclado", 8000));
        pedido.agregarProducto(new Producto("Auriculares", 6000));

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        pedido.cambiarEstado("Procesando");

        // Pago con tarjeta
        TarjetaCredito tc = new TarjetaCredito();
        double totalConDescuento = tc.aplicarDescuento(pedido.calcularTotal());
        tc.procesarPago(totalConDescuento);

        // Pago con PayPal
        PayPal pp = new PayPal();
        pp.procesarPago(pedido.calcularTotal());
    }
}
