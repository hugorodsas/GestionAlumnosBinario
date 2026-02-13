import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String  archivo = "alumnos.ser";
        Scanner sc = new Scanner (System.in);
        ArrayList<Alumno> lista = new ArrayList<>();

        String opcion;
        do{
            System.out.println("Ingrese el nombre del alumno");
            String nombre = sc.nextLine();

            System.out.println("Ingrese la nota del alumno");
            double nota = sc.nextDouble();
            sc.nextLine();

            lista.add(new Alumno(nombre,nota));

            System.out.println("Desea ingresar un nuevo alumno (s/n)");
            opcion = sc.nextLine();
        }while(opcion.equalsIgnoreCase("s"));

        Escritor escritor = new Escritor();
        Lector lector = new Lector();
        AlService service = new AlService(lista);

        try{
            escritor.guardar(lista, archivo);
            System.out.println("Alumnos guardados");

            ArrayList<Alumno> alumnos = lector.leer(archivo);

            service.mostrarNotas();
            service.mostrarOrdenadosporNota();
            service.mostrarAprobados();
            service.mostrarMejorAlumno();

            /*System.out.println("Alumnos leidos del archivo:");
            for (Alumno a : alumnos) {
                System.out.println(a);
            }*/
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
