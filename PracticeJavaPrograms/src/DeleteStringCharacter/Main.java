package DeleteStringCharacter;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("*************************** Hard Coded *******************************");

		DeleteStringCharacter t1 =new DeleteStringCharacter();		
	    String str1="My Background is BS-Computer Science";		
		char c1='B';
		t1.deleteChar(str1, c1);
		
		System.out.println("************************** User Define ****************************");
		
		DeleteStringCharacter t =new DeleteStringCharacter();		
		System.out.print("Enter the String = ");
	    String str=sc.nextLine();
		System.out.print("Enter the Delete Character = ");
		char c=sc.nextLine().charAt(0);
		t.deleteChar(str, c);
		
		
	}
}
  



