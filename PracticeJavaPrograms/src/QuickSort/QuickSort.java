package QuickSort;

public class QuickSort {
		
	public int partition(int[] array,int low,int high)
	{		
		int pivot=array[(low+high)/2];
		while(low<=high)
		{
			while(array[low]<pivot)
			{			
				low++;
			}
			while(array[high]>pivot)
			{
				high--;
			}
			if(low<=high)
			{
				int temp=array[low];
				array[low]=array[high];
				array[high]=temp;
				
				low++;
				high--;
			}
		}
		return low;
	}
	public void quickSort(int[] array,int low,int high)
	{
		int pi=partition(array, low, high);
		if(low<pi-1)
		{
			quickSort(array, low, pi-1);
		}
		if(pi<high)
		{
			quickSort(array, pi, high);
		}
	}
	public void printArray(int[] array)
	{
		for(int element:array)
		{
			System.out.print(element+" ");
		}		
	}
}
