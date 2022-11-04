import java.util.Random;

public class NumeroAleatorioParImpar {
    public static void main(String[]args){
        Random aleatorio = new Random(); //Usamos la clase random para generar un objeto que pertenece a dicha clase.
        int numero = aleatorio.nextInt(100); //Usamos el método "nextInt" para guardar en la variable "numero" el valor aleatorio
        if (numero % 2 == 0) //Si el valor de este número generado aleatoriamente al ser divido da un resto igual a 0,
            System.out.println(numero + "es un número par"); //Muestra por pantalla el siguiente texto confirmando que es par
        else //En cualquier otro caso,
            System.out.println(numero + "es un número impar"); //Muestra por pantalla un texto diciendo que es impar
    }
}


