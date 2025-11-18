package Ejercicio11;

public class MainEjercicio11 {
    public static void main(String[] args) {

        Artista a = new Artista("Chano", "Pop");
        Cancion c = new Cancion("Soda pop", a);

        Reproductor r = new Reproductor();
        r.reproducir(c);
    }
}
