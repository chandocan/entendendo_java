// aqui é ponto de entrada do programa
package MetodosParametros;

import java.util.Scanner;
public class MetodosParametros {
    public static void main(String[] orgs) {
    String nomeAluno;
    Scanner entrada = new Scanner(System.in );
    
    // é invocada a class com MandaMensage()
    // em MandaMensagem foi criada um objeto do tipo "hello" sentido de boas vindas
    // o objeto hello vai invocar o método mandaBoasVindas
    MandaMensagem hello  = new MandaMensagem();
    
    System.out.println("Entre com seu nome:");
    nomeAluno = entrada.nextLine();
    
    hello.mandaBoasVindas(nomeAluno);
    entrada.close();
    hello.enviaMensagem();
    }
}
