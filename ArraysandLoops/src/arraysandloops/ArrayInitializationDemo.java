package arraysandloops;

import java.util.Arrays;

public class ArrayInitializationDemo {

	public static void main(String[] args) {
		char[] word = {'A', 'B', 'S', 'T','H'};
		for(int i=0;i<word.length;i++)
		{
			System.out.println(word[i]);
		}
		System.out.println("after sotiong th array");
		Arrays.sort(word);
		for(int i=0;i<word.length;i++)
		{
			System.out.println(word[i]);
		}
		System.out.println("sort in reverse order");
		for(int i=word.length-1;i>=0;i--)
		{
			System.out.println(word[i]);
		}
		

	}

}
