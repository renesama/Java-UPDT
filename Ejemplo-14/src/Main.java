import java.io.*;

public class Main {
    public static void main(String[] args) {
        File myFile;
        PrintWriter writer;
        try { //intenta hacer lo de este bloque
            // Crear objeto de tipo archivo de nombre myFile
            myFile = new File("ejemplo.txt");
            // Crear un objeto de escritura usando el archivo myFile
            writer = new PrintWriter(myFile);
            // Agregar una linea de texto al archivo.
            writer.println("Este es un texto de ejemplo ^_^ ");
            writer.close();
        } catch (IOException e) { //si algo sale mal manda una excecion
            e.printStackTrace();
        } finally { //este bloque siempre se ejecuta
            System.out.print("bloque finally");
        }
    }
}
