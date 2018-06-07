// public indica que la clase puede ser usada desde caulquier lugar
//class indicaque es una clase y se acompaña del nombre de la clase
public class Compara3 {
    //mayor inter y menor son atributos privados y solo
    //pueden modificarse dentro de la clase Compara 3
    private int mayor;
    private int inter;
    private int menor;
    //Compara3 es el constructor, un constructo se llama igual
    //que la clase y no regresa nada ni siquiera void.
    //Si una clase no tiene escrito un constructor al ejecutar
    //el codgigo se le agrega uno por dafault que no recive parametros.
    //Si la clase tiene un constructor escrito no se le agrega el
    // constructor por default. Cuando se crea un objeto lo primero que
    // se manda a llamar es el constructor, El constructor solo se ejecuata
    // 1 vez y es al momento de crear el objeto
    public Compara3(int a, int b, int c){
        if(a>b && b>c){
            mayor=a;
            inter=b;
            menor=c;
        }else if(a>c && c>b){
            mayor=a;
            inter=c;
            menor=b;
        }else if(b>a && a>c){
            mayor=b;
            inter=a;
            menor=c;
        }else if(b>c && c>a){
            mayor=b;
            inter=c;
            menor=a;
        }else if(c>a && a>b){
            mayor=c;
            inter=a;
            menor=b;
        }else if(c>b && b>a){
            mayor=c;
            inter=b;
            menor=a;
        }
    }
    //metodo getMayor regresa el numero mayor como un entero
    public int getMayor(){
        return mayor;
    }
    //metodo getIntermedio regresa el numero de enmedio como un entero
    public int getIntermedio(){
        return inter;
    }
    //metodo getMenor regresa el numero menor como un entero
    public int getMenor(){
        return menor;
    }
}
