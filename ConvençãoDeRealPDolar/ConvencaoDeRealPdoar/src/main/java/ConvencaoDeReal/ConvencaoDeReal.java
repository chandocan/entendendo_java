/*
converta de reais para dolar divide se fosse de dolar para reis 
mutiplicaria
*/
package ConvencaoDeReal;
import java.util.Scanner;
public class ConvencaoDeReal {
    public static void main(String[]orgs){
    double Real,cota,convencao;
    Scanner dinheiro = new Scanner(System.in);
    System.out.println("Digite um valor em Reais:");
    Real = dinheiro.nextDouble();
    System.out.println("Cotação em Dolar:");
    cota = dinheiro.nextDouble();
    convencao = Real/cota;
    dinheiro.close();
    System.out.printf("Valor em dolar %.2f ",convencao);
    }
    
}
