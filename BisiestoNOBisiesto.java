public class BisiestoNOBisiesto {
    //Dado una variable año, que especifique si es bisiesto o no
    public static void main(String[]args){
        int year = 2008;
    if (year % 4 == 0 || year % 400 == 0)
        System.out.println("Anyo bisiesto"); 
    else if (year % 100 != 0) 
        System.out.println("Anyo no bisiesto"); 
    }
}
