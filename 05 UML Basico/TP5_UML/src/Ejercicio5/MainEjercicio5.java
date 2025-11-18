package Ejercicio5;

public class MainEjercicio5 {
    public static void main(String[] args) {

        PlacaMadre pm = new PlacaMadre("ASUS X570", "AMD X570");

        Computadora pc = new Computadora("Lenovo", "SN-8823311", pm);

        Propietario p = new Propietario("Lisandro Alarcon", "47.396.843");

        pc.setPropietario(p);

        System.out.println("--- Propietario ---");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("DNI: " + p.getDni());

        System.out.println("\n--- Computadora ---");
        System.out.println("Marca: " + pc.getMarca());
        System.out.println("Numero de serie: " + pc.getNumeroSerie());

        System.out.println("\n--- Placa Madre ---");
        System.out.println("Modelo: " + pc.getPlacaMadre().getModelo());
        System.out.println("Chipset: " + pc.getPlacaMadre().getChipset());

        System.out.println("\nRelacion bidireccional correcta: " + (p.getComputadora() == pc));
    }
}
