package TP3;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial <= MAX_COMBUSTIBLE) {
            this.combustible = combustibleInicial;
        } else {
            this.combustible = MAX_COMBUSTIBLE;
        }
    }

    public void despegar() {
        if (combustible >= 10) { 
            combustible -= 10;
            System.out.println("La nave " + nombre + " despegó.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia * 2;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("La nave avanzó " + distancia + " km. Combustible consumido: " + consumo);
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= MAX_COMBUSTIBLE) {
            combustible += cantidad;
            System.out.println("La nave recargó " + cantidad + " unidades de combustible.");
        } else {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("El tanque se llenó hasta el máximo: " + MAX_COMBUSTIBLE);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
    }

    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial("Explorer", 50);

        nave1.avanzar(30); 

        nave1.recargarCombustible(40);

        nave1.avanzar(20);

        nave1.mostrarEstado();
    }
}