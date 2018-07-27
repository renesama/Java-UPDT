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
            System.out.println("bloque finally");
        }

        //Lectrura de  archivo
        String fileName = "ejemplo.txt"; // El nombre del archivo a leer
        String line = null; // este variable giarda una linea del archivo
        try {
            // El objeto FileReader lee en el texto del archivo el la codificacion por default
            FileReader fileReader = new FileReader(fileName);
            //Como no se sabe que tan grande es el archivo el FileReader se mete en un
            //el BufferedReader es como una pila que va cargado partes del archivo para
            //que esten disponibles para el FileReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
    }
}
