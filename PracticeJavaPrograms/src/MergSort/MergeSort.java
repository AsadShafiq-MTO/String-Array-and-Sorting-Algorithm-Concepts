package MergSort;

public class MergeSort {
	
		public void divid(int[] array , int start , int end)
		{
			if(start>=end)
			{
				return;
			}
			
			int mid= start+(end-start)/2;
			divid(array,start,mid);
			divid(array,mid+1,end);
			conquer(array,start,mid,end);
		}
		
		public  void conquer(int[] array, int start, int mid, int end) 
		{
			int[] margedArray=new int[end-start+1];	
			
		  int dvd1=start;
		  int dvd2=mid+1;
		  int x=0;
		  while(dvd1<=mid && dvd2<=end)
		  {
			  if(array[dvd1]<=array[dvd2])
			  {
				  margedArray[x]=array[dvd1];
				  x++;
				  dvd1++;
			  }
			  else
			  {
				  margedArray[x]=array[dvd2];
				  x++;
				  dvd2++;
			  }
		  }
		  while(dvd1<=mid )
		  {
			   margedArray[x]=array[dvd1];
			   x++;
			   dvd1++;
		  }
		  while(dvd2<=end )
		  {
			   margedArray[x]=array[dvd2];
			   x++;
			   dvd2++;
		  }
		  for(int i=0,j=start;i<margedArray.length;i++,j++)
		  {
			  array[j]=margedArray[i];
		  }
			
		}
	}

