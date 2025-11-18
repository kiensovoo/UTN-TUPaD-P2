package Ejercicio12;

public class Calculadora {

    public void calcular(Impuesto impuesto) {
        double monto = impuesto.getMonto();
        Contribuyente c = impuesto.getContribuyente();

        System.out.println(
            "Calculando impuesto $" + monto +
            " para " + c.getNombre() +
            " (CUIL " + c.getCuil() + ")"
        );
    }
}
