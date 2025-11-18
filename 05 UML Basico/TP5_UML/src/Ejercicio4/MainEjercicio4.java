package Ejercicio4;

public class MainEjercicio4 {
    public static void main(String[] args) {

        Banco b = new Banco("Banco Rio", "30-55123321-9");

        TarjetaDeCredito t = new TarjetaDeCredito("4512-9988-5521-3344", "12/28");
        t.setBanco(b);

        Cliente c = new Cliente("Lisandro Alarcón", "47.396.843");
        c.setTarjeta(t);

        System.out.println("--- Cliente ---");
        System.out.println("Nombre: " + c.getNombre());
        System.out.println("DNI: " + c.getDni());

        System.out.println("\n--- Tarjeta ---");
        System.out.println("Numero: " + t.getNumero());
        System.out.println("Vencimiento: " + t.getFechaVencimiento());

        System.out.println("\n--- Banco ---");
        System.out.println("Nombre: " + t.getBanco().getNombre());
        System.out.println("CUIT: " + t.getBanco().getCuit());

        System.out.println("\nRelacion bidireccional correcta: " + (c.getTarjeta() == t));
    }
}
