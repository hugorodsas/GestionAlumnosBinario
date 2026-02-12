import java.util.List;

public class Main {
    public static void main(String[] args) {
        AlRepositorio repositorio = new AlRepositorio("alumnos.ser");

        List<Alumno> alumnos = repositorio.leerAlumnos();

        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos");
            return;
        }

        AlService service = new AlService(alumnos);

        service.mostrarNotas();
        service.mostrarOrdenadosporNota();
        service.mostrarAprobados();
        service.mostrarMejorAlumno();
    }
}
