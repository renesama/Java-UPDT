public class Trabajador extends Persona {
    private String rfc;
    private String sueldo;
    public Trabajador(String nombre, String apePat, String apeMat) {
        super(nombre, apePat, apeMat);
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
}
