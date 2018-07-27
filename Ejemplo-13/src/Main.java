import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Crear objeto de tipo archivo de nombre myFile
        File myFile = new File("ejemplo.txt");
        // Crear un objeto de escritura usando el archivo myFile
        PrintWriter writer = new PrintWriter(myFile);
        // Agregar una linea de texto al archivo.
        writer.println("Este es un texto de ejemplo ^_^ ");
        // Cerrar el objeto de escritura.
        writer.close();
    }
}