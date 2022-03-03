package arraypractice;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5,6,7,8,9 };
	    int t = a[4];
	    for(int i = 9; i>=5; i--)
	    {
	        a[i]=a[i-1];
	    }
	    a[5]=t;
	    for(int i = 5; i<=9; i++)
	    {
	        System.out.println(a[i]);
	    }

	}

}
