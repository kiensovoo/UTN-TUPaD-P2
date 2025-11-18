package Ejercicio13;

public class GeneradorQR {

    public void generar(String valor, Persona persona) {
        CodigoQR qr = new CodigoQR(valor, persona);
        System.out.println("QR generado para " + persona.getNombre() + ": " + qr.getValor());
    }
}
