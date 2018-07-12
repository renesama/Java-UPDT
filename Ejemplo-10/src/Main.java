
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Numero de objetos de tipo estudainte en la lista: " + List25.getNumInstancias());
        Scanner miLector = new Scanner(System.in);
        int i;
        for(i = 1; i <= 30; i++) {
            System.out.println("Persona #" + i);
            System.out.println("Introduce el nombre");
            String nomPer = miLector.nextLine();
            System.out.println("Ahora el Apellido Paterno");
            String apePat = miLector.nextLine();
            System.out.println("y el Apellido Materno");
            String apeMat = miLector.nextLine();
            System.out.println("---------------");
            List25.add(nomPer,apePat,apeMat);
        }

       List25.printList();
    }
}
