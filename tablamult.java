public class tablamult {
    public static void main(String[]args){
        int num = 1;
        int mult = 1;
        for ( num = 1 ; num <= 10; num++){
            System.out.print("\nTabla del " + num + " -->");
            for (mult = 1; mult <= 10; mult++ ) {
            System.out.print(" " + num + " * " + mult + " = " + (num*mult) + "|");
            }
        } 
    }
}