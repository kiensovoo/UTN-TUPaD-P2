package Ejercicio1;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private final Foto foto;                // composición
    private Titular titular;                // asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null) {
            if (titular.getPasaporte() != this) {
                titular.setPasaporte(this);
            }
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }
}
