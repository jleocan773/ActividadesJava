public class Enum {
        public static void main(String[]args){
        enum diasem {
            LUNES,
            MARTES,
            MIERCOLES,
            JUEVES,
            VIERNES,
            SABADO,
            DOMINGO
        }
        diasem dia = diasem.LUNES;
        {
        switch(dia) {
            case LUNES: System.out.println("Lunes");
            break;
            case MARTES: System.out.println("Martes");
            break;
            case MIERCOLES: System.out.println("Miércoles");
            break;
            case JUEVES: System.out.println("Jueves");
            break;
            case VIERNES: System.out.println("Viernes");
            break;
            case SABADO: case DOMINGO: System.out.println("Fin de Semana");
            break;
            default: System.out.println("Valor no válido");
            }
        }  
    }
}
