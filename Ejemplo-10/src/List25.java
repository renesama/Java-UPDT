
import java.util.LinkedList;
import java.util.List;

public class List25 {
    private static List<Estudiante> ListaEstudiantes  = new LinkedList<>();
    private static int numInstancias;

    public static int getNumInstancias(){
        return  numInstancias;
    }

    public static void add(String nombre, String apePat, String apeMat){
        if (numInstancias < 25){
            ListaEstudiantes.add( new Estudiante(nombre, apePat, apeMat));
            numInstancias++;
        } else {
            System.out.println("NO sePermiten mas de 25 Estudiantes");
        }
    }

    public static void printList(){
        for(Estudiante est: ListaEstudiantes){
            System.out.println(est.getNombre());
            System.out.println(est.getApePat());
            System.out.println(est.getApeMat());
            System.out.println("----------------");
        }
    }

}
