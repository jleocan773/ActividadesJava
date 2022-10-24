public class Circunferencia {
    // La fórmula para calcular la Circunceferencia = 2 * PI * radio
    // La fórmula para calcular el Area = PI * Radio^2
    // Sin usar la clase Math final static Double PI = 3.1416;
    public static void main(String[]args){
    // Para calcular la circunferencia
        Double radio = 4d;
        //Sin usar la clase Math -> Double circunferencia = 2 * PI * radio;
        Double circunferencia = Math.PI * 2 * radio;
        System.out.println( "La circunferencia es de " + circunferencia + " cm");
    // Para calcular el area
        /* Sin usar la clase Math -> Double expo = Math.pow(radio, 2);
        Double area = PI * expo; */
        Double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área es de " + area + " cm");
    }
}
