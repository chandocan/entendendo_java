package Numero_Aleatorio;

import java.util.Random;
public class Numero_Aleatorio {
    public static void main(String[] orgs){
    Random aleatorio = new Random();
    int valor = aleatorio.nextInt();
    System.out.println("Numero gerado "+valor);
    }
    
}
