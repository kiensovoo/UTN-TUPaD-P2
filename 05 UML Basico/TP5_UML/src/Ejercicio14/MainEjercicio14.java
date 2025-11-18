package Ejercicio14;

public class MainEjercicio14 {
    public static void main(String[] args) {

        Proyecto proyecto = new Proyecto("Corto Animado", 12);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto);
    }
}
