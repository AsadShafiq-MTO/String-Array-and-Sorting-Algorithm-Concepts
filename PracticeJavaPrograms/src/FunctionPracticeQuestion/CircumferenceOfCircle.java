package FunctionPracticeQuestion;

import java.util.Scanner;

public class CircumferenceOfCircle {

	public static float circumferenceOfCircle(float radius)
	{
		float  circumference=(float) (2*Math.PI*radius);
		System.out.println(circumference);
		return circumference;
	}
	
	/*
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		float radius=sc.nextFloat();
		circumferenceOfCircle(radius);
	}
	*/
}
