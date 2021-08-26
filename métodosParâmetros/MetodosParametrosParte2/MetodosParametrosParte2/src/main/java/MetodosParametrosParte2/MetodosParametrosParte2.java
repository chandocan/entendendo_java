/*
aqui estamos utilizando dois métodos mandaBoasvindas2 e enviaMensagem2
que onde mandaBoasVindas recebeu dois parâmetros onde tem a class main é 
a classe principal foi criada uma segunda classe para fazer os metodos isto o funcionamento dos
métodos 
*/
package MetodosParametrosParte2;

import java.util.Scanner;
public class MetodosParametrosParte2 {
        public static void main(String[] orgs) {
    String nomeAluno;
    int idadeAluno ;
    Scanner entrada = new Scanner(System.in );
    
    MandaMensagem2 hello = new MandaMensagem2();
    
    System.out.println("entre com o seu nome:");
    nomeAluno = entrada.nextLine();
    
    System.out.println("Entre com a idade:");
    idadeAluno = entrada.nextInt();
    // o método recebeu dois parâmetros nomeAluno e idadeAluno
    hello.mandaBoasVindas2(nomeAluno, idadeAluno);
    entrada.close();
    hello.enviaMensagem2();
    
    }
}

    
    



