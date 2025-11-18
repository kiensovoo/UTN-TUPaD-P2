package Ejercicio7;

public class MainEjercicio7 {
    public static void main(String[] args) {

        Motor m = new Motor("Nafta 1.6", "MS-551233");
        Vehiculo v = new Vehiculo("AB123CD", "Fiesta");

        v.setMotor(m);

        Conductor c = new Conductor("Lisandro Alarcon", "LZ-8831");
        c.setVehiculo(v);

        System.out.println("--- Conductor ---");
        System.out.println("Nombre: " + c.getNombre());
        System.out.println("Licencia: " + c.getLicencia());

        System.out.println("\n--- Vehiculo ---");
        System.out.println("Patente: " + v.getPatente());
        System.out.println("Modelo: " + v.getModelo());

        System.out.println("\n--- Motor ---");
        System.out.println("Tipo: " + v.getMotor().getTipo());
        System.out.println("Numero de serie: " + v.getMotor().getNumeroSerie());

        System.out.println("\nRelacion bidireccional correcta: " + (v.getConductor() == c));
    }
}
