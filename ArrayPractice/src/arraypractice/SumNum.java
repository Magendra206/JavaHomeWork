package arraypractice;

import java.util.Scanner;

public class SumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m, sumEven = 0, sumOdd = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        m = s.nextInt();
        int[] a = new int[m];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < m; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < m; i++)
        {
            if(a[i] % 2 == 0)
            {
            	sumEven = sumEven + a[i];
            }
            else
            {
            	sumOdd = sumOdd + a[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+sumEven);
        System.out.println("Sum of Odd Numbers:"+sumOdd);

	}

}
