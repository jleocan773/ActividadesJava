public class Conversion {
    public static void main(String[]args) {
        int numero1;
        double numero2;
        numero1 = 25;
        numero2 = numero1; 
        System.out.println("-------------------------------------------");
        System.out.println("Valor del primer número: " + numero1);
        System.out.println("Valor del segundo número convertido: " + numero2);
        System.out.println("-------------------------------------------");
        numero2 = 50.125050;
        numero1 = (int)numero2;
        System.out.println("Valor del segundo número: " + numero2);
        System.out.println("Valor del primer número convertido: " + numero1);
        System.out.println("-------------------------------------------");
    }
}
