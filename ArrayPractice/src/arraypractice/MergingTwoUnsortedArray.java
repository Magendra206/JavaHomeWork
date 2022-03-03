package arraypractice;

import java.util.Arrays;

public class MergingTwoUnsortedArray {

	public static void main(String[] args) {
		int[] firstArray = {6,7,8,9,10,11};  
		int[] secondArray = {12,13,14,15,16};  
		int length = firstArray.length + secondArray.length; 
		int[] mergedArray = new int[length];    
		int pos = 0;  
		for (int element : firstArray) 
		{  
		mergedArray[pos] = element;  
		pos++;               
		}  
		for (int element : secondArray)  
		{  
		mergedArray[pos] = element;  
		pos++;  
		}  
		System.out.println(Arrays.toString(mergedArray));  
		
	}

}
