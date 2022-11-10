public class multiplos3y5 {
    //Dado un número n, escribir la suma de todos los mútiplos de 3 y 5 hasta n
  public static void main (String[]args){
    int n = 4; 
    int multiplo; 
    int multiplicador;
    int suma3 = 0;
    int suma5 = 0;

    for (multiplo = 1,  multiplicador = 3; multiplo <= n; multiplo++){
        //System.out.println(multiplo3 * multiplicador3);
        suma3 = suma3 + (multiplo * multiplicador);
        //System.out.println(suma3);
    }
    
    for (multiplo = 1, multiplicador =5; multiplo <= n; multiplo++){
        //System.out.println(multiplo3 * multiplicador3);
        suma5 = suma5 + (multiplo * multiplicador);
        //System.out.println(suma5);
  }
  System.out.println(suma3 + suma5);
}
}  
