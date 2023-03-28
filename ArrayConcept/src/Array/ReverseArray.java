package Array;

import java.util.Scanner;

@SuppressWarnings("resource")    
public class ReverseArray {

	public static void main(String[]  args)
	{				
		Scanner sc=new Scanner(System.in);		
		System.out.print("Enter the array size is..!! ");		
		int length=sc.nextInt();
		int marks[]=new int[length];		
		try 
		{
			System.out.println("**********  Intput Of Array  *************");
			for(int i=0;i<length;i++)
			{		
				System.out.print("Enter value of "+i+" is..!! ");	
				marks[i]=sc.nextInt();
			}
			System.out.println("**********  Output Of Array  *************");
			for(int i=0;i<length;i++)
			{			
				System.out.println("The value of "+i+" is..!! = "+ marks[i]);	
				
			}	
			System.out.println("**********  Output Of Array Reverse  *************");
			for(int i=0;i<length;i++)
			{			
				System.out.println("The value of "+(length-i)+" is..!! = "+ marks[length-1-i]);	
				
			}	
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{			
			System.out.println("<<<<<< Out of Range >>>>>>>"+ e);			
		}	
		
	}

	
}

