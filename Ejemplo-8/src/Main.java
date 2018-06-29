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
        listaTrabajadores.add(new Trabajador("david","huerta","rodriguez"));
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


        Estudiante[] arrayAlumnos = new Estudiante[3];
        Trabajador[] arrayTrabajadores = new Trabajador[3];
        Persona[] arrayPersona = new Persona[6];

        arrayAlumnos[0]= new Estudiante("luis", "gomez", "lopez");
        arrayAlumnos[1]= new Estudiante("jose", "robles", "prieto");
        arrayAlumnos[2]= new Estudiante("mario","solis","luna");
        arrayAlumnos[0].setGrado("primero");
        arrayAlumnos[0].setGrupo("A");
        arrayAlumnos[0].setMatricula("lgm20181");
        arrayAlumnos[1].setGrado("segundo");
        arrayAlumnos[1].setGrupo("B");
        arrayAlumnos[0].setMatricula("jrp20182");
        arrayAlumnos[2].setGrado("tercero");
        arrayAlumnos[2].setGrupo("C");
        arrayAlumnos[0].setMatricula("lgm20183");

        arrayTrabajadores[0] = new Trabajador("alfredo", "santana","mercado");
        arrayTrabajadores[1] = new Trabajador("david","huerta","rodriguez");
        arrayTrabajadores[2] = new Trabajador("santiago", "acosta", "vera");
        arrayTrabajadores[0].setSueldo("16000");
        arrayTrabajadores[1].setSueldo("17000");
        arrayTrabajadores[2].setSueldo("18000");
        arrayTrabajadores[0].setRfc("asdf123");
        arrayTrabajadores[1].setRfc("qwer133");
        arrayTrabajadores[2].setRfc("zxcv143");

        for(int i=0; i<3;i++){
            arrayPersona[i] = arrayAlumnos[i];
        }
        System.out.println();
        for(int i=0; i<3;i++){
            arrayPersona[i+3] = arrayTrabajadores[i];
        }

        System.out.println();
    }
}
