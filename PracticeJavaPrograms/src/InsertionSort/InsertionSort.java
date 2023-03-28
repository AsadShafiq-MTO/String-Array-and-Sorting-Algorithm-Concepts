package InsertionSort;

public class InsertionSort {

	public static void main(String[] args) {
		
		//String[] array = {"asad","bilal","rehmat","rehman","imran khan","haleema","faisal"};
		int[] array= {1,34,65,78,66,33,22,99};
		
		//String temp;  // OR (String temp="";)
		int temp;
		
		int j;
		
		for(int i=1;i<array.length;i++)
		{
			temp=array[i];			
			j=i;
			
			//while(j>0 && array[j-1].compareTo(temp)>0)
			while(j>0 && array[j-1]>temp)
			{
				array[j]=array[j-1];				
				j--;   //j=j-1;
			}
			array[j]=temp;
									
		}
		System.out.print("The Insertion Sort Array is : { ");
		for(int element:array)    // int Replace String
		{
			System.out.print(element+" ");
		}
		System.out.println("}");
	}
}
