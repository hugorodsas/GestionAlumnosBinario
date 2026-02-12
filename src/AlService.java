import java.util.Comparator;
import java.util.List;

public class AlService {
   private List<Alumno> alumnos;

    public AlService(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void mostrarNotas(){
        System.out.println("Nota de los alumnos");
        alumnos.forEach(a-> System.out.println(a.getNombre()+ " -> " + a.getNota()));
    }

    public void mostrarOrdenadosporNota(){
        System.out.println("Ordenado por Nota");

        alumnos.stream().sorted(Comparator.comparingDouble(Alumno::getNota)).forEach(System.out::println);
    }

    public void mostrarAprobados(){
        System.out.println("Aprobados");

        alumnos.stream().filter(a-> a.getNota()>5).forEach(System.out::println);
    }

    public void mostrarMejorAlumno(){
        System.out.println("Mejor alumno");

        alumnos.stream().max(Comparator.comparingDouble(Alumno::getNota)).ifPresent(a -> System.out.println(a.getNombre()+ " -> " + a.getNota()));
    }
}
