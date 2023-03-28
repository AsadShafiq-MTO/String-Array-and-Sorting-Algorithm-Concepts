package QuickSort;

public class Main {

	public static void main(String[] args) {

 
		int[] array= {1,4,6,9,4,3,45,55,2,90};
		int length=array.length;
		QuickSort qu=new QuickSort();		
		qu.quickSort(array, 0, length-1);
		qu.printArray(array);

	}

}
