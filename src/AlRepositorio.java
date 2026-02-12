import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AlRepositorio {
    private String ruta;

    public AlRepositorio(String ruta) {
        this.ruta = ruta;
    }

    public List<Alumno> leerAlumnos(){
        List<Alumno> lista = new ArrayList<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))){
            lista = (List<Alumno>) ois.readObject();


        }catch (FileNotFoundException e){
            System.out.println("No se encontro el archivo");
        }catch (IOException e){
            System.out.println("Error de escrituta: " + e.getMessage());
        }catch (ClassNotFoundException e){
            System.out.println("Clase no encontrada");
        }
        return lista;
    }
}
