package MergSort;

public class Main {

	public static void main(String[] args) {
		
		int[] array= {1,43,77,5,4,98,34};
		int n=array.length;
		
		MergeSort ms =new MergeSort();
		ms.divid(array, 0, n-1);
		System.out.print("The Merge Sort Array is : { ");
		for(int element:array)			
		{
			System.out.print(element+" ");
		}		
		
//		for(int i=0;i<n;i++)			
//		{
//			System.out.print(array[i]+" ");
//		}
		
		System.out.println("}");
	}
}
