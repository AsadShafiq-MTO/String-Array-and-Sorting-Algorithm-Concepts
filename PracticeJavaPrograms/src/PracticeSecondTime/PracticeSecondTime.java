package PracticeSecondTime;

public class PracticeSecondTime {     
	
	public static void main(String[] args) {
		
		/*    // Q.1		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of Array = ");
		int length=sc.nextInt();
		float sum=0;
		float[] marks= new float[length];
		for(int i=0;i<marks.length;i++)
		{
			System.out.print("Enter the Subject "+(i+1)+" Marks is = ");
			marks[i]=sc.nextFloat();
			sum=sum+marks[i];
		}
		System.out.println("The sum of the Subjects marks is = "+sum);
		*/
		
		
		/* // Q.2
		Scanner sc=new Scanner(System.in);
		int[] marks= {1,3,5,6,7,98,45,67,44};
		boolean istrue=false;
		System.out.print("Enter the search integer in the array is = ");
		int traverse=sc.nextInt();
		for(int i=0;i<marks.length;i++)
		{
			if(traverse==marks[i])
			{
				istrue=true;
				break;
			}
		}
		if(istrue)
		{
			System.out.println("The given integer "+traverse+" is present in this array ");
		}
		else
		{
			System.out.println("The given integer "+traverse+" is not present in this array");
		}
		*/

		
		/*  // Q.3
		float[] physicsMarks= {34.5f,56.7f,78.8f,55.4f};
		float sum=0;
		for(float element:physicsMarks)
		{
			sum=sum+element;
		}
		System.out.println("The average of student physics marks is "+(sum/physicsMarks.length));
		*/
		
		
		/*   // Q.3              perfect error  resolve
		try 
		{
			Scanner sc=new Scanner(System.in);	
			System.out.print("Enter the number of students = ");
			int numberOfStudents=sc.nextInt();
			if(numberOfStudents>0 )
			{
				float[] physicsMarks=new float[numberOfStudents];
				float sum=0;
				for(int i=0;i<physicsMarks.length;i++)
				{
					System.out.print("Enter the student "+(i+1)+" Marks is = ");
					physicsMarks[i]=sc.nextFloat();	
					sum+=physicsMarks[i];
				}
				System.out.println("The Average of all Students Physics marks is = "+(sum/physicsMarks.length));					
			}
			else if(numberOfStudents==0)
			{
				System.out.println("OOPS ! Zero value not applicable");
			}
			else 
			{
				System.out.println("OOPS ! Negative value not exceptable.. ");
			}				
		} 
		catch (Exception e) 
		{				
				System.out.println("OOPS ! Not exceptable ");				
		}
		*/
		
		
		/*     //Q.4		
		int[][] array1= {{1,3,6},
				         {78,6,5}};
		
		int[][] array2= {{67,4,33},
				         {4,55,10}};
		
		int[][] result={{0,0,0},
		                {0,0,0}};
		
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2[i].length;j++)
			{
				System.out.format("The value for i=%d j=%d \n",i,j);
				result[i][j]=array1[i][j]+array2[i][j];				
			}			
		}
		System.out.println(" ");
		for(int i=0;i<array1.length;i++)
		{ 
			for(int j=0;j<array2[i].length;j++)
			{
				System.out.print(result[i][j] +" ");
			}
			System.out.println(" ");
		}
		*/
		
		
		
		/*   //Q.4
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array row size = ");
        int rowSize=sc.nextInt();
        System.out.print("Enter the array column size = ");
        int columnSize=sc.nextInt();
		int[][] array1= new int[rowSize][columnSize];
		System.out.println("********************************");
		System.out.println("Enter the array 1 values");
		System.out.println("********************************");
		for(int i=0;i<array1.length;i++)
        {
			System.out.println("Enter the row "+(i+1)+" value is = ");
        	for(int j=0;j<array1[i].length;j++)
        	{        		
        		array1[i][j]=sc.nextInt();
        	}
        }
        int[][] array2= new int[rowSize][columnSize];
        System.out.println("********************************");
        System.out.println("Enter the array 2 values");
        System.out.println("********************************");
        for(int i=0;i<array2.length;i++)
        {
			System.out.println("Enter the row "+(i+1)+" value is = ");
        	for(int j=0;j<array2[i].length;j++)
        	{
        		array2[i][j]=sc.nextInt();
        	}
        }
        
        int[][] result={ {0,0,0,0,0}, 
        		         {0,0,0,0,0} };
        
        for(int i=0;i<array1.length;i++)
        {
        	for(int j=0;j<array2[i].length;j++)
        	{
        		System.out.format("The value for i=%d j=%d \n",i,j);
        		result[i][j]=array1[i][j]+array2[i][j];        		
        	}
        }
        System.out.println("The Result of 2D Array is... ");
        for(int i=0;i<array1.length;i++)
        {
        	for(int j=0;j<array2[i].length;j++)
        	{
        		System.out.print(result[i][j] +" ");
        		        		
        	}
        	System.out.println(" ");
        }
        */

      
		/* Q.5
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Array size is = ");
		int length=sc.nextInt();
		int[] array=new int[length];
		for(int i=0;i<array.length;i++)
		{
			System.out.print("Enter the value "+ (i+1)+" is = ");
			array[i]=sc.nextInt();
		}
		System.out.print("The Actual Array is { ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] +" ");
			
		}
		System.out.println("}");
		System.out.print("The Reverse Array is { ");
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i] +" ");
			
		}
		System.out.println("}");
		*/
		
		/* // Q.6
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter The array Size ");
		int length=sc.nextInt();
		int[] marks=new int[length];
		// int min=Integer.MIN_VALUE;  // OR
		int max=0;
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<marks.length;i++)
		{
			if(max<marks[i])
			{
				max=marks[i];
			}
		}
		System.out.println("The max value is = " +max);
		*/

		
		
		/*  // Q.7
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter The array Size ");
		int length=sc.nextInt();
		int[] marks=new int[length];
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<marks.length;i++)
		{
			if(min>marks[i])
			{
				min=marks[i];
			}
		}
		System.out.println("The max value is = " +min);
		*/
		
		
		/* //  Q.8
		int[] marks= {1,3,5,33,55,86};		   // sorted
		//int[] marks= {1,455,3,5,33,55,86};   // un-sorted
		boolean isSort=true;
		for(int i=0;i<marks.length-1;i++)
		{
			if(marks[i]>marks[i+1])
			{
				isSort=false;
				break;
			}
		}
		if(isSort)
		{
			System.out.println("match");
		}
		else
		{
			System.out.println("not match");
		}
		*/
		
		
		/* // Q.9 Reverse String
		String str="hello";
		String reverse="";
		int length=str.length();
		for(int i=0;i<length;i++)
		{
			reverse=str.charAt(i)+reverse;
		}
		System.out.println(reverse);
		*/
		
		
			
	}
}
