package com.cg.mcqspractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.regex.Pattern;

public class TestPrograms {
	public static void main(String args[]) {
		 try
		  {
		   int a[]= {1, 2, 3, 4};
		   for (int i = 1; i <= 4; i++)
		   {
		    System.out.println ("a[" + i + "]=" + a[i] + "n");
		   }
		  }
		  
		  catch (Exception e)
		  {
		   System.out.println ("error = " + e);
		  }
		  
		  catch (ArrayIndexOutOfBoundsException e)
		  {
		   System.out.println ("ArrayIndexOutOfBoundsException");
		  }




		
		}
	}
	


