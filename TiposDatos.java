public class TiposDatos {
  String nombre, apellido;
  int number;
  long horas;
  float decimal;
  double pi;
  boolean paroimpar;
    
    /** 
     * @param String[]args
     */
    public static void main(String[]args) {
        String nombre = "Jonathan";
        String apellido = "León";
        int number = 800;
        long horas = 507345345345345L;
        float decimal = 3.14F;
        double pi = 3.14159265359D;
        boolean paroimpar = true;
        char sexo = 'H';

        System.out.println ( "Hola " + nombre + " " + apellido + ", me gusta el número " + number + " :D");
        number = 900;
        System.out.println ("Jaja es mentira, en realidad me gusta el " + number);
        System.out.println ("Número largo " + horas);
        System.out.println ("Aquí va un decimal " + decimal);
        System.out.println ("Decimales de pi " + pi);
        System.out.println ("¿Es par? " + paroimpar);
        System.out.println(sexo);
        
    } 
}