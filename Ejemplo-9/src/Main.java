import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Numero de objetos de tipo persona: " + Persona.getNumInstancias());
        List<Persona> listaPersonas = new LinkedList<>();
        listaPersonas.add( new Persona("luis", "gomez", "lopez"));
        listaPersonas.add( new Persona("jose", "robles", "prieto"));
        listaPersonas.add( new Persona("mario","solis","luna"));
        System.out.println("Numero de objetos de tipo persona: " + Persona.getNumInstancias());
    }
}
