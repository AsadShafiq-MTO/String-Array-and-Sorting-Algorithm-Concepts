package FunctionPracticeQuestion;

import java.util.Scanner;

public class EligibleToVote {

	public static void eligibleVote(int age)
	{
		if(age>18 && age<=120)
		{
			System.out.println("The person is eligible to Vote");
		}
		else if(age<18 && age>0)
		{
			System.out.println("The person is Not eligible to Vote");
		}
		else
		{
			if(age<=0)
			{
				System.out.println("Negative age not allowed");
			}
			else
			{
				System.out.println("Above 120 age not allowed");
			}			
		}
	}
	
	/*
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter person Age :");
			int personAge=sc.nextInt();
			eligibleVote(personAge);
			
		} catch (Exception e) {
			
			System.out.println("invalid Data");
		}		
	}
	*/
	
}
