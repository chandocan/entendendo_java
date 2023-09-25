package invertendoComWhile;

import java.util.Arrays;

public class UsandoMetodoParaInverte {
	public static void reverse(int[] nums)
	{
	    int normal = 0;
	    int invertido = nums.length - 1;

	    while (normal < invertido) {
	        int temp = nums[normal];
	        nums[normal] = nums[invertido];
	        nums[invertido] = temp;
	        normal++;
	        invertido--;
	    }
	}

	public static void main(String[] args) {
		int num[] = {1,2,3,4,5};
		
		System.out.println("Sem o a inversão "+Arrays.toString(num));
		reverse(num);
		System.out.println("De forma invertida"+Arrays.toString(num));
	}

}
