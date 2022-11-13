public class Pruebas {
    //Enunciado: Imprimir pantalla tabla de multiplicar del 1 al 10
    public static void main(String[]args){
        int mult = 1;
        int num = 1;
        for (num = 1; num <= 10; num++){
            for (mult = 1; mult <=10; mult++) {
            System.out.println(num + " * " + mult + " = " + (num*mult));
            }
        }
    }
}

