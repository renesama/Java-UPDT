import java.util.LinkedList;
import java.util.List;

public class Estudiante {
    private String ap_materno;
    private String ap_paterno;
    private String nombre_alum;

    private String matricula;
    private Direccion dirEst;// direcion estudiante
    private List<Curso> cursos_tomados = new LinkedList<>();

    public Estudiante(String ap_paterno, String ap_materno, String nombre_alum, String matricula, Direccion dirEst){
        this.ap_materno = ap_materno;
        this.ap_paterno = ap_paterno;
        this.nombre_alum = nombre_alum;
        this.matricula = matricula;
        this.dirEst = dirEst;

    }

    public void setCurso(Curso cursos_tomados){
        this.cursos_tomados.add(cursos_tomados);
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public String getNombre_alum() {
        return nombre_alum;
    }

    public String getMatricula() {
        return matricula;
    }

    public Direccion getDirEst() {
        return dirEst;
    }

    public List<Curso> getCursos_tomados() {
        return cursos_tomados;
    }
}
