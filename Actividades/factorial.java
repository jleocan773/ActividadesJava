public class factorial {
    public static void main (String[]args){
        int factorial = 1; //Creamos y definimos a 1 la variable "factorial"
        for (int n = 7; n > 0; n--) { //Creamos y deinifimos la variable "n" que será el número del que queremos
                                      //calcular el factorial, el bucle se ejecutará hasta que n sea mayor que cero
                                      //reduciendo su valor en uno tras cada instancia del bucle.
            factorial = factorial * n; //Guardamos el valor de factorial el resultado de factorial * n
        }
        System.out.println(factorial); //Mostramos el valor de "factorial" que habrá sido el resultado de multiplicar
                                       // 7 * 7 + 7 * 6 + 7 * 5.............
    }
}
