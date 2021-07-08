package aula05;

public class MeuAlgortimo {

     private static int valor = 0;

     public static void novoNumero() {

          valor = valor + 1;

     }

     public static int getNumero() {

          return gerarNumero(valor);

     }

     private static int gerarNumero(int n) {

          if (n < 2) {

                return n; }

          else {

                return 2 * n; }

     }

}