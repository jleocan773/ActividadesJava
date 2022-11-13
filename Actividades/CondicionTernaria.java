public class CondicionTernaria {
    public static void main(String[]args){
        int a =1;
        int b =1;
        int mayor;

        //Esto no funciona si son iguales, la condición tercaria solo sirve para mayor o menor
        
        if (a<=b) {
            mayor = a;
        }
        else {
            mayor = b;
        }
        mayor = (a >= b)? a : b;
        System.out.println(mayor);
        
}
}