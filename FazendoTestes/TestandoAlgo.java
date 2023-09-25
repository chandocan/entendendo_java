package FazendoTestes;
import java.util.Arrays;


public class TestandoAlgo {
	
	/*public static void reverse(int[] nums)
	{
	    int[] temp = new int[nums.length];

	    for (int i = 0; i < nums.length; i++) {
	        temp[nums.length - 1 - i] = nums[i];
	    }

	    // Imprime o array temporário para depuração
	    System.out.println("Array temporário: " + Arrays.toString(temp));

	    for (int i = 0; i < nums.length; i++) {
	        nums[i] = temp[i];
	    }
	}*/

	//aux[nums.length -1 - i] =  nums[i];
	public static void main(String[] args) {
	    int[] nums = {1, 2, 3, 4, 5};

	    // Imprime o array original para depuração
	    System.out.println("Array original: " + Arrays.toString(nums));

	    //reverse(nums);
	    int[] aux = new int[nums.length];
	    
		for(int i = nums.length - 1; i >= 0; i-- ) {
			
			aux[nums.length -1 - i] =  nums[i];
		
			
			
		}
		System.out.println("vendo como esta a lista auxiliar "+Arrays.toString(aux));
		for(int x = 0; x < nums.length; x++) {
			nums[x] = aux[x];
			
		}

	    // Imprime o array invertido para depuração
	    System.out.println("Array invertido: " + Arrays.toString(nums));
	    
	}// fim de main
}// fim de principal


