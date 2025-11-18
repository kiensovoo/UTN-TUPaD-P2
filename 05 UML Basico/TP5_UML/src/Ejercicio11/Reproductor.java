package Ejercicio11;

public class Reproductor {

    public void reproducir(Cancion cancion) {
        String nombre = cancion.getArtista().getNombre();
        String titulo = cancion.getTitulo();
        System.out.println("Reproduciendo: " + titulo + " - " + nombre);
    }
}
