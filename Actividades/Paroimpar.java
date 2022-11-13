import java.util.Random;

public class paroimpar {

    
    /** 
     * "aleatorio" es un objeto que creamos a partir de clase que tendrá sus metodos, pretendemos usar el método nextInt para generar un número aleatorio que almacenaremos en otra variable
     * "randomNumber" es la variable en la que se guardará el número aleatorio generado a partir del método nextInt del objeto mencionado anteriormente
     * "numDivisores" es la variable en la que se almacenará el número de divisores que tiene el valor de la variable randomNumber, si fuese mayor que 1, significaría que el valor de 
     * de la variable numDivisores contiene un número que no es primo
     * 
     * Haremos un caso para si el valor de la variable randomNumber es 1, que mostrará por pantalla que el número no es primo, ya que el primer número primo es 2, esto además nos 
     * permite poner que el máximo número de divisores posibles para que un número sea primo sea 1 en lugar de 2, acortando así al menos 1 iteración del bucle.
     */

    public static void main(String[] args) {
    Random aleatorio = new Random(); //Usamos la clase random para generar un objeto para usar sus métodos
    int randomNumber = aleatorio.nextInt(100); //Con el método nextInt generamos el número aleatorio y lo almacenamos en la variable randomNumber
    int numDivisores = 0; //Para saber si un número es primo pretendo contar el número de divisores que tiene, si tiene más de 1 (no vamos a contar el 1 como posible opción,
                          //porque pretendo darle una opción propia) es decir, sí mismo, NO ES PRIMO
  
      // Como el primer número primo que existe es 2, si el valor de la variable es 1 o menor que 1 será número NO primo.
      if (randomNumber <= 1) {
        System.out.println("El numero " + randomNumber +  " no es primo");
        return; //En este caso acabaría las comprobaciones porque ya sabemos que el número no es primo, por lo que se termina el programa
      }
  
      // Hacemos un bucle con loop, mientras que i sea menor o igual que el valor de la variable randomNumber entre 2 (porque el último divisor de un número es su mitad)
      //suma 1 a la variable numdivisores
      for (int i = 1; i <= randomNumber / 2; i++) {
        if (randomNumber % i == 0) {
            numDivisores++;
        }
      }
      if (numDivisores > 1) { // Si el valor de numDivisores es mayor que 1, automáticamente eso número no es primo,
          System.out.println("El numero " + randomNumber +  " no es primo");
      }
      else { //De lo contrario, si el valor de numDivisores, es decir, es igual que 1, el número ES primo
        System.out.println("El numero " + randomNumber +  " SI es primo");
      }
    }
  }