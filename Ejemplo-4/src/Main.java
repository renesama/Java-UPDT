public class Main {

    public static void main(String[] args) {
        System.out.println("Uso de la palabra reservada this\npara diferenciar entre un parametro y un\natributo con el mismo nombre \n");
        Trabajador[] workers = new Trabajador[5];
        workers[0] = new Trabajador("Juan","Rulfo", "Viscaino");
        workers[1] = new Trabajador("Benito","Perez", "Galdoz");
        workers[2] = new Trabajador("Mariano","Azuela", "Gonzalez");
        workers[3] = new Trabajador("Manuel","Soria", "Paino");
        workers[4] = new Trabajador("Mario","Vargas", "Llosa");
        for (Trabajador var: workers) {
            System.out.println(var.getApePat() +" "+ var.getApeMat() +" "+ var.getNombre());

        }
    }
}
