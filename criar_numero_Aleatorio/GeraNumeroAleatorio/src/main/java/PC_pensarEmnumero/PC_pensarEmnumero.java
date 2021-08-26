/*
Escreva um prgrama que faça o computador "pensar" em número inteiro entre 0 e 5
e peça para o usuário tentar descobrir  qual foi o número escolhido pelo computador.
 */
package PC_pensarEmnumero;

import java.util.Random;
import java.util.Scanner;
public class PC_pensarEmnumero {
    public static void main(String[]orgs){
    int nPc, n ;
    Random pcPensou = new Random();
    //n gerando um numero entre 0 ate 5
    nPc = pcPensou.nextInt(5);
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite um número entre 0 ate 5 :");
    n = entrada.nextInt();
    entrada.close();
    System.out.println("número do PC "+nPc);
    if (n == nPc) {System.out.println("parabéns você acertou ! ");} else {
    System.out.println("Tente outra vez");}
    
    
    }
    
}
