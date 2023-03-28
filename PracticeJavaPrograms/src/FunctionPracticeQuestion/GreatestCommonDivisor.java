package FunctionPracticeQuestion;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void greatestCommonDivisor(int a,int b)
	{
		int gcd=0;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("The Greatest Common Divisor is : "+gcd);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		greatestCommonDivisor(number1, number2);
	}
}
