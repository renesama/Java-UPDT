public class Direccion {
    private String calle;
    private String ciudad;
    private String estado;
    private String pais;

    public Direccion(String calle, String ciudad, String estado, String pais){
        this.calle=calle;
        this.ciudad=ciudad;
        this.estado=estado;
        this.pais=pais;
    }

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }
}
