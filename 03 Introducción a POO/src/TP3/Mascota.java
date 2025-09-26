package TP3;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Andrea";
        mascota1.especie = "Beagle";
        mascota1.edad = 7;
        
        mascota1.mostrarInfo();
        
        System.out.println("Andrea cumple años:");
        mascota1.cumplirAnios();
        
        mascota1.mostrarInfo();
        
    }
    
    void mostrarInfo() {
        System.out.println(nombre + " "+ especie + " "+ edad);
    }
    
    void cumplirAnios() {
        edad++;
    }
}


