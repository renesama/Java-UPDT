public class Trabajador {
    private String nombre;
    private String apePat;
    private String apeMat;
    public Trabajador(String nombre, String apePat, String apeMat){
        //en este metodo hay dos variable nombre una que
        //existe mientras se ejecuta el constructor y otra
        // que extiste el tiempo que exista el objeto trabajador
        //para diferenciarlos utilizamos la palabra reservada this
        //this.nombre existe durante  el tiempode vida del objeto
        //y nombre que se recive como parametro existe solo dentro
        //del cosntructor, lo mismo para apePat y apeMat.
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
