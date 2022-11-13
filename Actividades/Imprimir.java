public class Imprimir {
    /**
     * Hola buenas esto es una prueba de Javadoc me 
     * Voy a escribir una linea extra para ver si funciona
     * @param args
     */
    public static void main(String[]args){
        String saludo = "Hola";
        String nombre = "Jonathan";
        int edad = 666;
        int primernum = 2;
        int segunnum = 3;
        float res = 0.67f;
        System.out.printf("%s \n", saludo);
        System.out.printf("Hola %s \n", nombre);
        System.out.printf("Nombre: %s \nEdad: %d \n",nombre, edad);
        System.out.println("\"Primero \\ Segundo \\ Tercero\"");
        System.out.printf("%s %s, tienes %d años \n%d \\ %d = \" %.2f \" ",saludo, nombre, edad, primernum, segunnum, res);
    }
}
