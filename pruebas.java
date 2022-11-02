public class Pruebas {
    public static void main(String[]args){
        int diasem = 1;
        if (diasem == 1)
            System.out.println("Lunes");
        else if (diasem == 2)
            System.out.println("Martes");
        else if (diasem == 3)
            System.out.println("Miércoles");
        else if (diasem == 4)
            System.out.println("Jueves");
        else if (diasem == 5)
            System.out.println("Viernes");
        else if (diasem == 6 || diasem == 7)
            System.out.println("Fin de Semana");
        else 
            System.out.println("Valor no válido, introduzca un número del 1 al 7.");
    }
}