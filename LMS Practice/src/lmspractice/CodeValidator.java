package lmspractice;

import java.util.Scanner;


public class CodeValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// CODE START
		int q = sc.nextInt();
		if(q==1) {
			String n = sc.next();
			int u = (validateHexCode(n));
			if(u==1)
				System.out.println("Valid code");
			else
				System.out.println("Invalid code");
		}
		else if(q==2) {
			String j = sc.next();
			//System.out.println(j.length());
			int y = (validateDecimalCode(j));
			if(y==1)
				System.out.println("Valid code");
			else
				System.out.println("Invalid code");

		}
		else
			System.out.println("Invalid choice");
	}
	public static int validateDecimalCode(String r) {
		int k  = 0,c = 0;
		String s2 = r.substring(4, r.length()-1);
		char[] chars = s2.toCharArray();
		//System.out.println("lenth2: " + s2.length());6
		if(r.length()<=16 && r.charAt(0)=='r' && r.charAt(1)=='g' && r.charAt(2)=='b' && r.charAt(3)=='(' && r.charAt(r.length()-1)==')' && r.charAt(r.length()-2)!=')'&& Character.isDigit(r.charAt(4)) )
		{	
			// Convert char array to String in Java
			for(int i=0;i<s2.length();i++) {
				chars[i]= s2.charAt(i);
				char a = s2.charAt(i);
				if(a ==',') {
					int m = i;
					String string = s2.substring(k,m);
					k = m + 1 ;
					//System.out.println(string);
					int result = Integer.parseInt(string);	
					if(result >= 0 && result <= 255)
					{

						c++;
					}
				}
			}
			String string1 = s2.substring(k,s2.length());
			//System.out.println(string1);
			int result = Integer.parseInt(string1);	
			if(result >= 0 && result <= 255)
			{
				c++;
			}
		}
		//System.out.println(c);
		if(c==3)
			return 1;
		else
			return -1;
	}
	public static int validateHexCode(String s){
		int c= 0;
		// System.out.println(s.length());
		if(s.length()== 7 && s.charAt(0) == '#') {

			for(int i = 1;i<s.length();i++) {
				if((s.charAt(i)>='A' && s.charAt(i)<='F')|| Character.isDigit(s.charAt(i))) {
					c = 1;
				}
				break;
			}
		}
		if(c==1)
			return 1;
		else
			return -1;

	}

}
