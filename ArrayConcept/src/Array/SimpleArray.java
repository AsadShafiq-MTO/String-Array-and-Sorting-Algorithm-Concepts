package Array;

import java.util.Scanner;

public class SimpleArray {

	public static void main(String[]  args)
	{
		//int marks[]= {1,2,3,4,5,6,7,8,9,10,11};
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter array size..!!");		
		int length=sc.nextInt();
		int marks[]=new int[length];		
		try 
		{
			System.out.println("**********  Intput Of Array  *************");
			for(int i=0;i<length;i++)
			{		
				System.out.println("Enter value of "+i+" is..!!");	
				marks[i]=sc.nextInt();
			}
			System.out.println("**********  Output Of Array  *************");
			for(int i=0;i<length;i++)
			{			
				System.out.println("The value of "+i+" is..!! = "+ marks[i]);	
				
			}			
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{			
			System.out.println("<<<<<< Out of Range >>>>>>>"+ e);			
		}	
		
	}

	
}
