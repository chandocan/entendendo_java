// a palavra public esta relacionada a um modificador de acesso do codigo
// vc pode acessar os métodos criados com ele de qualquer parte do programa
// diferente de privete que só é acessado dentro do método criado.
package MetodosParametros;

public class MandaMensagem {
    // abaixo temos dois métodos enviarMensagem e mandaBoasVindas
    // que mandam duas mensagens
    public void enviaMensagem() {
    System.out.print("Bem-vindo ao java amigo Guerreiro");
    }
    
    // dentro da função criada mandaBoasVindas ele deu um parametro do tipo
    // string com nome "boas" como se fosse uma variavel especifica. "boas" é o parâmetro que vai ser usado 
    // no print boas vai representa a variavel nomeAlunos que esta na classe principal poderia colocar o nome 
    // da variavel boa a palavra nome para ter mais sentido 
    
    public void mandaBoasVindas(String boas) {
    System.out.println("Bem-vindo ao Aprendizado do java,"+boas);
    }
    
}
