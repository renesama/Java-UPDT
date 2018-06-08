public class Main {

    public static void main(String[] args) {
        //dato primitivo byte, puede
        //tener un valor de -128 a 127
        //es cuatro veces mas pequeño que
        //un entero, tiene un tamaño de 8 bits
        byte biteVar = 120;
        //dato primitivo short, puede
        //tener un valor de -32,768 a 32,767
        //es dos veces mas pequeño que un entero
        //tiene un tamaño de 16 bits
        short shortVar = 129;
        //dato primitivo int, puede
        //tener un valor de -2,147,483,648 a -2,147,483,647
        //se utiliza por default en tipos de datos entros
        // al menos que se tengan problemas de memoria
        //tiene un tamaño de 32 bits
        int intVar = 460;
        //dato primitivo long, puede tener un valor
        //de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        //se utiliza cuando se representa numeros mas grandes de
        //los que se pueden representar por un int
        //tiene un tamaño de 64 bits
        long longVar = 743L;
        //dato primitivo float, pude tener un valor (positivo o negativo) de
        //1.40129846432481707e-45 a 3.40282346638528860e+38
        //representa valores con punto flotante no se deve de
        //utilizar para valores precisos, por ejemplo dinero
        //tiene un tamaño de 32 bits en base a IEEE 754
        float floatVar = 54.7f;
        //dato primitivo double, pude tener un valor (positivo o negativo) de
        //4.94065645841246544e-324d a 1.79769313486231570e+308d
        //representa valores con punto flotante no se deve de
        //utilizar para valores precisos, por ejemplo dinero
        //tiene un tamaño de 64 bits en base a IEEE 754
        double doubleVar = 69.98;
        //dato primitivo byte, solo puede
        //tener dos valoes posibles: "true" o "false"
        //tiene un tamaño de 1 bit
        boolean booleanVar = true;
        //dato primitivo char es un unico caracter Unicode
        //de 16 bits, puede tener un valor de '\u0000' a '\uffff'
        //se utiliza para representar caracteres
        char charVar = 'E';
        //el objeto StringVar es una instancia de la clase String
        //no se necesita importar ningun paquete devido a que java
        //importa por default todas las clase del paqquete java.lang
        String StringVar= "Valores";
        String a = String.valueOf(intVar);// convierte intVar a string y lo guarda en a;
        String b = String.valueOf(charVar);// convierte charVar a string y lo guarda en b;
        String c = String.valueOf(longVar);// convierte longVar a string y lo guarda en c;
        String d = String.valueOf(floatVar);// convierte floatVar a string y lo guarda en d;
        String e = String.valueOf(doubleVar);// convierte doubleVar a string y lo guarda en e;
        String f = String.valueOf(booleanVar);// convierte booleanVar a string y lo guarda en f;
        String g = Byte.toString(biteVar); //convierte biteVar a string y lo guarda en g;
        String h = Short.toString(shortVar); //convierte shorVar a string y lo guarda en h;
        //El convertir los tipos de datos primitivos a string nos permite mostarlos como texto en
        // una aplcacion de escritorio o web al igual que la clase String, las clases
        //Byte, Short, Integer, Long, Float, Double, Boolean, Character, cuentan con distintos metodos
        //que le facilitan el trabajo al programador
    }
}
