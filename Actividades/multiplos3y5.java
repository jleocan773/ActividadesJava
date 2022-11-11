public class multiplos3y5 {
    //Dado un número n, escribir la suma de todos los mútiplos de 3 y 5 hasta n
  public static void main (String[]args){
    int n = 5; 
    int i; 
    int multiplicador;
    int suma3 = 0;
    int suma5 = 0;

    for (i = 1,  multiplicador = 3; i <= n; i++){
        suma3 = suma3 + (i * multiplicador);
    }
    
    for (i = 1, multiplicador =5; i <= n; i++){
        suma5 = suma5 + (i * multiplicador);
  }
  System.out.println(suma3 + suma5);
}
}  
