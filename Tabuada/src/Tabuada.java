import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        int n = 0;
        String valorLido = "";

        Scanner LerTeclado = new Scanner (System.in);



        System.out.println("Programa que exibe a tabuada de um número ");
        System.out.println("");
        System.out.println("Informe um número: ");
        valorLido = LerTeclado.next();
        n = Integer.parseInt(valorLido);
        System.out.println(n + " x 1 = " + ( n * 1));
        System.out.println(n + " x 2 = " + ( n * 2));
        System.out.println(n + " x 3 = " + ( n * 3));
        System.out.println(n + " x 4 = " + ( n * 4));
        System.out.println(n + " x 5 = " + ( n * 5));
        System.out.println(n + " x 6 = " + ( n * 6));
        System.out.println(n + " x 7 = " + ( n * 7));
        System.out.println(n + " x 8 = " + ( n * 8));
        System.out.println(n + " x 9 = " + ( n * 9));
        System.out.println(n + " x 10 = " + ( n * 10));



    }
}
