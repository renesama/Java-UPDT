import java.io.*;

public class Main implements Serializable {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Se crean algunos animales de una clase serializable
        Animal stego = new Animal("Stegosaurus", 12.5f, true);
        Animal croc = new Animal("Crocodile", 3.2f, false);
        Animal mozzie = new Animal("Mosquito", 0.2f, false);
        //Semuestran los datos de animales en la consola
        stego.print();
        croc.print();
        mozzie.print();
        //Se indica el archivo en que se van a guardar los objetos
        File file = new File("animals.dat");
        //Se crea el objeto FileOutputStream para escrivir el archivo
        FileOutputStream fileOutput = new FileOutputStream(file);
        //Se crea el objeto object output stream para escribir lo objetos serealizados
        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
        //Se escriven  los objetos
        objectOutput.writeObject(stego);
        objectOutput.writeObject(croc);
        objectOutput.writeObject(mozzie);
        //Y se cierran los objetos FileOutputStream y  ObjectOutputStream
        objectOutput.close();
        fileOutput.close();

        //lectura de los objetos serilizados
        // creamos un arreglo para guardar los objetos serilizados
        Animal[] animals = new Animal[3];
        FileInputStream fileInput = new FileInputStream(file);
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);
        // Leemos los objetos del archivo
        try {
            animals[0] = (Animal) objectInput.readObject();
            animals[1] = (Animal) objectInput.readObject();
            animals[2] = (Animal) objectInput.readObject();
            objectInput.close();
            fileInput.close();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Objects read from file: ");
        for(int i = 0; i < 3; i++) {
            animals[i].print();
        }
    }
}
