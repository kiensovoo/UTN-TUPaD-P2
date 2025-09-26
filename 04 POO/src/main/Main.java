package main;


public class Main {


    public static void main(String[] args) {
        Empleado emp1 = new Empleado(10, "Gabriel Persi", "Jefe", 5000);
        Empleado emp2 = new Empleado("Lisandro Alarcon", "Gerente");
        
        System.out.println(emp1);
        System.out.println(emp2);
        
        emp1.actualizarSalario(10);
        emp2.actualizarSalario(500.0);
        
        System.out.println("Salarios después del aumento:");
        System.out.println(emp1);
        System.out.println(emp2);
        
        System.out.println("Total de empleados creados: "+Empleado.mostrarTotalEmpleados());
    }
    
    
    
}
