package Ejercicio10;

public class MainEjercicio10 {
    public static void main(String[] args) {

        ClaveSeguridad clave = new ClaveSeguridad("A1B2C3", "2025-02-10");
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 95000.50, clave);
        Titular titular = new Titular("Lisandro Alarcon", "47396843");

        cuenta.setTitular(titular);

        System.out.println("--- Cuenta Bancaria ---");
        System.out.println("CBU: " + cuenta.getCbu());
        System.out.println("Saldo: " + cuenta.getSaldo());

        System.out.println("\n--- Clave de Seguridad ---");
        System.out.println("Codigo: " + cuenta.getClave().getCodigo());
        System.out.println("Ultima modificacion: " + cuenta.getClave().getUltimaModificacion());

        System.out.println("\n--- Titular ---");
        System.out.println("Nombre: " + titular.getNombre());
        System.out.println("DNI: " + titular.getDni());
    }
}
