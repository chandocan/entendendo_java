
package EntendendoClasse;


public class EntendondoClasse {
    public static void main(String[]args){
        Livro livro = new Livro();
        livro.descricao = "Estudante de ADS";
        livro.autor = "Jose Alfredo";
        livro.isbu = "9872267878";
        livro.preco = 90.78;
        livro.nome = "Livro de Alfredo testes !";
        livro.datapublic = "09/8/2021";
        System.out.printf(" data de publicação = %s",livro.datapublic);
        System.out.printf(" \n nome do livro  = %s",livro.nome);
        System.out.printf("\n preço do livro R$ = %.2f",livro.preco);
        System.out.printf("\n descrição do autor =  %s",livro.descricao);
        System.out.printf("\n isbu = %S",livro.isbu);
        System.out.printf("\n Autor do livro = %s",livro.autor);
        }
    
}
