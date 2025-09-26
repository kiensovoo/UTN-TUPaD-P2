package TP3;


public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public static void main(String[] args) {
        Estudiante alarcon = new Estudiante();
        alarcon.nombre = "Lisandro";
        alarcon.apellido = "Alarcon";
        alarcon.curso = "B";
        alarcon.calificacion = 6.0;
        
        alarcon.mostrarInfo();
        
        alarcon.subirCalificacion(3.0);
        
        System.out.println("Subi la calificacion 3 puntos:");
        alarcon.mostrarInfo();
        
        alarcon.bajarCalificacion(2.0);
        
        System.out.println("Baje la calificacion 2 puntos:");
        alarcon.mostrarInfo();
    }
    
    void mostrarInfo() {
        System.out.println(nombre +" "+ apellido+" "+ curso+ " "+ calificacion);
    }
    
    void subirCalificacion(double puntos) {
        calificacion += puntos;
    }
    
    void bajarCalificacion(double puntos) {
        calificacion -= puntos;
    }
    
    
    
}
