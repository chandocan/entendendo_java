package Questao01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumerDigitados2 {

	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);
		int num [] = new int[10];
	    
	    
	    int maior = 0;
	    int menor = 0;
	    
		// o zero conta como número no for
		for(int x = 0; x<=9; x ++) {
		System.out.println("Diga o número :");
		int n = sc.nextInt();
		num[x] = n;
		}// fim do for
		
		System.out.println("Array original: " + Arrays.toString(num));
	    // for invertido
	    
	    int[] temp = new int[num.length]; // é o mesmo que auxiliar

	    for (int i = 0; i < num.length; i++) {
	        temp[num.length - 1 - i] = num[i];
	    }

	    // Imprime o array temporário para depuração
	   //System.out.println("Array temporário: " + Arrays.toString(temp));

	    for (int i = 0; i < num.length; i++) { // nem precisava desse fro aqui pastava num = aux fora do primeiro loop
	        num[i] = temp[i];
	    }
	  		
		/*int[] aux = new int[num.length];
		for (int x = num.length - 1; x >= 0; x--) {
			
			// aux[num.length - 1 -x] usado para acessa as posições
			// do array aux (esse menos um "-1" é para subtrai 1 do tamanho do array 
			// toda essa subtração aqui "num.length - 1 - x" é pra da um indice desejado 
			//Assim, aux[num.length - 1 - x] é usado para acessar as posições do array aux na ordem invertida, 
			//começando da última posição e avançando para as posições anteriores conforme percorremos 
			//o array num de trás para frente.
			
		    aux[num.length - 1 - x] = num[x];
		}
		// num recebeu fora do loop aux
		num = aux;*/

		
	 
	  			
	  	System.out.println("Forma invertida :"+Arrays.toString(num));	    
	    int[] num2 = new int[num.length]; // para os pares
	    int[] num3 = new int[num.length];// para os ímpares

	    Arrays.sort(num);
	    // teste
	    for(int k = 0 ; k < num.length ; k++) {
	    	// para os pares 
	    	if(num[k] %2 == 0) {
	    		num2[k] = num[k]; 
	    	}
	    	// impares
	    	else {
	    		num3[k] = num[k];
	    	}
	    }
	    
	    /*
	     * va vai pegar só os indices dos impares de todos os número que tiver o indice par
	     * tera que somalos
	     * 
	     * */
	    
	    int soma = 0;
	    //buscando só os indices pares
	    for(int b = 0; b < num.length; b++) {
	    	if(b%2 == 1) {
	    		soma += num[b];
	    	}
	    }// fim do for
	    
	    
	  
	    
	
	 
	    Arrays.sort(num2);
	    System.out.println("Todos os pares"+Arrays.toString(num2));
	    System.out.println("Todos os impares"+Arrays.toString(num3));
		System.out.println("soma de todos os numeros com indices ímpares :"+soma);
		System.out.println("Maior :"+maior);
		System.out.println("Menor:"+menor);
		  
	   
	    System.out.println("Em ordem crescente:"+Arrays.toString(num));
		
	sc.close();
	}// fim de main

}// fim de principal


