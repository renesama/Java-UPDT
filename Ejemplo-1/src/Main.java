public class Main {
    public static void main(String[] args) {
        int a=12;//18;//22;//82;
        int b=56;//6;//200;//79;
        int c=120;//40;//70;//11;
        Compara3 miCompara = new Compara3(a,b,c);
        System.out.println("El mayor es: " + miCompara.getMayor());
        System.out.println("El intermedio es: " + miCompara.getIntermedio());
        System.out.println("El menor es: " + miCompara.getMenor());
    }
}


