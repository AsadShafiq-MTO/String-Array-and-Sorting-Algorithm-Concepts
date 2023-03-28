package BubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
		
		// String[] array={"Asad","Shafiq","Rehana","Bilal"};    // with String
		int[] array = {36,78,89,45,67,34,20,33,444444,6544,3333,22223,4445,66666,777,6655,1};
		
		// String temp;
		int temp;
		
		for(int i=0;i<array.length;i++)
		{
			int flag=0;
			for(int j=0;j<array.length-1-i;j++)    /// (-i) not check the last sort value again 
			{
				// if(array[i].compareTo(array[i+1])>0)     // With String					
				if(array[j]>array[j+1])
				{
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		System.out.print("The Bubble Sort Array is : { ");
		for(int element:array)
		{
			System.out.print(element +" ");
		}
		System.out.println("}");
		
	}
}
