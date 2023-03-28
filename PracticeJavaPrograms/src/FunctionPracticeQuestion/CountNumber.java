package FunctionPracticeQuestion;

import java.util.Scanner;

@SuppressWarnings("resource")
public class CountNumber {
	
	public static void countNumber(int n)
	{
		Scanner sc=new Scanner(System.in);
		int positiveCounter=0 , negativeCounter=0 , zeroCounter=0 , number;
		System.out.println("Enter numbers : ");
		for(int i=0;i<n;i++)
		{
			number=sc.nextInt();
			if(number>0)
			{				
				positiveCounter++;				
			}
			else if(number<0)
			{
				negativeCounter++;
			}
			else 
			{
				zeroCounter++;
			}			
		}
		System.out.println("positive count "+positiveCounter);
		System.out.println("negative count "+negativeCounter);
		System.out.println("zero count "+zeroCounter);	
				
	}	
	
	/*
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number till the user want : ");
		int n=sc.nextInt();
		countNumber(n);
		
	}
	*/
}
