public class Curso {
    private Periodo ciclo;
    private Materia clase;

    public Curso(Periodo ciclo,  Materia clase){
        this.ciclo = ciclo;
        this.clase = clase;

    }

    public Periodo getCiclo() {
        return ciclo;
    }

    //***************nombre ya no es String, ni tampoco es nombre es clase
    public Materia getNombre() {
        return clase;
    }
}
