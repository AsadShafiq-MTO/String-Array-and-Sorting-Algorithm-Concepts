package Array;

import java.util.Scanner;

public class SearchGivenNumberArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter the number of size ..!! ");
		int length=sc.nextInt();
		int marks[]=new int[length];
		
		for(int i=0;i<length;i++)
		{				
			System.out.print("Value of "+i+" is ");
			marks[i]= sc.nextInt();
			
		}
		System.out.print("Enter the Search Given Number Array ..!! ");
		int x=sc.nextInt();
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]==x)
		    {
				System.out.println("The value of X is.."+marks[i]+" and index is.. "+i);
				break;
		    }
			else
			{
				System.out.println("OOPS ! Value not Exist");
				break;
			}
	  }
	}
  }
}
