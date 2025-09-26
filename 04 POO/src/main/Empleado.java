package main;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
   public Empleado(int id, String nombre, String puesto, double salario) {
       this.id = id;
       this.nombre = nombre;
       this.puesto = puesto;
       this.salario = salario;
       Empleado.totalEmpleados++;
   }
   
   public Empleado(String nombre, String puesto) {
       this(totalEmpleados+1, nombre, puesto, 1500.0);
   }

    @Override
    public String toString() {
        return "Empleado{" + "ID=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    public void actualizarSalario(int porcentaje) {
        this.salario += this.salario * (porcentaje/100);
        
    }
    
    public void actualizarSalario(double cantidad) {
        this.salario += cantidad;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
   
   public static int mostrarTotalEmpleados() {
       return Empleado.totalEmpleados;
   }
    
}
