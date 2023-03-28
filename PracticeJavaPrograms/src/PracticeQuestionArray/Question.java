package PracticeQuestionArray;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
// ***********************************************************************************************************		

		/* 	Q.1 Sum
		float[] array= {34.6f , 76.0f , 44.8f , 78.3f ,33.4f};
		float sum = 0,sum1=0;
		
		System.out.println("Lenthy Approach");
		System.out.println(array[0]+array[1]+array[2]+array[3]+array[4]);
		*/
		
		
		/* 	Q.1 Sum
		float[] array= {34.6f , 76.0f , 44.8f , 78.3f ,33.4f};
		float sum = 0,sum1=0;
		
		System.out.println("By For Loap");
		for(int i=0;i<array.length;i++)
		{
		   sum=sum+array[i];		
		}		
		System.out.println(sum);
		
		System.out.println("By Foreach Loap");
		for(float element:array)
		{
			sum1=sum1+element;
		}
		System.out.println(sum1);
		*/		
		
		
		
		/*  //Q.1 Sum
		int[] marks= {10,20,30,40,50};
		int val=0;
		for(int i=0;i<marks.length;i++)
		{
			val=val+marks[i];
		}
		System.out.println(val);
		*/
		
		
		
		/*  //Q.1 Sum
		float[] marks= {30.90f , 56.9f , 78.4f , 45.3f , 67.5f};
		float sum=0;
		for(float element:marks)
		{
			sum=sum+element;
		}
		System.out.println(sum);
		*/
		
// ***********************************************************************************************************		
		
		
		/*  //Q.2 Search Number with For Loop
		Scanner sc=new Scanner(System.in);
		int [] search= {2,4,6,87,99,55,67};
		for(int i=0;i<search.length;i++)
		{
			System.out.print(search[i]+" ");												
		}
		System.out.print("\nEnter the Search Number...= ");
		int so=sc.nextInt();
		boolean istrue=false;
		for(int i=0;i<search.length;i++)
		{
			if(search[i]==so)
			{
				istrue=true;
				break;
			}									
		}
		if(istrue)
		{
			System.out.println("The number is Exist in this Array");
		}
		else {
			System.out.println("OOPS! The number doesn't Exist ");
		}
		*/
		
		
		
		/* //Q.2 Search Number with Foreach Loop
		Scanner sc=new Scanner(System.in);
		int[] marks= {34,56,70,6,8,9,33,67,87,4,6};
		int search=sc.nextInt();
		boolean isTrue=false;
		for(int value:marks)
		{
			if(search==value)
			{
				isTrue=true;
				break;
			}
		}
		if(isTrue)
		{
			System.out.println("The value is Present");
		}
		else
		{
			System.out.println("The value is Not Present");
		}
		*/
		
		
// ***********************************************************************************************************		
		
		/*  // Q.3 Find Average with For Loop
		int[] marks= {23,56,87,98,90};
		float sum=0;
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
		}
		System.out.println("The average of student marks in physic is ..= "+sum/marks.length);
		*/
		
		
		
		/*  // Q.3 Find Average with Foreach Loop
		float[] array= {34.6f , 76.0f , 44.8f , 78.3f ,33.4f};
		float sum=0;
		for(float avg:array)
		{
			sum=sum+avg;
		}
		System.out.println("The average is "+sum/array.length);
		*/
		
// ***********************************************************************************************************		
		
		
		/*// Q.4 Add two Matrices 2x3
		int[][] mat1= { {2,4,6},
				        {4,6,8} };
		
		int[][] mat2= { {12,34,26},
		                {14,16,28} };
		
		int[][] result= { {0,0,0},
		                  {0,0,0} };
		
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat2[i].length;j++)
			{			
				System.out.format("Value for i=%d  j=%d \n", i,j);
				result[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat2[i].length;j++)
			{			
				System.out.print(result[i][j]+" ");				
			}
			System.out.println(" ");
		}
		*/		
		
// ***********************************************************************************************************		
		
		
		/*//Q.5 Reverse Array User Input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size ");
		int size=sc.nextInt();		
		int[] marks=new int[size];
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();			
		}
		System.out.print("Array values is { ");
		for(int i=0;i<marks.length;i++)
		{
			System.out.print(marks[i] +" ");
			
		}System.out.println("}");
		System.out.print("Array values in Reverse Order is { ");
		for(int i=marks.length-1;i>=0;i--)
		{
			System.out.print(marks[i] +" ");
			
		}System.out.println("}");
		*/
		
		
		
		
		/*  // Q.5 Reverse Array Hard Coded
		int [] marks= {1,2,3,4,5,6};
		int l=marks.length;
		int temp;
		int n=Math.floorDiv(l, 2);
		for(int i=0;i<n;i++)
		{
			temp=marks[i];
			marks[i]=marks[l-i-1];
			marks[l-i-1]=temp;			
		}
		for(int i=0;i<marks.length;i++)
		//for(int element:marks)
		{
			//System.out.print(element+" ");
			System.out.print(marks[i]+" ");
		}
		*/

