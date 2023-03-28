package TwoDimentionArray;

import java.util.Scanner;

public class TwoDimentionArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("************************************************************************** ");
		System.out.println("****************** Hard Coded (2-D Array) With integer ******************* ");
		System.out.println("************************************************************************** ");		
		
		int [][] marks=new int[2][6];
		// Row one
		marks[0][0]=200;
		marks[0][1]=210;
		marks[0][2]=220;
		marks[0][3]=230;
		marks[0][4]=240;
		marks[0][5]=250;
		//Row Two
		marks[1][0]=100;
		marks[1][1]=110;
		marks[1][2]=120;
		marks[1][3]=130;
		marks[1][4]=140;
		marks[1][5]=150;		
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
				System.out.print("**"+marks[i][j]+"**");
				System.out.print("  ");
			}
			System.out.println("\n  ");
		}
		System.out.println("***************** Reverse Order Hard Coded Array *********************\n");
		for(int i=marks.length-1;i>=0;i--)
		{
			for(int j=marks[i].length-1;j>=0;j--)
			{
				System.out.print("**"+marks[i][j]+"**");
				System.out.print("  ");
			}
			System.out.println("\n  ");
		}
		System.out.println("************************************************************************** ");
		System.out.println("******************* Hard Coded (2-D Array) Wit String ******************** ");
		System.out.println("************************************************************************** ");		
		
		String [][] marksSt=new String[2][6];
		// Row one
		marksSt[0][0]="Asad";
		marksSt[0][1]="Bilal";
		marksSt[0][2]="Ali";
		marksSt[0][3]="Faisal";
		marksSt[0][4]="Nawaz";
		marksSt[0][5]="khashif";
		//Row Two
		marksSt[1][0]="Ayesha";
		marksSt[1][1]="Minha";
		marksSt[1][2]="Ali Butt";
		marksSt[1][3]="Moeed";
		marksSt[1][4]="Naeem";
		marksSt[1][5]="shahid";		
		for(int i=0;i<marksSt.length;i++)
		{
			for(int j=0;j<marksSt[i].length;j++)
			{
				System.out.print("**"+marksSt[i][j]+"**");
				System.out.print("  ");
			}
			System.out.println("\n  ");
		}
		System.out.println("***************** Reverse Order Hard Coded Array *********************\n");
		for(int i=marksSt.length-1;i>=0;i--)
		{
			for(int j=marksSt[i].length-1;j>=0;j--)
			{
				System.out.print("**"+marksSt[i][j]+"**");
				System.out.print("  ");
			}
			System.out.println("\n  ");
		}
		
		System.out.println("##########################################################################\n");
		System.out.println("************************************************************************** ");
		System.out.println("********************** User Define (2-D Array) *************************** ");
		System.out.println("************************************************************************** ");
		Scanner sc =new Scanner(System.in);	
		System.out.print("Enter Row size = ");
		int row=sc.nextInt();
		System.out.print("Enter Column size =");
		int column=sc.nextInt();
		int [][] marks1=new int [row][column];		
		
		for(int i=0;i<marks1.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Row\n");
			for(int j=0;j<marks1[i].length;j++)
			{				
				marks1[i][j]=sc.nextInt();				
			}			
		}
		System.out.println("*******************************");
		
		for(int i=0;i<marks1.length;i++)
		{
			for(int j=0;j<marks1[i].length;j++)
			{
				
				System.out.print("**"+marks1[i][j]+"**");
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println("***************** Reverse Order User Define Array *********************\n");
		for(int i=marks1.length-1;i>=0;i--)
		{
			for(int j=marks1[i].length-1;j>=0;j--)
			{
				System.out.print("**"+marks1[i][j]+"**");
				System.out.print("  ");
			}
			System.out.println("\n  ");
		}
		System.out.println();
		System.out.println("\s\s \b *********************************************************** \b");
		System.out.println("\s\s \b ********************** End Program ************************ \b");
		System.out.println("\s\s \b *********************************************************** \b");
	}
}
