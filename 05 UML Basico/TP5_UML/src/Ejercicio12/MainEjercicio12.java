package Ejercicio12;

public class MainEjercicio12 {
    public static void main(String[] args) {

        Contribuyente contribuyente = new Contribuyente("Lisandro Alarcon", "20-47396843-7");
        Impuesto impuesto = new Impuesto(18000.75, contribuyente);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
}
