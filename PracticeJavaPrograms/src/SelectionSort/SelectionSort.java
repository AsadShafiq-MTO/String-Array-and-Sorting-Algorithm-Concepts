package SelectionSort;

public class SelectionSort {

	public static void main(String[] args) {
		
		//String[] array = {"asad","bilal","rehmat","rehman","imran khan","haleema","faisal"};
		int[] array= {1,2,54,33,66,89,78,44,76};
		
		int temp;       //  OR  (int temp=0;)
		//String temp;  // OR (String temp="";)
		int min;   
		for(int i=0;i<array.length;i++)
		{
			min=i;
			for(int j=i+1;j<array.length;j++)
			{		
				
				//if(array[j].compareTo(array[min])<0)
				if(array[j]<array[min])
					
				{
					min=j;					
				}				
			}
			temp=array[i];
			array[i]=array[min];
			array[min]=temp;			
		}
		System.out.print("The Selection Sort Array is : { ");
		for(int element:array)    // int Replace String
		{
			System.out.print(element +" ");
		}
		System.out.println("}");
		
	}
}
