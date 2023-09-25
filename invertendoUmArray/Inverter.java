package invertendoUmArray;

import java.util.Arrays;
/*
 * nesse exemplo aqui ele temos a crianção de dois Arrays um com nome tem é outro
 * num onde num já é um Array preenchido com numeros de 1 ate 5 tem recebe os numeros
 * é é inverte os numeros com o for do metodo é depois os numeros que estão em temp
 * são colocados dentro de num
 * 
 * */

public class Inverter {

	  // Método utilitário para reverter elementos de um array
    public static void reverse(int[] nums)
    {
        int[] temp = new int[nums.length];
 
        for (int i = 0; i < nums.length; i++) {
            temp[nums.length - 1 - i] = nums[i];
        }
 
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		
		for(int i = 0; i < nums.length ;i++) {
        	System.out.println(nums[i]);
        }
        reverse(nums);
        System.out.println(Arrays.toString(nums));
        
        
	}// fim de main

}// fim de principal

