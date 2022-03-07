package lmspractice;

import java.util.Scanner;

public class ArrayFeedback {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a = scan.nextInt();
		if(a<0)
		{
			System.out.println("Invalid Array size");
		}
		else
		{
			int[] metlife = new int[a];
			int[] hardfort = new int[a];
			int[] feedback = new int[10];
			System.out.println("Enter elements into array");
			for(int i=0;i<metlife.length;i++)
			{
				metlife[i] = scan.nextInt();
			}
			System.out.println("Enter elements into second array");
			for(int i=0;i<hardfort.length;i++)
			{
				hardfort[i] = scan.nextInt();
			}
			for(int i=0;i<metlife.length;i++)
			{
				feedback[i] = metlife[i];
			}
			for(int i=0;i<hardfort.length;i++)
			{
				
			}
			
			
			/*for(int i=0;i<metlife.length;i=i+2)
			{
				for(int j=0;j<hardfort.length;j=j+2)
				{
					if(metlife[i]==hardfort[j])
					{
						feedback[i] = metlife[i];
					}
					else
					{
						feedback[i] = metlife[i];
						feedback[i+2]=hardfort[j];
					}
				}
				
			}
			for(int i=1;i<metlife.length;i=i+2)
			{
				for(int j=1;j<hardfort.length;j=j+2)
				{
					if(metlife[i]>hardfort[j])
					{
						feedback[i] = metlife[i];
					}
					else
					{
						feedback[i] = hardfort[j];
					}
				}
			}*/
			
			
			for(int i=0;i<feedback.length;i++)
			{
				System.out.println(feedback[i]);
			}
		}
	}

}
