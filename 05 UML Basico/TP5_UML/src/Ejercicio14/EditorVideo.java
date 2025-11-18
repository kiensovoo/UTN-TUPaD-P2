package Ejercicio14;

public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);

        System.out.println(
            "Render exportado en " + render.getFormato() +
            " para el proyecto " + render.getProyecto().getNombre() +
            " (" + render.getProyecto().getDuracionMin() + " min)"
        );
    }
}
