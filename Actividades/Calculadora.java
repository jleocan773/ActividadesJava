public class Calculadora {
    Integer a, b, c;
    final static int CONS = Integer.MAX_VALUE;
    public static void main(String[]args){
        Integer a = 2;
        Integer b = 3;
        Integer c = 4;

        //Sumar a+b y luego multiplicarlo por c
        System.out.println((a + b) * c);
        //Potencia de a^b, luego hacer casing de double a Integer
        double potencia = Math.pow (a, b);
        Integer resultado = (int)potencia;
        System.out.println(resultado);
        //Mostrar el valor máximo de una variable int
        System.out.println(CONS);
        //Mostrar el mayor entre dos valores
        System.out.println( Math.max(CONS, c));

    }
}