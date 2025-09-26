package TP3;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = edadInicial;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("La gallina ID: " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    public void envejecer() {
        edad++;
        System.out.println("La gallina ID: " + idGallina + " envejecio. Ahora tiene " + edad + " años.");
    }

    public void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina + " | Edad: " + edad + "| Huevos puestos: " + huevosPuestos);
    }
    
    public static void main(String[] args) {
        Gallina g1 = new Gallina(1, 1);
        Gallina g2 = new Gallina(2, 2);

        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.envejecer();
        g2.ponerHuevo();

        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}

