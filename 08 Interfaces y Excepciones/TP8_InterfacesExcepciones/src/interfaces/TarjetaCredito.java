package interfaces;

public class TarjetaCredito implements Pago, PagoConDescuento {

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con Tarjeta de Crédito procesado por $" + monto);
    }
}
