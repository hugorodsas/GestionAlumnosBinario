import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Escritor {
    public void guardar(ArrayList<Alumno> libros, String archivo) throws Exception{
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))){
            oos.writeObject(libros);
        }
    }
}
