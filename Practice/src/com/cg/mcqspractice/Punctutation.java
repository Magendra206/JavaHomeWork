package com.cg.mcqspractice;

public class Punctutation {

	public int countPunctuation(String str)
	{
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='.' || str.charAt(i)=='?' || str.charAt(i)==',')
			{
				count = count + 1;
			}
		}
		return count;
		
	}
}
