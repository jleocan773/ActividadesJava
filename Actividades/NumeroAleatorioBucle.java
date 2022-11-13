import java.util.Random;
public class NumeroAleatorioBucle {
    //Variable numero aleatorio entre 1 y 100, salga del bucle cuando el numero sea un numero concreto 25
    public static void main(String[]args){
        Random numalea = new Random(); //Se genera un objeto de la clase random 
        int num = numalea.nextInt(10001); //Se usa el método nextInt para generar el número aleatorio
        System.out.println(num); //Se muestra por pantalla el número generado
        while (num != 25){ //Si el número generado NO ES IGUAL a X
            num = numalea.nextInt(10001); //Se vuelve a generar un número aleatorio
            System.out.println(num); //Se muestran los números generados
        }
    }
}
