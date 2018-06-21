public class Persona {
    private String nombre;
    private String apePat;
    private String apeMat;

    public Persona(String nombre,String apePat, String apeMat){
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
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
