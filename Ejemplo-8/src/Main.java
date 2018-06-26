import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Estudiante> listaEstudiantes = new LinkedList<>();
        List<Trabajador> listaTrabajadores = new LinkedList<>();
        List<Persona> listaPersonas = new LinkedList<>();

        listaEstudiantes.add( new Estudiante("luis", "gomez", "lopez"));
        listaEstudiantes.add( new Estudiante("jose", "robles", "prieto"));
        listaEstudiantes.add( new Estudiante("mario","solis","luna"));
        listaEstudiantes.get(0).setGrado("primero");
        listaEstudiantes.get(0).setGrupo("A");
        listaEstudiantes.get(0).setMatricula("lgm20181");
        listaEstudiantes.get(1).setGrado("segundo");
        listaEstudiantes.get(1).setGrupo("B");
        listaEstudiantes.get(1).setMatricula("jrp20182");
        listaEstudiantes.get(2).setGrado("tercero");
        listaEstudiantes.get(2).setGrupo("C");
        listaEstudiantes.get(2).setMatricula("lgm20183");
        listaTrabajadores.add(new Trabajador("alfredo", "santana","mercado"));
        listaTrabajadores.add(new Trabajador("David","huerta","rodriguez"));
        listaTrabajadores.add(new Trabajador("santiago", "acosta", "vera"));
        listaTrabajadores.get(0).setRfc("asdf123");
        listaTrabajadores.get(0).setSueldo("16000");
        listaTrabajadores.get(1).setRfc("qwer133");
        listaTrabajadores.get(1).setSueldo("17000");
        listaTrabajadores.get(2).setRfc("zxcv143");
        listaTrabajadores.get(2).setSueldo("18000");

        for (Estudiante est:listaEstudiantes) {
            listaPersonas.add(est);
        }
        for (Trabajador trab:listaTrabajadores){
            listaPersonas.add(trab);
        }
        System.out.println();


    }
}
