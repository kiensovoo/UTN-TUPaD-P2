package Ejercicio1;

public class MainEjercicio1 {
    public static void main(String[] args) {

        Foto foto = new Foto("imagenPasaporte.png", "png");

        Pasaporte pasaporte = new Pasaporte(
                "AR-902314",
                "2024-06-10",
                foto
        );

        Titular titular = new Titular("Lisandro Alarcon", "47.396.843");

        pasaporte.setTitular(titular);

        System.out.println("----- Datos del Titular -----");
        System.out.println("Nombre: " + titular.getNombre());
        System.out.println("DNI: " + titular.getDni());

        System.out.println("\n----- Datos del Pasaporte -----");
        System.out.println("Número: " + pasaporte.getNumero());
        System.out.println("Fecha de emisión: " + pasaporte.getFechaEmision());

        System.out.println("\n----- Foto -----");
        System.out.println("Archivo: " + pasaporte.getFoto().getImagen());
        System.out.println("Formato: " + pasaporte.getFoto().getFormato());

        System.out.println("\nVerificación relación bidireccional:");
        System.out.println("El titular conoce su pasaporte: " + (titular.getPasaporte() == pasaporte));
        System.out.println("El pasaporte conoce a su titular: " + (pasaporte.getTitular() == titular));
    }
}
