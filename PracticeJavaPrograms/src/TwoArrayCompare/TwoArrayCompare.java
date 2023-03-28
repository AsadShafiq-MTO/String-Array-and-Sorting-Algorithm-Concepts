package TwoArrayCompare;

public class TwoArrayCompare {

	public static void main(String[] args) {
		
		// Not Equal Two Array
		//int[] arr1= {1,3,5,8,3};    
		//int[] arr2= {3,8,9,1,5};
		
		       //// OR /////
		
		 // Not Equal Two Array
		//int[] arr1= {1,3,5,8,9,4};
		//int[] arr2= {3,8,9,1,5};
		
	          ////OR /////
		
		// Equal Two Array
		//int[] arr1= {1,3,5,8,9};
		//int[] arr2= {3,8,9,1,5};
		
	         ////OR /////
		
		int[] arr1= {1,3,5,8,5};
		int[] arr2= {3,8,9,1,5};
		
		Array ar=new Array();
		
		if(ar.method(arr1, arr2))
		{
			System.out.println("The Two Array are equal");
		}
		else
		{
			System.out.println("The Two Array are Not equal");
		}		
	}
}


