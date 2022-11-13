public class DiasMes {
    public static void main(String[]args){
        enum Mes {
            ENERO,
            FEBRERO,
            MARZO,
            ABRIL,
            MAYO,
            JUNIO,
            JULIO,
            AGOSTO,
            SEPTIEMBRE,
            OCTUBRE,
            NOVIEMBRE,
            DICIEMBRE
        }
        Mes dias = Mes.MAYO;

        switch(dias) {
            case ENERO: case MARZO: case MAYO: case JULIO: case AGOSTO: case OCTUBRE: case DICIEMBRE:
            System.out.println(dias + " tiene 31 días");
            case ABRIL: case JUNIO: case SEPTIEMBRE: case NOVIEMBRE:
            System.out.println(dias + " tiene 30 días");
            case FEBRERO:
            System.out.println(dias + " tiene 28 o 29 días");
        }
    }
}
