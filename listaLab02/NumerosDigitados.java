package listaLab02;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class NumerosDigitados {
	public static void reverse(int[] nums)
	{
	    int[] temp = new int[nums.length];

	    for (int i = 0; i < nums.length; i++) {
	        temp[nums.length - 1 - i] = nums[i];
	    }

	    // Imprime o array temporário para depuração
	   //System.out.println("Array temporário: " + Arrays.toString(temp));

	    for (int i = 0; i < nums.length; i++) {
	        nums[i] = temp[i];
	    }
	}
	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);
		int num [] = new int[10];
	    ArrayList <Integer> num2 = new ArrayList <>(); // para os pares
	    ArrayList <Integer> num3 = new ArrayList <>();// para os ímpares
	    
	    
	    int maior = 0;
	    int menor = 0;
	    
		// o zero conta como número no for
		for(int i = 0; i<=9; i ++) {
		System.out.println("Diga o número :");
		int n = sc.nextInt();
		num[i] = n;
		}// fim do for
		
	  
	    for(int k: num){
	    	if(k%2 == 0) {
	    		num2.add(k);
	    	}else {
	    		num3.add(k);
	    	}
	    	if(k > maior) {
	    		maior = k;
	    	}
	    	
	    	if(k < menor || k == 0) {
	    		menor = k;
	    	}
	    }// fim do for 2
	    
	    /*
	     * va vai pegar só os indices dos impares pares todo número que tiver o indice par
	     * tera que somalos
	     * 
	     * */
	    
	    int soma = 0;
	    //buscando só os indices impares
	    for(int b = 0; b < num.length; b++) {
	    	if(b%2 == 1) {
	    		soma += num[b];
	    	}
	    }// fim do for
	    
	    
	  
	    System.out.println("Array original: " + Arrays.toString(num));
	    // usando o método
	    reverse(num);
	  
	    System.out.println("Forma invertida :"+Arrays.toString(num));	    
	    System.out.println("Todos os pares"+num2);
	    System.out.println("Todos os impares"+num3);
		System.out.println("soma de todos os numeros com indices ímpares :"+soma);
		System.out.println("Maior "+maior);
		System.out.println("Menor"+menor);
		  
	    Arrays.sort(num);
	    System.out.println("Em ordem crescente:"+Arrays.toString(num));
		
	sc.close();
	}// fim de main

}// fim de principal

