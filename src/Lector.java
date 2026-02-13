import java.io.*;
import java.util.ArrayList;

public class Lector {

    public ArrayList<Alumno> leer(String archivo) throws Exception{
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))){
            return (ArrayList<Alumno>) ois.readObject();
        }
    }
}
