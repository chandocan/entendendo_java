
package TabuadaEmJava;

import java.util.Scanner;
public class Tabuada {
    public static void main(String[]orgs) {
    int n = 0 ;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Diga a tabuada :");
    n = entrada.nextInt();
    entrada.close();
    /*
    "for" recebe "i" igual a zero enquanto "i" for menor que 11 encremeta
    mais 1 a "i" for (int i = 0 ; i <= 10; i++) ou usa i <= 10
    */
    for (int i = 0 ; i <= 10; i++) {
        // concatenol no print
        System.out.println(i+"X"+n+"="+i*n);
        }
    }
    
}
