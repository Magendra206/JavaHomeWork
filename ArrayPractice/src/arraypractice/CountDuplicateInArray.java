package arraypractice;

import java.util.Scanner;

public class CountDuplicateInArray {
	
	public int CountDuplicate(int[] arr)
	{
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count = count + 1;
				}
			}
		}
		return count;
		
		
	}

}
