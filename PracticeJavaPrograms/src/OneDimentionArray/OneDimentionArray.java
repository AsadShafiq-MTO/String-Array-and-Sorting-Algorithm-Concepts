package OneDimentionArray;

import java.util.Scanner;

public class OneDimentionArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("************************************************************************** ");
		System.out.println("****************** Hard Coded (1-D Array) With integer ******************* ");
		System.out.println("************************************************************************** ");		
		
		int [] marks=new int[5];
		
		marks[0]=200;
		marks[1]=210;
		marks[2]=220;
		marks[3]=230;
		marks[4]=240;
		
		for(int i=0;i<marks.length;i++)
		{			
				System.out.print("**"+marks[i]+"**");
				System.out.print("  ");			
		}
		System.out.println("\n***************** Reverse Order Hard Coded Array *********************\n");
		for(int i=marks.length-1;i>=0;i--)
		{			
				System.out.print("**"+marks[i]+"**");
				System.out.print("  ");			
		}
		System.out.println("\n************************************************************************** ");
		System.out.println("******************* Hard Coded (1-D Array) Wit String ******************** ");
		System.out.println("************************************************************************** ");		
		
		String [] marksSt=new String[5];
		// Row one
		marksSt[0]="Asad";
		marksSt[1]="Bilal";
		marksSt[2]="Ali";
		marksSt[3]="Faisal";
		marksSt[4]="Nawaz";		
		//Row Two
		marksSt[0]="waleed";
		marksSt[1]="Mohen";
		marksSt[2]="Dar Butt";
		marksSt[3]="Molvi";
		marksSt[4]="Naeem";		
		for(int i=0;i<marksSt.length;i++)
		{			
				System.out.print("**"+marksSt[i]+"**");
				System.out.print("  ");			
		}		
		System.out.println("\n***************** Reverse Order Hard Coded Array *********************\n");
		for(int i=marksSt.length-1;i>=0;i--)
		{
				System.out.print("**"+marksSt[i]+"**");
				System.out.print("  ");			
		}
		
		System.out.println("\n##########################################################################\n");
		System.out.println("************************************************************************** ");
		System.out.println("******************** User Define (1-D Array) With integer **************** ");
		System.out.println("************************************************************************** ");
		Scanner sc =new Scanner(System.in);	
		System.out.print("Enter the Array Values = ");
		int row=sc.nextInt();		
		int [] marks1=new int [row];		
		
		for(int i=0;i<marks1.length;i++)
		{							
			marks1[i]=sc.nextInt();					
		}
		System.out.println("*******************************");
		
		for(int i=0;i<marks1.length;i++)
		{							
				System.out.print("**"+marks1[i]+"**");
				System.out.print(" ");			
		}
		System.out.println("\n***************** Reverse Order User Define Array *********************\n");
		for(int i=marks1.length-1;i>=0;i--)
		{
				System.out.print("**"+marks1[i]+"**");
				System.out.print("  ");			
		}
		System.out.println("************************************************************************** ");
		System.out.println("********************** User Define (1-D Array) With String *************** ");
		System.out.println("************************************************************************** ");
		Scanner sc1 =new Scanner(System.in);	
		System.out.print("Enter the Array Values = ");
		int row1=sc1.nextInt();		
		String [] marks2=new String[row1]; 
		System.out.println("Length is ...."+marks2.length);
		for(int i=0;i<marks2.length;i++)
		{							
			marks2[i]=sc1.nextLine();				
		}
		System.out.println("*******************************");
		
		for(int i=0;i<marks2.length;i++)
		{							
				System.out.print("**"+marks2[i]+"**");
				System.out.print(" ");			
		}
		System.out.println("\n***************** Reverse Order User Define Array *********************\n");
		for(int i=marks2.length-1;i>=0;i--)
		{
				System.out.print("**"+marks2[i]+"**");
				System.out.print("  ");			
		}
		
		System.out.println("\n\s\s \b *********************************************************** \b");
		System.out.println("\s\s \b ********************** End Program ************************ \b");
		System.out.println("\s\s \b *********************************************************** \b");
	
	}
}
