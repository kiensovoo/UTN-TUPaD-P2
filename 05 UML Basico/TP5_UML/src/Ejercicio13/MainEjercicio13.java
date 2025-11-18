package Ejercicio13;

public class MainEjercicio13 {
    public static void main(String[] args) {

        Persona persona = new Persona("Lisandro Alarcon", "lisandroalarcon68@gmail.com");

        GeneradorQR generador = new GeneradorQR();
        generador.generar("ID-QR-93527", persona);
    }
}