// ***********************************************************************************************************		
	
		/*  //Q.6 Find Max value with Hard coded (use Math formula ,and For Loop)
		int [] marks= {1,45,78,900,44,33,67};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<marks.length;i++)
		{
		   max=Math.max(max, marks[i]);			
		}		
		System.out.println(max);
		*/
		
		
		
		/* //Q.6 Find Min value with hard coded (use Foreach Loop) 
		int[] marks= {1,34,67,88,98,22,44,5};
		int max=0;
		for(int i=0;i<marks.length;i++)
		{
			if(max<marks[i])
			{
				max=marks[i];
			}
		}
		System.out.println("Minimum number of array is "+max);		
		*/
		
		
		
		
		/*  //Q.6 Find Max value with Hard coded (use Foreach Loop) 
		int [] marks= {1,45,78,900,44,33,67};
		int max=0;
		for(int e:marks)
		{
			if(e>max)
			{
				max=e;
			}
		}			
		System.out.println(max);
        */
		
		
		
		/*  //Q.6 Find Max value with User Define (use For Loop) 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size ");
		int size=sc.nextInt();
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int[] marks=new int[size];
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();			
		}
		System.out.print("Array values is { ");
		for(int i=0;i<marks.length;i++)
		{
			System.out.print(marks[i] +" ");
			
		}System.out.println("}");		
		System.out.print("Maximum  value of Array is { ");
		for(int i=0;i<marks.length;i++)
		{
			max=Math.max(max, marks[i]) ;
			
		}System.out.println(max +" }");
		System.out.print("Minimum  value of Array is { ");
		for(int i=0;i<marks.length;i++)
		{
			min=Math.min(min, marks[i]) ;
			
		}System.out.println(min +" }");
		*/
		
// ***********************************************************************************************************		
	
		/*  //Q.7 Find Min value with hard coded (use Foreach Loop) 
		int[] marks= {1,34,67,88,98,22,44,5};
		int min=marks.length;
		for(int item:marks)
		{
			if(item<min)
			{
				min=item;
			}
		}
		System.out.println("Minimum number of array is "+min);
		*/	
		
		
		
		/*  //Q.7 Find Min value with hard coded (use For Loop) 
		int[] marks= {1,34,67,88,98,8880,22,44,5};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<marks.length;i++)
		{
			if(min>marks[i])
			{
				min=marks[i];
			}
		}
		System.out.println("Minimum number of array is "+min);
		*/
		
		
// ***********************************************************************************************************		
		/*  // Q.7  Check Array Sorted or not
		//int[] marks= {1,34,54,67,88,98,34,55};        // Not sorted
		int[] marks= {1,34,54,67,88,98,224,455};       // sorted
		boolean isSorted=true;	
		for(int i=0;i<marks.length-1;i++)
		{
		   if(marks[i]>marks[i+1])
		   {			   
			   isSorted=false;
			   break;
		   }
		}
		if(isSorted)
		{
			System.out.println("Sorted");
		}
		else
		{
			System.out.println("Not Sorted");
		}
		*/
// **************************************************************************************		
	
		
		/* // Q.8 student marks percentage check 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers of subjects...= ");
		int length=sc.nextInt();
		System.out.println("Enter Total Subjects Marks...= ");
		int totalSubjectMarks=sc.nextInt();
		int[] marks=new int[length];			
		int subjectObtainMarks=0;
		
		
		for(int i=0;i<marks.length;i++)
		{			
			System.out.print("Enter subject "+(i+1)+" Obtain marks is = ");
			marks[i]=sc.nextInt();			
			subjectObtainMarks=subjectObtainMarks+marks[i];
		}		
		System.out.println("total Subjects Marks = "+totalSubjectMarks);
		System.out.println("subject Obtain Marks = "+subjectObtainMarks);
		float percentage=((subjectObtainMarks *100)/totalSubjectMarks);
		System.out.println("Student Obtain Marks percentage = "+percentage);
		*/
		
		
// ******************************************************************************************************		
		
		 /*  // Q. 9 Reverse String		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String marks=sc.nextLine();
		String reverse=" ";
		int length=marks.length();
		for(int i=0;i<length;i++)
		{
			reverse=marks.charAt(i)+reverse;
		}
		System.out.println("The reverse array is = "+reverse);
		System.out.println("The reverse array is = "+reverse.toLowerCase());
		System.out.println("The reverse array is = "+reverse.toUpperCase());
		*/
		
// ********** ********************************************************************************************		
		/*  // Q.10 Duplicate value found
		int[] duplicate= {1,3,45,66,88,1,77,34,67,45,100,100,76,100};		
		for(int i=0;i<duplicate.length;i++)
		{
			for(int j=i+1;j<duplicate.length;j++)
			{
				if(duplicate[i]==duplicate[j])
				{
				System.out.println("Duplicate value is = "+duplicate[i]);
				}
			}				
		}
		*/
		
		
		
		 /* // Q.10 Duplicate value found
		int[] array= {1,3,45,66,88,1,77,34,67,45,100,100,76,100};
		Set<Integer> dupSetNumber= new HashSet<>();
		for(int element :array)
		{
			if(!dupSetNumber.add(element))
			{
				//System.out.println("Duplicate value is = "+dupSetNumber);
				System.out.println("Duplicate value is = "+element);
			}
		}
		*/
		
// ******************************************************************************************************		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
