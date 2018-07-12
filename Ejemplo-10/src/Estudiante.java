public class Estudiante {
    private String nombre;
    private String apePat;
    private String apeMat;

    public Estudiante(String nombre, String apePat, String apeMat){
        this.apeMat = apeMat;
        this.apePat = apePat;
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApePat() {
        return apePat;
    }

    public String getApeMat() {
        return apeMat;
    }


}
