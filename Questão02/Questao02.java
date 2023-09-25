package Questão02;
import java.util.Scanner;
public class Questao02 {

		public static String seEquadrada(int l, int c) {
			if(l == c) {
				return "E uma matriz quadrada";
			}
			else {
				return "não é uma matriz quadrada";
			}
			
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Quantas linhas? :");
			int l = sc.nextInt();
			System.out.println("Quantas colunas?");
			int c = sc.nextInt();
			
			
			int matriz[][] = new int[l][c];
			int soma = 0;
		

			// Laço responsável por preencher a matriz com números quaisquer
			for (int linha = 0; linha < matriz.length; linha++) {
				for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
					// Gera um numero qualquer para a matriz
					System.out.println("Diga o número :");
					// preenchedo
					matriz[linha][coluna] = sc.nextInt();
					// somando
					soma += matriz[linha][coluna];
				}
			}
			
			
			System.out.println(soma);
			// usando a função
			System.out.println(seEquadrada(l, c));
			
			
		sc.close();
		} // fim de main
	}// fim de principal


