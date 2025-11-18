package Ejercicio6;

public class MainEjercicio6 {
    public static void main(String[] args) {

        Consumidor c = new Consumidor("Lisandro Alarcon", "1567784432");

        Reserva r = new Reserva("2025-04-18", "21:30", c);

        Mesa m = new Mesa(7, 4);
        r.setMesa(m);

        System.out.println("--- Datos del consumidor ---");
        System.out.println("Nombre: " + c.getNombre());
        System.out.println("Telefono: " + c.getTelefono());

        System.out.println("\n--- Reserva ---");
        System.out.println("Fecha: " + r.getFecha());
        System.out.println("Hora: " + r.getHora());

        System.out.println("\n--- Mesa asignada ---");
        System.out.println("Numero: " + r.getMesa().getNumero());
        System.out.println("Capacidad: " + r.getMesa().getCapacidad());
    }
}
