public class Main {

    public static void main(String[] args) {
        Direccion direc1 = new Direccion("Bugambilias #310","Zacatecas","Zac.","México");
        Direccion direc2 = new Direccion("Colinas #28","Zacatecas","Zac.","México");
        Direccion direc3 = new Direccion("Tres cruces #18","Tlaxiaco","Oaxaca","México");
        Direccion direc4 = new Direccion("Los metates #67","Jalisco","Guadalajara","México");
        Direccion direc5 = new Direccion("Jeranios #310","Villa Corzo","Chiapas.","México");

        Curso curso1 = new Curso(Periodo.PRIMAVERA,Materia.DIBUJO);
        Curso curso2 = new Curso(Periodo.INVIERNO,Materia.MATEMATICAS);
        Curso curso3 = new Curso(Periodo.OTOÑO,Materia.COMPUTACION);
        Curso curso4 = new Curso(Periodo.INVIERNO,Materia.ESPAÑOL);
        Curso curso5 = new Curso(Periodo.OTOÑO,Materia.HISTORIA);

        Estudiante[] alumnos = new Estudiante[5];

        alumnos[0] = new Estudiante("Cruz", "Aparicio", "Esmeralda", "asd1234", direc1);
        alumnos[1] = new Estudiante("Villegas", "Prieto", "Carolina", "asd1235", direc2);
        alumnos[2] = new Estudiante("Franco", "MArtinez", "Blanca", "asd1236", direc3);
        alumnos[3] = new Estudiante("Jauregui", "Arambula", "Veronica", "asd1237", direc4);
        alumnos[4] = new Estudiante("Ramirez", "Guerrero", "Oscar", "asd1238", direc5);
        alumnos[0].setCurso(curso1);
        alumnos[0].setCurso(curso3);
        alumnos[1].setCurso(curso2);
        alumnos[1].setCurso(curso1);
        alumnos[2].setCurso(curso4);
        alumnos[2].setCurso(curso2);
        alumnos[3].setCurso(curso5);
        alumnos[3].setCurso(curso4);
        alumnos[3].setCurso(curso2);
        alumnos[4].setCurso(curso2);
        alumnos[4].setCurso(curso4);


        int cont = 1;
        for ( Estudiante var: alumnos) {
            System.out.println("ALUMNO " + cont + ":" + var.getAp_paterno() + " " + var.getAp_materno() + " "+ var.getNombre_alum());
            System.out.println("MATRICULA: " + var.getMatricula());
            System.out.println("DIRECCION: " + var.getDirEst().getCalle() + ", " + var.getDirEst().getCiudad()+ ", " + var.getDirEst().getEstado() +", "
                    + var.getDirEst().getPais());
            System.out.println("_______________________________");
            System.out.println("CICLO: \t\t MATERIA");
            System.out.println("-------------------------------");
            for(Curso var2: var.getCursos_tomados()){
                System.out.println(var2.getCiclo() + " \t\t " + var2.getNombre());
            }
            //System.out.println("CICLO-MATERIA: " + var.getCursos_tomados()..getCiclo() + " - " + var.cursos_tomados.getNombre());
            System.out.println("================================");
            cont++;
        }
    }
}
