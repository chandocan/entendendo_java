
package EntendendoClasse_part2;

// aqui esta os atributos nesse caso só temos uma class de atributos
public class Livro {
    String nome;
    String descricao;
    String autor;
    String isbu;
    double preco;
    String datapublic;
    
    /*
    este é o codigo que vai definir um método para a classe
    */
    void dadosLivro() {
        System.out.println("Nome do livro"+nome);
        System.out.println("Preço:"+preco);
        System.out.println("Autor"+autor);
        System.out.println("Data de publicação:"+datapublic+"\n");
    }   
}
