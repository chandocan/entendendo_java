package Numero_Aleatorio_C_intervalo;

import java.util.Random;
public class Numero_Aleatorio_C_intervalo {
    public static void main(String[] orgs){
        /*
        para gera um intervalo entre esse número que vai ser gerado basta
        colocar um parametro dentro de nextInter() exemplo para gera um numero
        entre 0 ate 30 ficaria nextInt(31) nesse caso funciona como o range 
        em python ficando sempre menos -1 no final.
        */
    Random aleatorio = new Random();
    int valor = aleatorio.nextInt(31);
    System.out.println("o número gerado foi "+valor);
    }
    // para gera numeros float entre 0 ate 100 nextFloat() * 100
    
}
