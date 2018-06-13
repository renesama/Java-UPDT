public class Curso {
    Periodo ciclo;
    String matricula;
    String nombre;
    Direccion dirEst;// direcion estudiante
    public Curso(Periodo ciclo, String matricula, String nombre, Direccion dirEst){
        this.ciclo = ciclo;
        this.matricula = matricula;
        this.nombre = nombre;
        this.dirEst = dirEst;
    }

    public Periodo getCiclo() {
        return ciclo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public Direccion getDirEst() {
        return dirEst;
    }
}
