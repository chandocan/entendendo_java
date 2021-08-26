
package entradaDadosComNome;

import java.util.Scanner;
import java.text.DecimalFormat;
public class entradaDadosComNome { 
    public static void main(String[]orgs){
        String nome,SimouNao;
        int idade;
        double Altura;
        boolean estadoDeEspirito;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Diga sim ou não:");
        SimouNao = entrada.nextLine();
        System.out.println("Digite o nome:");
        nome = entrada.nextLine();
        System.out.println("Digite a idade:");
        idade = entrada.nextInt();
        System.out.println("Digite a Altura:");
        Altura = entrada.nextFloat();
        System.out.println("Diga [true] ou [false] estado de espirito:");
        estadoDeEspirito = entrada.nextBoolean();
        entrada.close();
        
        if(estadoDeEspirito == true ) {System.out.println("Felicidade é uma estado de Espirito");} else {
        System.out.println("Nunca desista de seus sonhos");}
        // sempre bom usar equals para comparação
        if (SimouNao.equals("s")) {System.out.println("Sempre Apreedemos novas coisas");} else {
        System.out.println("Você disse não as dificudades");}
       
        // O "n" é como colocasse em uma nova linha
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.printf("O nome é %s%n",nome);
        System.out.printf("A idade é %d%n",idade);
        System.out.printf("Altura é %.2f%n",Altura); // melhor forma de format
        System.out.println("Altura formatada "+df.format(Altura));
       } 
    }

    