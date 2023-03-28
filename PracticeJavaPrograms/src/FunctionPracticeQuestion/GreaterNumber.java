package FunctionPracticeQuestion;

import java.util.Scanner;

public class GreaterNumber {

	public static void greaterNumber(int a,int b)
	{
		if(a>b)
		{
			System.out.println("The Number of "+a+" is Greater then Number of "+b);
		}
		else
		{
			System.out.println("The Number of "+b+" is Greater then Number of "+a);
		}
	}
	
	/*
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number");
		int x=sc.nextInt();
		System.out.println("Enter second number");
		int y=sc.nextInt();
		greaterNumber(x,y);
		
	}
	*/
}
