public class Compara3 {
    private int mayor;
    private int inter;
    private int menor;
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

    public int getMayor(){
        return mayor;
    }

    public int getIntermedio(){
        return inter;
    }

    public int getMenor(){
        return menor;
    }
}
