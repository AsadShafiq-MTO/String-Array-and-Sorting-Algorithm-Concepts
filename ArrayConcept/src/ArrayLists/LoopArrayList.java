package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
@SuppressWarnings("resource")
public class LoopArrayList {

	public static void main(String[] args) {		
		
		Scanner sc =new Scanner(System.in);	
		System.out.print("Enter the Total Student...!!= ");
		int totalMarks = 1100;
		int length=sc.nextInt();		
		ArrayList<Integer> list =new ArrayList<Integer>();
		System.out.println("The Total marks is = "+totalMarks);
		for(int i=0;i<length;i++)
		{	
			System.out.print("Enter the Student "+(i+1)+" Obtain marks is = ");
			list.add(sc.nextInt());				
		}		
		for(int i=0;i<list.size();i++)
		{	
			if(list.get(i)<=1100 && list.get(i)>=1000)
			{
				System.out.println("The Student "+(i+1)+" marks is = "+list.get(i)+" and grade is 'A+' ");
			}
			else if(list.get(i)<1000 && list.get(i)>=800)
			{
				System.out.println("The Student "+(i+1)+" marks is = "+list.get(i)+" and grade is 'A' ");
			}
			else if(list.get(i)<800 && list.get(i)>=700)
			{
				System.out.println("The Student "+(i+1)+" marks is = "+list.get(i)+" and grade is 'B+' ");
			}
			else if(list.get(i)<700 && list.get(i)>=600)
			{
				System.out.println("The Student "+(i+1)+" marks is = "+list.get(i)+" and grade is 'B' ");
			}
			else if(list.get(i)<600 && list.get(i)>=500)
			{
				System.out.println("The Student "+(i+1)+" marks is = "+list.get(i)+" and grade is 'C' ");
			}
			else if(list.get(i)<500 && list.get(i)>=450)
			{
				System.out.println("The Student "+(i+1)+" marks is = "+list.get(i)+" and grade is 'D' ");
			}
			else
			{
				System.out.println("The Student "+(i+1)+" marks is = "+list.get(i)+" , You are Consider Fail ");
			}						
		}
		
		// Sorting list
		Collections.sort(list);
		System.out.println(list);
		
		// Remove list
		list.removeAll(list);
		System.out.println(list);
		
		// add all
		list.addAll(list);
		System.out.println(list);
		
		// clear
		list.clear();
		System.out.println(list);
		
		
	}
}
