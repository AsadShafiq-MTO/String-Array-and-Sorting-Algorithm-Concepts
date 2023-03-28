package FunctionPracticeQuestion;

import java.util.Scanner;

public class RaisedToPower {

	public static void raisedToPower(int x,int n)
	{
		int raisedToPower=(int) Math.pow(x,n);     // typecast
		System.out.println(raisedToPower);
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		raisedToPower(x, n);
		
	}
}
