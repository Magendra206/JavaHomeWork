package stringpractice;

public class StringsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is a string";
		char[] words = {'b','a','n','g','l','o','r','e'};
		String city = new String(words);
		
		System.out.println(city);
		System.out.println(str.charAt(0));
		System.out.println(str.startsWith("t"));
		System.out.println(str.endsWith("g"));
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));
		
		
		String str1 = new String("this is whole new city");//mutable strings
		String[] words1 = str1.split(" ");
		for(String w:words1)
		{
			System.out.println(w);
		}
		
		String[] word2 = str.split(" ");//immutable strings
		for(String w1:word2)
		{
			System.out.println(w1);
		}

	}

}
