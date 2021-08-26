/*
nessa parte aqui vai ser criado um metodo dentro da classe isto é 
vai ser Adicionar um Método à classe
*/
package EntendendoClasse_part2;


public class EntendendoClasse_parte2 {
    public static void main(String[]args){
        Livro livro = new Livro();
        livro.descricao = "Estudante de ADS";
        livro.autor = "Jose Alfredo";
        livro.isbu = "9872267878";
        livro.preco = 90.78;
        livro.nome = "Livro de Alfredo testes !";
        livro.datapublic = "09/8/2021";
        /*
        Abaixo estou invocando o método
        */
        livro.dadosLivro();
        }
}
