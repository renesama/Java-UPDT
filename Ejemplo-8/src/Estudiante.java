public class Estudiante extends Persona {
    private String matricula;
    private String grado;
    private String grupo;

    public Estudiante(String nombre, String apePat, String apeMat) {
        super(nombre, apePat, apeMat);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
