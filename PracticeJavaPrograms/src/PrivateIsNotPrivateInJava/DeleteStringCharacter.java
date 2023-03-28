package PrivateIsNotPrivateInJava;

public class DeleteStringCharacter {

	private String deleteStr="";
	
	private DeleteStringCharacter()  // private constructor
	{
		System.out.println("This is a private constructor ");
	}		
	public void deleteChar(String str , char c) 
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=c)
			{
				deleteStr=deleteStr+str.charAt(i);
			}
		}
		System.out.println(deleteStr);
	}
}
