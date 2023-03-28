package FunctionPracticeQuestion;

import java.util.Scanner;

public class OddNumberSum {
	
	public static int oddNum(int n)
	{   int sum=0;
	
	if(n%2==1)
	{
		for(int i=1;i<=n;i++)
		{
			if((i%2)==1)
			{
			   sum =sum+i;			  
			}					
		}
		 System.out.println(sum);
	}
	else if(n<0)
	{
		System.out.println("Negative Number Not allowed");
	}
	else
	{
		System.out.println("Not Odd Number ");
	}		
		return sum;
	}
	
	/*
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the Number");
			int number=sc.nextInt();
			oddNum(number);
		} catch (Exception e) {
			
			System.out.println("OOPS ! Invalid data");
		}		
	}
	*/
}
