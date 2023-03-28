package FunctionPracticeQuestion;

public class InfiniteLoop {

	@SuppressWarnings("unused")
	public static void infiniteLoop()
	{
		// using do-while loop
		int i=0;		
		do 
		{
			System.out.println("Hello");
			i++;			
		}
		while(true); 		
	}
	
	public static void main(String[] args) {		
		
		infiniteLoop();
	}
}
