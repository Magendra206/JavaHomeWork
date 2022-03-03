package arraypractice;

import java.util.Scanner;

public class RemovingIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n;    
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();    
        
        Integer arr[]=new Integer[n];    
        System.out.println("Enter the elements into the array :");
        for(int i=0;i<n;i++)     
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to remove ");
        int element = sc.nextInt();
    
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] == element)   
      {
       
        for(int j = i; j < arr.length - 1; j++)
        {
            arr[j] = arr[j+1];
        }
        break;
      }
    }
      
       System.out.println("Elements After Delete: " );
       for(int i = 0; i < arr.length-1; i++)
       {
             System.out.print(arr[i]+ " ");
       }  

	}

}
