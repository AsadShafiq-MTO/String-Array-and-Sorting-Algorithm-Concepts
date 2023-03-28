package ReverseArray;

public class ArrayReverse {

	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,50,60};	
		
	//	int[] a = {10,20,30,40,50,60};
		int length=a.length;		
		int b[]=new int[length];
		for(int i=0;i<length;i++)
		{
			b[i]=a[i];
			System.out.println(" value of i "+i+" is "+b[i]);
		}
		System.out.println("********************************");
		System.out.println("******  Reverse Array   ********");
		System.out.println("********************************");
		for(int i=0;i<length;i++)
		{
			b[i]=a[length-1-i];
			System.out.println(" value of i "+(5-i)+" is "+b[i]);
		}
		
		
		System.out.println("************************* String Array Reverse *************************");
		
		String str="hello";
		String reverse="";
		int length1=str.length();
		for(int i=0;i<length1;i++)
		{
			reverse=str.charAt(i)+reverse;
		}
		System.out.println(reverse);
		
		
		
	}
}
