public class Main {

    public static void main(String[] args) {
        System.out.println("imprime 10 numeros");
        for(int i=1;i<=100;i++){
            System.out.println(i);
        }
        System.out.println("\n");
        System.out.println("imprime triangulo de asteriscos");
        for(int i=0;i<=10;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
