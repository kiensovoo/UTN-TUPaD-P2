package kata2;

public class MainFiguras {

    public static void main(String[] args) {

        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(5);
        figuras[1] = new Rectangulo(4, 6);
        figuras[2] = new Circulo(2);

        for (Figura f : figuras) {
            f.mostrarArea();
        }
    }
}
