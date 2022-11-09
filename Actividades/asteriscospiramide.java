public class asteriscospiramide  {
        public static void main(String[] args) {
          int filas = 4;
          int i;
          int ast = 0;

          for (i = 1; i <= filas; i++, ast = 0) {
            for (int blanco = 1; blanco <= filas - i; blanco++) {
              System.out.print("  ");
            }
            while (ast != 2 * i - 1) {
              System.out.print("* ");
              ast++;
            }
            System.out.println();
            }
        }
}

