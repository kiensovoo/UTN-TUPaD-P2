public class MainUniversidad {

    public static void main(String[] args) {

        Universidad u = new Universidad("UNLaM");

        Profesor pr1 = new Profesor("P01", "Juan Díaz", "Matemática");
        Profesor pr2 = new Profesor("P02", "Ana Pérez", "Programación");
        Profesor pr3 = new Profesor("P03", "Mario López", "Física");

        u.agregarProfesor(pr1);
        u.agregarProfesor(pr2);
        u.agregarProfesor(pr3);

        Curso c1 = new Curso("C1", "Álgebra");
        Curso c2 = new Curso("C2", "POO");
        Curso c3 = new Curso("C3", "Redes");
        Curso c4 = new Curso("C4", "Cálculo");
        Curso c5 = new Curso("C5", "Electrónica");

        u.agregarCurso(c1);
        u.agregarCurso(c2);
        u.agregarCurso(c3);
        u.agregarCurso(c4);
        u.agregarCurso(c5);

        u.asignarProfesorACurso("C1", "P01");
        u.asignarProfesorACurso("C2", "P02");
        u.asignarProfesorACurso("C3", "P02");
        u.asignarProfesorACurso("C5", "P03");

        System.out.println("\n--- CURSOS ---");
        u.listarCursos();

        System.out.println("\n--- PROFESORES ---");
        u.listarProfesores();

        System.out.println("\n--- CAMBIAR PROFESOR DE C1 A P03 ---");
        u.asignarProfesorACurso("C1", "P03");
        u.listarCursos();

        System.out.println("\n--- ELIMINAR CURSO C3 ---");
        u.eliminarCurso("C3");
        u.listarCursos();

        System.out.println("\n--- ELIMINAR PROFESOR P02 ---");
        u.eliminarProfesor("P02");
        u.listarCursos();
    }
}
