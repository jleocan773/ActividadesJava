public class tablamult {
    public static void main(String[]args){
        int num; //Crea variable num, que será el número a multiplicar
        int mult; //Crea variable mult, que será el multiplicador
        for ( num = 1 ; num <= 10; num++){ //Se inicia num a 1 y mientras que sea menor o igual que 10 se hace lo siguiente, incrementando su valor en uno tras cada loop
            System.out.print("\nTabla del " + num + " -->"); //Pinta por pantalla que tabla va a pintar
                for (mult = 1; mult <= 10; mult++ ) { //Se inicia mult a 1 y mientras sea menor o igual que 10 se hace lo siguiente, incrementando su valor en uno tras cada loop
                    System.out.print(" " + num + " * " + mult + " = " + (num*mult) + "|"); //Muestra el valor de multiplicar num * mult
            }
        } 
    }
}