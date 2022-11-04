public class Pruebas {
    //Quitar los múltiplos de 5 entre 5 a 25
    public static void main(String[]args){
        for (int i = 5;  i <= 25; i++) {
            if ( i % 5 != 0) //Si el resto del valor de "i" entre 5 NO ES IGUAL a 0
                continue; //Se omite
            System.out.println(i); //Se pinta el valor de "i"
        }
    }
}
