package Ejercicio2;

public class MainEjercicio2 {
    public static void main(String[] args) {

        Bateria b = new Bateria("BX100", 4500);

        Celular cel = new Celular("352099001112223", "Samsung", "A05");
        cel.setBateria(b);

        Usuario u = new Usuario("Lisandro Alarcon", "47.396.843");

        cel.setUsuario(u);

        System.out.println("--- Usuario ---");
        System.out.println("Nombre: " + u.getNombre());
        System.out.println("DNI: " + u.getDni());

        System.out.println("\n--- Celular ---");
        System.out.println("IMEI: " + cel.getImei());
        System.out.println("Marca: " + cel.getMarca());
        System.out.println("Modelo: " + cel.getModelo());

        System.out.println("\n--- Bateria ---");
        System.out.println("Modelo: " + cel.getBateria().getModelo());
        System.out.println("Capacidad: " + cel.getBateria().getCapacidad());

        System.out.println("\nRelacion bidireccional correcta: " + (u.getCelular() == cel));
    }
}
