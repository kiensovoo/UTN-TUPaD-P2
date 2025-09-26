package TP3;

public class Libro {
    
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }
    
    public static void main(String[] args) {
        Libro libro1 = new Libro("Indigno de ser humano", "Osamu Dazai", 1948);
        
        libro1.setAnioPublicacion(2030);
        libro1.setAnioPublicacion(1994);
        
        libro1.mostrarInfo();
    }
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public void setAnioPublicacion(int anio) {
        int anioActual = 2025;
        if (anio >= 1000 && anio <= anioActual) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("Año invalido. Debe estar entre 1000 y "+anioActual);
        }
    }
    
    public void mostrarInfo() {
        System.out.println(titulo + " "+ autor +" "+ anioPublicacion);
    }
}
