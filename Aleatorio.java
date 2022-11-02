import java.util.Random;

public class Aleatorio {
    public static void main(String[]args){
        Random aleatorio = new Random();
        int numero1 = aleatorio.nextInt(10);
        System.out.println(numero1);
        int numero2 = aleatorio.nextInt(10);
        System.out.println(numero2);
        float decimal1 = aleatorio.nextFloat(10);
        System.out.println(decimal1);
        float decimal2 = aleatorio.nextFloat(10);
        System.out.println(decimal2);
        boolean cierto1 = aleatorio.nextBoolean();
        System.out.println(cierto1);
        boolean cierto2 = aleatorio.nextBoolean();
        System.out.println(cierto2);
    }
}
