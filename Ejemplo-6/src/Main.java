public class Main {

    public static void main(String[] args) {
        Direccion direc1 = new Direccion("de la cruz","zacatecas","zac","mexico");
        Curso curso1 = new Curso(Periodo.PRIMAVERA,"asd1234","Dibujo",direc1);
        System.out.println(curso1.nombre);
        System.out.println(curso1.matricula);
        System.out.println(curso1.ciclo);
        System.out.println(curso1.dirEst.getCalle());
        System.out.println(curso1.dirEst.getCiudad());
        System.out.println(curso1.dirEst.getEstado());
        System.out.println(curso1.dirEst.getPais());
    }
}
